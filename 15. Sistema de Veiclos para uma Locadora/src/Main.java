public class Main {
    public static void main(String[] args) {

        Carro carro = new Carro("ABC-1234", "Onix", 100);
        Moto moto = new Moto("DEF-5678", "Honda CG", 60);
        SUV suv = new SUV("GHI-9012", "Jeep Compass", 180);

        int dias = 5;

        System.out.println("=== CARRO ===");
        carro.apresentarDados();
        System.out.println("Valor da locação: R$ " + carro.calcularLocacao(dias));

        System.out.println("\n=== MOTO ===");
        moto.apresentarDados();
        System.out.println("Valor da locação: R$ " + moto.calcularLocacao(dias));

        System.out.println("\n=== SUV ===");
        suv.apresentarDados();
        System.out.println("Valor da locação: R$ " + suv.calcularLocacao(dias));
    }
}