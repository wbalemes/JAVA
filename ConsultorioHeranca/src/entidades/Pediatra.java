package entidades;

public class Pediatra extends Medico {

    private String especialidade;

    public Pediatra() {

    }

    public Pediatra(String especialidade, int crm, String nome) {
        super(crm, nome);
        this.especialidade = especialidade;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    @Override
    public String toString() {
        return "\nDADOS DO PEDIATRA"
                + "\nCRM..........: " + crm
                + "\nNOME.........: " + nome
                + "\nESPECIALIDADE: " + especialidade;
    }
}
