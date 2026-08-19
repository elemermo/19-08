class Pessoa {
    protected String nome;
    protected int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void apresentar() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }
}

class Aluno extends Pessoa {
    private String curso;

    public Aluno(String nome, int idade, String curso) {
        super(nome, idade);
        this.curso = curso;
    }

    public void apresentarAluno() {
        apresentar();
        System.out.println("Curso: " + curso);
    }
}

class Professor extends Pessoa {
    private String disciplina;

    public Professor(String nome, int idade, String disciplina) {
        super(nome, idade);
        this.disciplina = disciplina;
    }

    public void apresentarProfessor() {
        apresentar();
        System.out.println("Disciplina: " + disciplina);
    }
}