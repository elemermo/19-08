public class Aluno extends Usuario {

    public Aluno(String nome) {
        super(nome);
    }
    public int limiteEmprestimos() {
        return 3;
    }
}
