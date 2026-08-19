public class Desenvolvedor extends Funcionario {
    private String linguagem;

    public Desenvolvedor(String nome, int idade, double salario, String linguagem) {
        super(nome, idade, salario);
        this.linguagem = linguagem;
    }

    public void programar() {
        System.out.println("Desenvolvedor programando em " + linguagem + ".");
    }

    public void apresentarDados() {
        super.apresentarDados();
        System.out.println("Linguagem: " + linguagem);
    }
}
