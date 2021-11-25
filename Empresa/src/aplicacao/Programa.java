package aplicacao;

import entidades.Cliente;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cliente c = new Cliente();

        System.out.print("Digite o nome do cliente: ");
        String nome = sc.next();

        System.out.print("Digite a situação do cliente: ");
        int x = sc.nextInt();

        c.setNome(nome);
        //c.setId(x);
        c.setSituacao(x);

        System.out.println("cliente " + c.getNome() + " está " + c.mostrarSitacaoCliente(c.getSituacao()));
    }
}
