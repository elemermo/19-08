public class Gerente extends Funcionario {

    public Gerente(String nome, double salarioBase) {
        super(nome, salarioBase);
    }
    public double calcularBonus() {
        return salarioBase * 0.20;
    }
    public double calcularSalarioFinal() {
        return salarioBase + calcularBonus();
    }
}
