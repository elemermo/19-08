public class Desenvolvedor extends Funcionario {

    public Desenvolvedor(String nome, double salario) {
        super(nome, salario);
    }

    public double calcularSalario() {
        return salario + 1000;
    }
}
