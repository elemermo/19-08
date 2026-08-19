public class Main {
    public static void main(String[] args) {

        PedidoNormal normal = new PedidoNormal(
                1,
                "Marya",
                100.00
        );

        PedidoExpress express = new PedidoExpress(
                2,
                "Marya",
                150.00
        );

        PedidoRetirada retirada = new PedidoRetirada(
                3,
                "Marya",
                80.00
        );

        normal.adicionarAoPedido(20.00);
        normal.atualizarStatus("Enviado");

        express.adicionarAoPedido(30.00);
        express.atualizarStatus("Em transporte");

        retirada.atualizarStatus("Pronto para retirada");

        System.out.println("=== PEDIDO NORMAL ===");
        normal.apresentarPedido();

        System.out.println("\n=== PEDIDO EXPRESS ===");
        express.apresentarPedido();

        System.out.println("\n=== PEDIDO RETIRADA ===");
        retirada.apresentarPedido();
    }
}