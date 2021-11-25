package aplicacaodowhile;

/*
Fazer um programa para imprimir todos os números
compreendidos entre 1 e 10. Ao final da impressão
dos números, imprimir a soma destes.
- Estrutura de repetição do/while
- Contador
- Acumulador
 */
public class AplicacaoDoWhile {

    public static void main(String[] args) {
        int contador = 1;
        int soma = 0;
        do {
            System.out.println(contador);
            // Contador
            contador = contador + 1;
            // Acumulador
            soma = soma + contador;
        } while (contador <= 10);
        System.out.println("----------");
        System.out.println("A soma é: " + soma);

    }

}
