/*
Esta classe permite criar metodos para as ooperaçoes
basicas da conta do Gambi Bank
 */
package gambibank;

/**
 *
 * @author Prof Alexadre Siqueira @edited by Warley Lemes
 */
public class Conta {

    int numero;
    double saldo = 0;

    double retornarSaldo() {
        return saldo;
    }

    void sacar(double valor) {
        saldo = saldo - valor;
    }

    void depositar(double valor) {
        saldo = saldo + valor;
    }
}
