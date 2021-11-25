/*
 * Faça um programa que receba a temperatura em Celsius
 * em seguida apresente a temperatura em Kelvin  e
 * Fahrenhite correspondentes.
 * Imprima usando "String.Format".
 *
 * Sabendo que: 
 * Fahrenhite = 9 * celsius/5+32;
 * Kelvin = celsius + 273.15
*/
package calculartemperatura;

import java.util.Scanner;

public class CalcularTemperatura 
{    
    public static void main(String[] args)
            
    {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        
        //variaveis
        double celsius, fahre, kelvin;
       
        //entrada de dados
        System.out.print("Informe a temperatura Celsius: ");
        celsius = teclado.nextDouble();
       
        //Processamentos
        fahre = 9.0 * celsius/5+32;
        kelvin = celsius + 273.15;
        
        //Saidas
        System.out.println("Fahrenhite: "+String.format("%.2f", fahre));
        System.out.println("Kelvin: "+String.format("%.2f", kelvin));
	System.out.println("PROGRAMA FINALIZADO!!");
             
    
    }
    
}
