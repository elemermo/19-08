public class Funcionario {
    protected String nome;
    protected int idade;
    protected double salario;

    public Funcionario(String nome, int idade, double salario) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
    }

    public void apresentarDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salário: R$ " + salario);
    }
}
