package model;

public class Servico extends Entidade {
    private String adicionarServico;
    private double valor;

    public Servico (String id, String nome, double valor){
        super(id);
        this.adicionarServico = nome;
        this.valor = valor;
    }

    public String getNome() {
        return adicionarServico;
    }


    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return  "Cliente {" +
                "id = '" + getId() + '\'' +
                ", nome = '" + adicionarServico + '\'' +
                ", valor = '" + valor + '\'' +
                '}';
    }
}