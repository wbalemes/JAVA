/*
 * Faça um programa para corrigir uma prova com 10 questões de múltipla escolha
 * fornecidas pelo usuário. As questões devem possuir respostas  de "A" a "D". 
 * Criar um vetor gabarito que deverá ser carregado internamente ao programa. 
 * Ao final da entrada de dados o programa deverá mostrar a nota do usuário/aluno. 
 */
package arrayprova;

import java.util.Scanner;

public class ArrayProva {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char gabarito[] = {'A', 'B'};
        char prova[] = new char[2];

        for (int i = 0; i < 2; i++) {
            System.out.println("informe a resposta da questão [" + (i + 1) + "]");
            prova[i] = Character.toUpperCase(sc.next().charAt(0));

        }
        int nota = 0;

        for (int i = 0; i < 2; i++) {
            if (gabarito[i] == prova[i]) {
                nota = nota + 1;
            }
        }
        System.out.println("");
        System.out.println("a nota do aluno foi " + nota);
        System.out.println("fim da correção!!");
    }

}
