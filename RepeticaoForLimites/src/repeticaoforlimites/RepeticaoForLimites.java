/*
 * SLIDE 13 - MOD5 REPETICAO FOR
 * Faça um programa que leia 2 números e imprima todos 
 * os números inteiros existentes entre esses dois números
 */
package repeticaoforlimites;

import java.util.Scanner;

public class RepeticaoForLimites {

    public static void main(String[] args) {
        // Scanner => classe
        // sc => é o nome do objeto
        // new => operador de criação do objeto
        // Scanner(System.in) => construtor da classe
        
        Scanner sc = new Scanner(System.in);
        int limiteI;
        int limiteS;

        System.out.println("Limite inferior: ");
        limiteI = sc.nextInt();

        System.out.println("Limite superior: ");
        limiteS = sc.nextInt();

        for (int i = limiteI; i <= limiteS; i++) {
            System.out.println(i);
        }
        System.out.println("PROGRAMA FINALIZADO");
    }
}
