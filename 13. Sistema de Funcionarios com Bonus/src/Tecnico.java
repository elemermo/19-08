public class Tecnico extends Funcionario {

    public Tecnico(String nome, double salarioBase) {
        super(nome, salarioBase);
    }
    public double calcularBonus() {
        return salarioBase * 0.05;
    }
    public double calcularSalarioFinal() {
        return salarioBase + calcularBonus();
    }
}