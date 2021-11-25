package tiposdevariaveis;

import javax.swing.JOptionPane;

public class TiposDeVariaveis{   
    
    public static void main(String[] args) {
       
        /*
        int a = 10;
        float b = 10;
        double c = 10;
        String d = "Warley";
        
        System.out.printf("boa noite %.2f \n", b);
        */
        
        float a = 0;
        int b = 0;
        double c = 0;               
                
        String entrada;
        entrada=JOptionPane.showInputDialog("Boa Noite!");
        
       a=Float.parseFloat(entrada);
       System.out.println(entrada);
        
        
        

    }
    
}
