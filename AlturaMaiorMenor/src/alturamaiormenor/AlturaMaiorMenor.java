package alturamaiormenor;

import java.util.Locale;
import java.util.Scanner;


public class AlturaMaiorMenor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double maior = 0;
        double menor = 999;
        double altura;
        String nome;
        String nomemaior = null;
        String nomemenor = null;
        System.out.println("Quem possui a MAIOR e MENOR altura?\n");
        for (int i = 1; i <= 4; i++) {

            System.out.print("Informe o nome: ");
            nome = sc.next();
            System.out.print("Informe a altura em metros. \nEx: 1,50: ");
            altura = sc.nextDouble();
            System.out.println("");

            if (altura > maior) {
                maior = altura;
                nomemaior = nome;
            }
            else if (altura < menor) {
                menor = altura;
                nomemenor = nome;
            }
        }

        System.out.println("A MAIOR altura é de: " + nomemaior + " com " + String.format(Locale.ITALY, "%.2f", maior));
        System.out.println("A MENOR altura é de: " + nomemenor + " com " + String.format(Locale.ITALY, "%.2f", menor));
        System.out.println("___________________________________");
        System.out.println("Fim do teste!!");
        sc.close();
    }
}
