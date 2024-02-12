import java.util.ArrayList;

// Classe base para Funcionário
class Funcionario {
    private String nome;
    private int idade;

    public Funcionario(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Getters e Setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    // Método comum a todos os funcionários
    public void realizarTarefa() {
        System.out.println("Realizando tarefa genérica.");
    }
}

// Classe para Gerente, herda de Funcionario
class Gerente extends Funcionario {
    private String departamento;

    public Gerente(String nome, int idade, String departamento) {
        super(nome, idade);
        this.departamento = departamento;
    }

    // Getter e Setter específico para Gerente

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    // Método polimórfico
    @Override
    public void realizarTarefa() {
        System.out.println("Gerenciando equipe no departamento " + departamento);
    }
}

// Classe para Desenvolvedor, herda de Funcionario
class Desenvolvedor extends Funcionario {
    private String linguagem;

    public Desenvolvedor(String nome, int idade, String linguagem) {
        super(nome, idade);
        this.linguagem = linguagem;
    }

    // Getter e Setter específico para Desenvolvedor

    public String getLinguagem() {
        return linguagem;
    }

    public void setLinguagem(String linguagem) {
        this.linguagem = linguagem;
    }

    // Método polimórfico
    @Override
    public void realizarTarefa() {
        System.out.println("Desenvolvendo em " + linguagem);
    }
}


public class SistemaGestaoFuncionarios {
    private static void apagarTabelaBanco() {
        System.out.println("Apagando tabela do banco de dados...");
        // Lógica para apagar tabela do banco de dados
    }

    private static void subirParaProducao() {
        System.out.println("Subindo para produção...");
        // Lógica para subir a aplicação para produção
    }

    private static void desenvolverTelas() {
        System.out.println("Desenvolvendo telas...");
        // Lógica para o desenvolvimento de interfaces gráficas
    }

    public static void main(String[] args) {
        // Criar uma lista de funcionários usando ArrayList
        ArrayList<Funcionario> funcionarios = new ArrayList<>();

        // Adicionar funcionários à lista
        funcionarios.add(new Gerente("João", 35, "TI"));
        funcionarios.add(new Desenvolvedor("Maria", 28, "Java"));
        funcionarios.add(new Desenvolvedor("Carlos", 30, "Python"));

        // Iterar sobre a lista e realizar operações polimórficas
        for (Funcionario funcionario : funcionarios) {
            funcionario.realizarTarefa();
            System.out.println("Nome: " + funcionario.getNome() + ", Idade: " + funcionario.getIdade());
            if (funcionario instanceof Gerente) {
                System.out.println("Departamento: " + ((Gerente) funcionario).getDepartamento());
            } else if (funcionario instanceof Desenvolvedor) {
                System.out.println("Linguagem: " + ((Desenvolvedor) funcionario).getLinguagem());
            }
            System.out.println("----------------------");
        }
       /* No trecho acima, instanceof é usado para verificar se funcionario é uma instância de Gerente ou Desenvolvedor.
       Isso é útil quando você está lidando com herança e polimorfismo. Se funcionario for uma instância de Gerente, 
       o bloco dentro do if será executado, e se for uma instância de Desenvolvedor, o bloco dentro do else if será 
       executado. O casting (Gerente) funcionario e (Desenvolvedor) funcionario é necessário para acessar métodos 
       específicos dessas classes que não estão na classe base Funcionario. */

        // Simulação de apagar tabela do banco de dados
        apagarTabelaBanco();

        // Simulação de subir para produção
        subirParaProducao();

        // Simulação de desenvolver telas
        desenvolverTelas();
    }

    
}