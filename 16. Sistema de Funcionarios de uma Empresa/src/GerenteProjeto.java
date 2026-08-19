public class GerenteProjeto extends Funcionario {
    private String projeto;

    public GerenteProjeto(String nome, int idade, double salario, String projeto) {
        super(nome, idade, salario);
        this.projeto = projeto;
    }

    public void gerenciarProjeto() {
        System.out.println("Gerenciando o projeto: " + projeto);
    }

    public void apresentarDados() {
        super.apresentarDados();
        System.out.println("Projeto: " + projeto);
    }
}
