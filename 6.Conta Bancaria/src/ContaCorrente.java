public class ContaCorrente extends ContaBancaria {

    public ContaCorrente(int numero, String titular, double saldo) {
        super(numero, titular, saldo);
    }
    public void sacar(double valor) {
        if (valor <= saldo + 500) {
            saldo -= valor;
        } else {
            System.out.println("Limite da conta corrente excedido.");
        }
    }
}
