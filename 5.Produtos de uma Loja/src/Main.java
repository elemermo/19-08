public class Main {
    public static void main(String[] args) {

        ProdutoEletronico eletronico =
                new ProdutoEletronico(101, "Notebook", 3500.00, 12);

        ProdutoAlimenticio alimento =
                new ProdutoAlimenticio(102, "Biscoito", 6.50, "20/12/2026");

        eletronico.apresentar();

        System.out.println();

        alimento.apresentar();
    }
}
