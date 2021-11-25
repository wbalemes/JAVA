package entidades;

public abstract class Medico {

    protected int crm;
    protected String nome;

    public Medico() {

    }

    public Medico(int crm, String nome) {
        this.crm = crm;
        this.nome = nome;
    }
}
