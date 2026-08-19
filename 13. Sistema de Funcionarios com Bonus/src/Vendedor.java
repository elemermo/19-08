public class Vendedor extends Funcionario {

    public Vendedor(String nome, double salarioBase) {
        super(nome, salarioBase);
    }
    public double calcularBonus() {
        return salarioBase * 0.10;
    }
    public double calcularSalarioFinal() {
        return salarioBase + calcularBonus();
    }
}
