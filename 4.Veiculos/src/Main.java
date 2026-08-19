public class Main {
    public static void main(String[] args) {

        Carro carro = new Carro("Toyota", "Corolla", 2023, 4);
        Moto moto = new Moto("Honda", "CG 160", 2024, "Elétrica");

        carro.apresentar();

        System.out.println();

        moto.apresentar();
    }
}
