public class PedidoExpress extends Pedido {

    public PedidoExpress(int numero, String cliente, double valorTotal) {
        super(numero, cliente, valorTotal);
    }
    public double calcularFrete() {
        return 30.0;
    }
    public double calcularValorFinal() {
        double subtotal = valorTotal + calcularFrete();
        return subtotal + (subtotal * 0.10);
    }
}
