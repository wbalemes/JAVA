package switchcasecom_if;

import java.util.Scanner;

public class SwitchCaseCom_If {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int op, num1, num2, resultado;

        //Entrada de dados
        System.out.println("Digite um numero: ");
        num1 = entrada.nextInt();
        System.out.println("Digite otro numero: ");
        num2 = entrada.nextInt();

        System.out.println("Soma, subtração e divisão!!!! ");
        System.out.println("(1) Para soma");
        System.out.println("(2) Para subtração");
        System.out.println("(3) Para divisão");

        System.out.println("Digite a sua opção inutil: ");
        op = entrada.nextInt();

        switch (op) {
            case 1:
                resultado = num1 + num2;
                System.out.println("A soma é " + resultado);
                break;

            case 2:
                resultado = num1 - num2;
                System.out.println("A subtração é " + resultado);
                break;

            case 3:
                if (num2 == 0) {
                    System.out.println("Impossível!!!!");
                    break;
                } else {
                    resultado = num1 / num2;
                    System.out.println("A divisão é " + resultado);
                    break;
                }

            default:
                System.out.println("Não existe esse inutil no menu!!!!");
        }

    }

}
