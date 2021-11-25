package testeaprovadoreprovado;

import java.util.Scanner;

/**
 *
 * @author WARLEY LEMES
 */
public class TesteAprovadoReprovado {

    public static void main(String[] args) {

        Scanner tc = new Scanner(System.in);
        int nota;
        int frequencia;
        int participacao;

        System.out.print("Digite a Nota do aluno: ");
        nota = tc.nextInt();
        
        System.out.print("Digite frequência do aluno: ");
        frequencia = tc.nextInt();
        
        System.out.print("Digite a participação do aluno: ");
        participacao = tc.nextInt();

        if (nota >= 7 && frequencia >= 75 && participacao >= 5) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");

            tc.close();

        }

    }
}
