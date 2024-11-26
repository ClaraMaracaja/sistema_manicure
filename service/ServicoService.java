package service;

import model.Servico;
import java.util.ArrayList;

public class ServicoService {
    private ArrayList<Servico> servicos;

    public ServicoService() {
        servicos = new ArrayList<>();
    }

    public void adicionarServico(Servico servico) {
        servicos.add(servico);
    }

    public ArrayList<Servico> listarServicos() {
        return servicos;
    }
}
