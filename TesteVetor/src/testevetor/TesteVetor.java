/*
faça um programa que verifique as 
notas de 03 alunos e mostre 
reprovado para quem 
obtiver nota inferior a 7.
O programa deve mostrar o 
nome e nota dos alunos aprovados e reprovados.
 */
package testevetor;

import java.util.Scanner;

public class TesteVetor {

    public static void main(String[] args) {
//declaração do vetor e variaveis
        float nota[] = new float[3];
        String nome[] = new String[3];
        Scanner sc = new Scanner(System.in);

//processamento do vetor
        for (int i = 0; i<3; i++) {
            System.out.println("Digite o nome do aluno: ");
            nome[i] = sc.next();

            System.out.println("Digite a nota do aluno: ");
            nota[i] = sc.nextFloat();
        }
//saida de dados
        for (int i = 0; i < nota.length; i++) {

            if (nota[i] >= 7) {
                System.out.println("Aprovado: " + nome[i] + " com a nota " + nota[i]);
            } else {
                System.out.println("Reprovado: " + nome[i] + " com a nota " + nota[i]);
            }
        }
    }
}
