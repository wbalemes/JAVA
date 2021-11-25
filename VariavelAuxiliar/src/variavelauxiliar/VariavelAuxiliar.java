package variavelauxiliar;

import javax.swing.JOptionPane;

public class VariavelAuxiliar {

    public static void main(String[] args) {
        //Declaração de variaveis
        int A, B, aux;
        String entrada;

        //Entrade dados
        entrada = JOptionPane.showInputDialog("Digite o valor da variável A: ");
        A = Integer.parseInt(entrada); // convertendo a entrada String em inteiro
        entrada = JOptionPane.showInputDialog("Digite o valor da variável B: ");
        B = Integer.parseInt(entrada); // convertendo a entrada String em inteiro

        //Processamento
        aux = A;
        A = B;
        B = aux;

        //Saída
        JOptionPane.showMessageDialog(null, "O valor de A é " + A);
        JOptionPane.showMessageDialog(null, "O valor de B é " + B);

    }

}
