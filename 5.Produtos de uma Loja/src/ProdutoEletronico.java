public class ProdutoEletronico extends Produto {
    private int garantiaMeses;

    public ProdutoEletronico(int codigo, String nome, double preco, int garantiaMeses) {
        super(codigo, nome, preco);
        this.garantiaMeses = garantiaMeses;
    }

    public void apresentar() {
        System.out.println("Produto Eletrônico");
        System.out.println("Código: " + codigo);
        System.out.println("Nome: " + nome);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Garantia: " + garantiaMeses + " meses");
    }
}
