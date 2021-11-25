package entidades;

public class Cliente {
//variaveis da classe
    private int id;
    private String nome;
    private int situacao;

//Metodos
    public String mostrarSitacaoCliente(int sit) {
        String mensagem = "";
        if (sit == 1) {
            mensagem = "Normal";
        } else if (sit == 2) {
            mensagem = "Prospect";
        } else {
            mensagem = "inadimplente";
        }
        return mensagem;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getSituacao() {
        return situacao;
    }

    public void setSituacao(int situacao) {
        this.situacao = situacao;
    }
    

}
