package model;

public abstract class Entidade {
    protected String id;


    public Entidade(String id){
        this.id = id;
    }

    public String getId(){
        return id;
    }
    @Override
    public String toString() {
        return "Entidade{id='"+ id + "'}";
    }
}