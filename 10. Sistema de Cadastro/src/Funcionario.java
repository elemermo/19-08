public class Funcionario extends Pessoa {
    private double salario;

    public Funcionario(String nome, int idade, double salario) {
        super(nome, idade);
        this.salario = salario;
    }

    public void apresentarDados() {
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Salário: R$ " + salario);
    }
}
