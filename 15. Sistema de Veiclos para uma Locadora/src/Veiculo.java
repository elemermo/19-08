public class Veiculo {
    protected String placa;
    protected String modelo;
    protected double valorDiaria;

    public Veiculo(String placa, String modelo, double valorDiaria) {
        this.placa = placa;
        this.modelo = modelo;
        this.valorDiaria = valorDiaria;
    }

    public double calcularLocacao(int dias) {
        return valorDiaria * dias;
    }

    public void apresentarDados() {
        System.out.println("Placa: " + placa);
        System.out.println("Modelo: " + modelo);
        System.out.println("Valor da diária: R$ " + valorDiaria);
    }
}
