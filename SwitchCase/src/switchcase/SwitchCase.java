package switchcase;

import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args) {
        //Declaração de  variaveis 
        Scanner entrada = new Scanner(System.in);
        int op = 0;

        //Entrada de dados
        System.out.println("Boa noite para os inuteis!!!! ");
        System.out.println("(1) Para Marcos");
        System.out.println("(2) Para Miguel");
        System.out.println("(3) Para Yago");
        System.out.println("(4) Para Duro");
        System.out.println("Digite a sua opção inutil: ");
        op = entrada.nextInt();
        if (op == 1) {
            System.out.println("Boa noite Marcos!!!");
        }
        switch (op) {
            case 1:
                System.out.println("Boa noite Marcos!!!");
                break;
            case 2:
                System.out.println("Boa noite Miguel!");
                break;
            case 3:
                System.out.println("Boa noite Yago!!!!");
                break;
            case 4:
                System.out.println("Boa noite Duro!!!!");
                break;
            default:
                System.out.println("Não existe esse inutil no menu!!!!");
        }
    }
}
