public class Main {
    public static void main(String[] args) {

        ContaCorrente contaCorrente = new ContaCorrente(1234, "Marya", 1000);

        contaCorrente.depositar(500);
        contaCorrente.sacar(200);

        System.out.println("Saldo Conta Corrente: R$ " + contaCorrente.consultarSaldo());


        ContaPoupanca contaPoupanca = new ContaPoupanca(5678, "Marya", 2000);

        contaPoupanca.depositar(500);
        contaPoupanca.sacar(300);

        System.out.println("Saldo Conta Poupança: R$ " + contaPoupanca.consultarSaldo());
    }
}
