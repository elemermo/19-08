public class Main {
    public static void main(String[] args) {

        Gerente gerente = new Gerente(
                "Carlos",
                5000
        );

        Vendedor vendedor = new Vendedor(
                "João",
                3000
        );

        Tecnico tecnico = new Tecnico(
                "Pedro",
                2500
        );

        gerente.apresentarDados();
        System.out.println();

        vendedor.apresentarDados();
        System.out.println();

        tecnico.apresentarDados();
    }
}