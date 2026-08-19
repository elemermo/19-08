public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente(
                "Marya",
                17,
                5000
        );

        Funcionario funcionario = new Funcionario(
                "Carlos",
                35,
                3500
        );


        System.out.println("=== CLIENTE ===");
        cliente.apresentarDados();

        System.out.println();

        System.out.println("=== FUNCIONÁRIO ===");
        funcionario.apresentarDados();
    }
}