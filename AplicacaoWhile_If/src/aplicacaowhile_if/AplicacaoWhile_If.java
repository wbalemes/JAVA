/*
Fazer um programa para receber um número indeterminado de
notas de alunos. Ao final da entrada de dados imprimir a soma e a 
média das notas. O programa deverá ser finalizado para uma nota
igual a -1 (que não entrará nos cálculos).
- Estrutura de repetição while
- flag
 */
package aplicacaowhile_if;

import java.util.Scanner;

public class AplicacaoWhile_If {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double nota = 0;
        double soma = 0, media = 0;
        int quantidade = 0;
        
        System.out.println("Informe a nota (-1 finaliza): ");
        nota = sc.nextDouble();
        while (nota != -1) {
            quantidade = quantidade + 1;
            soma = soma + nota;
            System.out.println("Informe a nota: ");
            nota = sc.nextDouble();
        }
        if (quantidade > 0) {
            media = soma / quantidade;
            System.out.println("Soma: " + String.format("%.2f", soma));
            System.out.println("Média: " + String.format("%.2f", media));
        }
        System.out.println("\nPROGRAMA FINALIZADO!");
        
        sc.close();
    }

}
