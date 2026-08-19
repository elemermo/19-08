public class Main {
    public static void main(String[] args) {

        Aluno aluno = new Aluno("Marya", 17, "Administração", 8.0, 9.0);

        System.out.println("Média do aluno: " + aluno.calcularMedia());


        Professor professor = new Professor(
                "Carlos",
                35,
                "Programação",
                3500
        );

        professor.apresentarDados();
    }
}
