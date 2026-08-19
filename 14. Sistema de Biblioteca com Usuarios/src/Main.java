public class Main {
    public static void main(String[] args) {

        Aluno aluno = new Aluno("Marya");
        Professor professor = new Professor("Carlos");
        FuncionarioBiblioteca funcionario =
                new FuncionarioBiblioteca("Ana");

        System.out.println("=== ALUNO ===");
        aluno.realizarEmprestimo();
        aluno.realizarEmprestimo();
        System.out.println("Limite: " + aluno.limiteEmprestimos());

        System.out.println();

        System.out.println("=== PROFESSOR ===");
        professor.realizarEmprestimo();
        professor.realizarEmprestimo();
        System.out.println("Limite: " + professor.limiteEmprestimos());

        System.out.println();

        System.out.println("=== FUNCIONÁRIO ===");
        funcionario.realizarEmprestimo();
        funcionario.realizarEmprestimo();
        System.out.println("Limite: " +
                funcionario.limiteEmprestimos());

        funcionario.devolverLivro();
    }
}
