public class ContaPoupanca extends ContaBancaria {

    public ContaPoupanca(int numero, String titular, double saldo) {
        super(numero, titular, saldo);
    }

    @Override
    public void sacar(double valor) {
        if (saldo - valor >= 0) {
            saldo -= valor;
        } else {
            System.out.println("A conta poupança não pode ficar negativa.");
        }
    }
}
