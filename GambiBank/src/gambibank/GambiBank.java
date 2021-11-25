/*
Welcome to Gambi Bank!!
 */
package gambibank;

import java.util.Scanner;

/**
 *
 * @author Prof Alexadre Siqueira @edited by Warley Lemes
 */
public class GambiBank {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double valor;
        Conta gambi;
        int opcao;

        gambi = new Conta();

        System.out.printf("Saldo da conta: R$ " + "%.2f \n", gambi.retornarSaldo());

        do {
            System.out.println("Digite uma opção de operação");
            System.out.println("(1) Depositar");
            System.out.println("(2) Sacar");
            System.out.println("(3) Sair");
            System.out.print("Opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Informe o valor do depósito: ");
                    valor = sc.nextDouble();

                    gambi.depositar(valor);
                    System.out.printf("Saldo da conta: R$ " + "%.2f \n\n", gambi.retornarSaldo());
                    break;
                case 2:
                    System.out.print("Informe o valor do saque: ");
                    valor = sc.nextDouble();

                    gambi.sacar(valor);
                    System.out.printf("Saldo da conta: R$ " + "%.2f \n\n", gambi.retornarSaldo());
                    break;

                case 3:
                    System.out.println("Obrigado por usar os serviços do Gambi Bank!!");
                    break;

                default:
                    System.out.println("Opção Inválida!!");
            }
        } while (opcao != 3);

    }
}
