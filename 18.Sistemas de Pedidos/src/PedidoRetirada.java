public class PedidoRetirada extends Pedido {

    public PedidoRetirada(int numero, String cliente, double valorTotal) {
        super(numero, cliente, valorTotal);
    }
    public double calcularFrete() {
        return 0.0;
    }
}
