package divisaomedia;

import java.util.Scanner;

public class DivisaoMedia {

    public static void main(String[] args) {
        //variaveis
        Scanner tc = new Scanner(System.in);
        double nota1, nota2, media;

        System.out.print("Informe a Nota 1: ");
        nota1 = tc.nextDouble();

        System.out.print("Informe a Nota 2: ");
        nota2 = tc.nextDouble();

        media = (nota1 + nota2) / 2;

        System.out.println("A media é "+String.format("%.2f", media));

        if (media >= 7) {
            System.out.println("Aprovado!");
        } else {
            System.out.println("Reprovado!");
        }
    }
}
