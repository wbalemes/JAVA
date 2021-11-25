/*
* Calcula a qtd. aproximada de dias vividos a aprtir da idade fornecida 
* pelo usuario
*/
package diasvividos;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class DiasVividos {
    
    public static void main(String[] args) {
     // variaveis
      String nome;
      int idade;
      int diasVividos;
     
      // input de dados
      nome = JOptionPane.showInputDialog("Informe o nome: ","nome e sobrenome");
      idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade: "));
      diasVividos = idade * 365;
     
      JOptionPane.showMessageDialog(null, nome+", você viveu aproximadamente "+diasVividos+" dias",
              "DIAS VIVIDOS", JOptionPane.INFORMATION_MESSAGE);
      
      JTextArea saida = new JTextArea (10,22);
      JScrollPane scroll = new JScrollPane(saida);
                
        saida.append("DIAS VIVIDOS\n");
        saida.append("-----------------------------------------\n");
	//saida.append("\n");
	saida.append("Este programa calcula a\n");
	saida.append("quantidade aproximada de\n");
	saida.append("dias vividos.\n");
	saida.append("Nome: "+nome+"\n");
	saida.append("Idade: "+idade+"\n");
	saida.append("Dias Vividos: "+diasVividos+"\n");
	saida.append("------------------------------------------\n");
		
	JOptionPane.showMessageDialog(null, scroll, "RESUMO", JOptionPane.INFORMATION_MESSAGE);
		
	System.out.println("Programa Finalizado . . .");     
           
        
    }
    
}
