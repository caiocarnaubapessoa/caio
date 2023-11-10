import java.util.ArrayList;
import java.util.List;

class Aluno {
    private String nome;
    private List<Disciplina> disciplinas;

    public Aluno(String nome) {
        this.nome = nome;
        this.disciplinas = new ArrayList<>();
    }

    public void adicionarDisciplina(Disciplina disciplina) {
        disciplinas.add(disciplina);
    }

    public void imprimir() {
        System.out.println("Aluno: " + nome);
    }
}

class Curso {
    private String nome;
    private List<Disciplina> disciplinas;

    public Curso(String nome) {
        this.nome = nome;
        this.disciplinas = new ArrayList<>();
    }

    public void adicionarDisciplina(Disciplina disciplina) {
        disciplinas.add(disciplina);
    }

    public void imprimir() {
        System.out.println("Curso: " + nome);
    }
}

class Professor {
    private String nome;
    private List<Disciplina> disciplinas;

    public Professor(String nome) {
        this.nome = nome;
        this.disciplinas = new ArrayList<>();
    }

    public void adicionarDisciplina(Disciplina disciplina) {
        disciplinas.add(disciplina);
    }

    public void imprimir() {
        System.out.println("Professor: " + nome);
    }
}

class Disciplina {
    private String nome;
    private List<Aluno> alunos;
    private List<Curso> cursos;
    private Professor professor;

    public Disciplina(String nome, Professor professor) {
        this.nome = nome;
        this.alunos = new ArrayList<>();
        this.cursos = new ArrayList<>();
        this.professor = professor;
    }

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void adicionarCurso(Curso curso) {
        cursos.add(curso);
    }

    public void imprimir() {
        System.out.println("Disciplina: " + nome);
    }
}

public class Main {
    public static void main(String[] args) {
        // Criando objetos
        Aluno aluno1 = new Aluno("João");
        Curso curso1 = new Curso("Engenharia");
        Professor professor1 = new Professor("Prof. Silva");
        Disciplina disciplina1 = new Disciplina("Matemática", professor1);

        // Estabelecendo relacionamentos
        aluno1.adicionarDisciplina(disciplina1);
        curso1.adicionarDisciplina(disciplina1);
        professor1.adicionarDisciplina(disciplina1);
        disciplina1.adicionarAluno(aluno1);
        disciplina1.adicionarCurso(curso1);

        // Imprimindo informações
        aluno1.imprimir();
        curso1.imprimir();
        professor1.imprimir();
        disciplina1.imprimir();
    }
}

