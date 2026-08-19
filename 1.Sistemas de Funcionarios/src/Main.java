public class Main {
    public static void main(String[] args) {

        Aluno aluno = new Aluno("Marya", 17, "Administração");
        Professor professor = new Professor("Ricardo", 35, "Programação");

        System.out.println("ALUNO");
        aluno.apresentarAluno();

        System.out.println("\nPROFESSOR");
        professor.apresentarProfessor();
    }
}