public class Designer extends Funcionario {
    private String ferramenta;

    public Designer(String nome, int idade, double salario, String ferramenta) {
        super(nome, idade, salario);
        this.ferramenta = ferramenta;
    }

    public void criarDesign() {
        System.out.println("Designer trabalhando com " + ferramenta + ".");
    }

    public void apresentarDados() {
        super.apresentarDados();
        System.out.println("Ferramenta: " + ferramenta);
    }
}
