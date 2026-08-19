public class PagamentoCartao extends Pagamento {

    public PagamentoCartao(double valor, String data, String descricao) {
        super(valor, data, descricao);
    }
    public void processarPagamento() {
        System.out.println("Pagamento realizado via Cartão.");
        System.out.println("Valor: R$ " + valor);
    }
}
