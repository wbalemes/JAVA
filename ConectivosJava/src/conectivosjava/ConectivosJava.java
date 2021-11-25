package conectivosjava;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class ConectivosJava {

    public static void main(String[] args) {
        //Declaração de variáveis
        double num;
        String entrada;

        //Entrada de dados
        entrada = JOptionPane.showInputDialog("Digite um número Inutil!!!!");
        num = Double.parseDouble(entrada);

        //Processamento
        if (num >= 5 && num <= 10) {
            JOptionPane.showMessageDialog(null, "Válido!!!");
        } else {
            JOptionPane.showMessageDialog(null, "Não válido!!!");
        }

    }

}
