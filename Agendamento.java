package model;

import java.time.LocalDateTime;
public class Agendamento extends Entidade {
    private Cliente cliente;
    private Servico servico;
    private LocalDateTime dataHora;

    public Agendamento(String id, Cliente cliente, Servico servico, LocalDateTime dataHora){
        super(id);
        this.cliente = cliente;
        this.servico = servico;
        this.dataHora = dataHora;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public Servico getServico() {
        return servico;
    }


    @Override
    public String toString() {
        return "Agendamento{" +
                "id='" + getId() + '\'' +
                ", cliente=" + cliente +
                ", servico=" + servico +
                ", dataHora=" + dataHora +
                '}';
    };
}