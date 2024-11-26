package service;

import model.Agendamento;

import java.util.ArrayList;

public class AgendamentoService {
    private ArrayList<Agendamento> agendamentos;

    public AgendamentoService() {
        agendamentos = new ArrayList<>();
    }

    public void agendar(Agendamento agendamento) {
        agendamentos.add(agendamento);
    }

    public ArrayList<Agendamento> listarAgendamentos() {
        return agendamentos;
    }
}
