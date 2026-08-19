public class Main {
    public static void main(String[] args) {

        Desenvolvedor desenvolvedor = new Desenvolvedor(
                "Carlos",
                25,
                4500,
                "Java"
        );

        Designer designer = new Designer(
                "Ana",
                28,
                4000,
                "Photoshop"
        );

        GerenteProjeto gerente = new GerenteProjeto(
                "João",
                35,
                7000,
                "Sistema Escolar"
        );

        System.out.println("=== DESENVOLVEDOR ===");
        desenvolvedor.apresentarDados();
        desenvolvedor.programar();

        System.out.println("\n=== DESIGNER ===");
        designer.apresentarDados();
        designer.criarDesign();

        System.out.println("\n=== GERENTE DE PROJETO ===");
        gerente.apresentarDados();
        gerente.gerenciarProjeto();
    }
}