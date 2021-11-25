package soma30082021cverino;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Soma30082021Cverino {

    public static void main(String[] args) {

        int n1, n2, antecessor;

        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um nº: "));
        antecessor = n1 - 1;

        JOptionPane.showMessageDialog(null, "Antecessor é: " + antecessor);

        /* Scanner teclado = new Scanner(System.in);
        *int n1, antecessor;
        *System.out.print("Digite o Valor: ");
        *n1 = teclado.nextInt();
        *antecessor = n1-1;
        *System.out.println("O antecessor é "+antecessor);
         */
    }

}
