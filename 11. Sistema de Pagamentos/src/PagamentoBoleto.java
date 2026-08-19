public class PagamentoBoleto extends Pagamento {

    public PagamentoBoleto(double valor, String data, String descricao) {
        super(valor, data, descricao);
    }
    public void processarPagamento() {
        System.out.println("Pagamento realizado via Boleto.");
        System.out.println("Valor: R$ " + valor);
    }
}
