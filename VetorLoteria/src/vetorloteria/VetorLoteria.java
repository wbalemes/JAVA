/*
 * Faça um programa para solicitar os 6 números de um jogo 
 * de um concurso de loteria (números do cartão que jogou). 
 * Ao final da entrada de dados o programa deverá imprimir 
 * a quantidade de pontos que ele fez. OBSERVAÇÃO: O vetor 
 * “resultado” (resultado do jogo) deve ser carregado 
 * internamente no programa.
 */
package vetorloteria;

import java.util.Scanner;

public class VetorLoteria {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Criando um vetor de inteiros de 6 posições
        // atribuindo valores para cada posição
        int resultado[] = {5, 10, 17, 27, 32, 37};
        //                 0,  1,  2,  3,  4,  5,
        /*
		 * OUTRA FORMA DE CARREGAR O VETOR RESULTADO
		int resultado[];
		resultado = new int[6];
		resultado[0] = 5;
		resultado[1] = 10;
		resultado[2] = 17;
		...
         */

        // Cria o vetor jogo com 6 posiçoes		
        int jogo[] = new int[6];

        // Carregar o vetor
        for (int i = 0; i < resultado.length; i++) {
            System.out.println("Informe o número [" + (i + 1) + "]:");
            jogo[i] = sc.nextInt();
        }

        //Apuração
        int pontos = 0;
        for (int i = 0; i < resultado.length; i++) {
            for (int j = 0; j < resultado.length; j++) {
                if (resultado[i] == jogo[j]) {
                    pontos = pontos + 1;
                }
            }
        }

        // Mostra o resultado final
        if (pontos == 0) {
            System.out.println("Você fez \"zero\" pontos");

        } else if (pontos > 0 && pontos < 6) {
            System.out.println("\nVocê fez: " + pontos + " pontos");

        } else {
            System.out.println("\nVocê fez a SENA ☺♣ com " + pontos + " pontos. Parabéns!!");
        }
        sc.close();

        /*  
		jogo[]  
		+-----+-----+-----+-----+-----+----+
		|   5 |  10 | 17  | 20  | 33  | 38 | 
		+-----+-----+-----+-----+-----+----+
		   0     1     2     3     4     5
		  
		resultado[]  
		+-----+-----+-----+-----+-----+----+
		|  5  | 10  |  17 |  27 |  32 | 37 |
		+-----+-----+-----+-----+-----+----+
		   0     1     2     3     4    5
         */
        // Homogêneas => String, int, double
        // 
    }

}
