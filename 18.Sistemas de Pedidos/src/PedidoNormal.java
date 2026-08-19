public class PedidoNormal extends Pedido {

    public PedidoNormal(int numero, String cliente, double valorTotal) {
        super(numero, cliente, valorTotal);
    }
    public double calcularFrete() {
        return 20.0;
    }
}
