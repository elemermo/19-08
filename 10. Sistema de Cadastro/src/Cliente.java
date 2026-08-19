public class Cliente extends Pessoa {
    private double limiteCredito;

    public Cliente(String nome, int idade, double limiteCredito) {
        super(nome, idade);
        this.limiteCredito = limiteCredito;
    }

    public void apresentarDados() {
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Limite de crédito: R$ " + limiteCredito);
    }
}
