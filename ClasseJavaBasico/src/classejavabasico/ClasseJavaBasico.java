package classejavabasico;

public class ClasseJavaBasico {

    public static void main(String[] args) {

        int soma;
        Calculadora calc = new Calculadora();

        soma = calc.adicao(10, 10);
        System.out.println("soma é: " + soma);

        int sub;
        sub = calc.subtracao(10, 5);
        System.out.println("subtração é: " + sub);
        
         int div;
        div = calc.divisao(12, 0);
        System.out.println("divisão é: " + div);
    }

}
