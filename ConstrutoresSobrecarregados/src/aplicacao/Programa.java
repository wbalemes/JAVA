package aplicacao;

import entidades.Medico;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);

        System.out.println("INFORME O CRM: ");
        int crm = tc.nextInt();

        System.out.println("INFORME O NOME: ");
        String nome = tc.next();

        System.out.println("INFORME O SALARIO: ");
        double salario = tc.nextDouble();

        /*
        cria o objeto da classe Medico
         com os parametros
        */
        
        Medico medico = new Medico(crm, nome, salario);
        System.out.println(medico.toString());
       
        tc.close();
    }

}
