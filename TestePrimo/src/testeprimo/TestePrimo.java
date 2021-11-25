package testeprimo;

import java.util.Scanner;

/**
 *
 * @author WARLEY LEMES
 */
public class TestePrimo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num1, resto = 0, cont = 0, aux, aux1;

        System.out.println("Prgrama para vericiar se o numero é primo");
        System.out.println("-----------------------------------------");
        System.out.println("Digie um número seu vagabundo!!!!!");
        num1 = entrada.nextInt();

        for (int i = 1; i <= num1; i++) {
            resto = num1 % i;

            if (resto == 0) {
                cont = cont + 1;
            }
        }
        if (cont == 2) {
            System.out.println("Numero é Primo");

        } else {
            System.out.println("Não é primo");
        }
    }
}
