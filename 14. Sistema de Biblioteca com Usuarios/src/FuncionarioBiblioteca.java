public class FuncionarioBiblioteca extends Usuario {

    public FuncionarioBiblioteca(String nome) {
        super(nome);
    }
    public int limiteEmprestimos() {
        return 10;
    }
}
