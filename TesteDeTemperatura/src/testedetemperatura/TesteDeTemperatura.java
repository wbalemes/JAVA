package testedetemperatura;

import java.util.Scanner;

public class TesteDeTemperatura {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float temp = 0;
        int inf = 0, entre = 0, sup = 0;
        int cont = 1;

        do {
            System.out.println("Digite um valor de temperatura: ");
            temp = teclado.nextFloat();

            if (temp < 18) {
                inf = inf + 1;
            } else if (temp >= 18 && temp <= 30) {
                entre = entre + 1;
            } else {
                sup = sup + 1;
            }

            cont = cont + 1;

        } while (cont <= 10);
        System.out.println("O número de temperaturas inferior a 18ºc é: " + inf);
        System.out.println("O número de temperaturas entre 18ºc e 30ºc é: " + entre);
        System.out.println("O número de temperaturas superior a 30ºc é: " + sup);

        teclado.close();
    }
}
