public class Main {
    public static void main(String[] args) {

        PagamentoPix pix = new PagamentoPix(
                100.00,
                "19/08/2026",
                "Compra"
        );

        PagamentoCartao cartao = new PagamentoCartao(
                250.00,
                "19/08/2026",
                "Eletrônicos"
        );

        PagamentoBoleto boleto = new PagamentoBoleto(
                150.00,
                "19/08/2026",
                "Conta"
        );

        pix.processarPagamento();
        System.out.println();

        cartao.processarPagamento();
        System.out.println();

        boleto.processarPagamento();
    }
}