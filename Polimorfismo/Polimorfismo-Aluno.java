//Disciplina - Aluno (Agregação)

// Classe Disciplina
class Disciplina {
     String nome;
     int cargaHoraria;

    public Disciplina(String nome, int cargaHoraria) {
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
    }

    public void mostrarInformacoes() {
        System.out.println("Disciplina: " + nome);
        System.out.println("Carga Horária: " + cargaHoraria + " horas");
    }
}

// Classe Aluno
class Aluno {
    String nome;
    Disciplina disciplina;

    public Aluno(String nome, Disciplina disciplina) {
        this.nome = nome;
        this.disciplina = disciplina;
    }

    public void mostrarInformacoes() {
        System.out.println("Nome do Aluno: " + nome);
        disciplina.mostrarInformacoes();
    }
}

public class Main {
    public static void main(String[] args) {
        Disciplina disciplina1 = new Disciplina("Matemática", 40);
        Aluno aluno1 = new Aluno("Maria", disciplina1);
        aluno1.mostrarInformacoes();
    }
}