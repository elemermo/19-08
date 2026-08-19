public class Main {
    public static void main(String[] args) {

        Aluno aluno = new Aluno("Marya", 17);

        Professor professor = new Professor("Carlos", 35);

        Livro livro = new Livro(
                "O Pequeno Príncipe",
                "Antoine de Saint-Exupéry",
                1943
        );

        System.out.println("Tentando emprestar o livro:");
        livro.emprestar();

        System.out.println("Tentando emprestar novamente:");
        livro.emprestar();

        System.out.println("Devolvendo o livro:");
        livro.devolver();

        System.out.println("Livro disponível novamente.");
    }
}
