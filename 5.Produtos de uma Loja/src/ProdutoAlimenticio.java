public class ProdutoAlimenticio extends Produto {
    private String dataValidade;

    public ProdutoAlimenticio(int codigo, String nome, double preco, String dataValidade) {
        super(codigo, nome, preco);
        this.dataValidade = dataValidade;
    }

    public void apresentar() {
        System.out.println("Produto Alimentício");
        System.out.println("Código: " + codigo);
        System.out.println("Nome: " + nome);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Data de validade: " + dataValidade);
    }
}
