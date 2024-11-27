package model;

public class Cliente extends Entidade {
    private String nome;
    private String telefone;

    public Cliente(String id, String nome, String telefone) {
        super(id);
        this.nome = nome;
        this.telefone = telefone;
    }


    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    @Override
    public String toString() {
        return "Cliente {" +
                "id = '" + getId() + '\'' +
                ", nome = '" + nome + '\'' +
                ", telefone = '" + telefone + '\'' +
                '}';
    }
}
