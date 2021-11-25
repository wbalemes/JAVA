package aplicacao;

import entidades.Pediatra;

public class Programa {

    public static void main(String[] args) {
        int crm = 320;
        String nome = "zeus";
        String especialidade = "Pediatra";
        nome = nome.toUpperCase();

        Pediatra warley = new Pediatra (especialidade, crm, nome);
        warley.setEspecialidade(especialidade);

        System.out.println(warley.toString());
    }
}
