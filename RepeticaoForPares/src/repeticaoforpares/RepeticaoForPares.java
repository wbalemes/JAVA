/*
slide 8 - Mod 5 - repeticao "for"
faça um programa que imprima os
numeros pares de 1 a 10 em sequencia
 */
package repeticaoforpares;

public class RepeticaoForPares {
    // int i=1 => cria e inicializa a variável de controle
    // i<=10 => condição
    // i++ (i=i+1) => contador		
    // Para i=1 até 10 faça
    // comandos

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            // numero / 2 => resultado
            // numero % 2 => calcula o resto da divisão
            // % operador "mod"

            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        System.out.println("PROGRAMA FINALIZADO!!");
    }
}
