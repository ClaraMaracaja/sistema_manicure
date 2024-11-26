package service;
import model.Cliente;

import java.util.ArrayList;

public class ClienteService {
    private ArrayList<Cliente> clientes;

    public ClienteService() {
        clientes = new ArrayList<>();
    }

    public void adicionarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public ArrayList<Cliente> listarClientes() {
        return clientes;
    }
}