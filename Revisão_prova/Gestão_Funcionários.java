import java.util.ArrayList;

// Classe principal para representar um funcionário
class Funcionario {
    private String nome;
    private String cargo;
    private double salario;

    // Construtor
    public Funcionario(String nome, String cargo, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    // Getters e Setters (Encapsulamento)
    public String getNome() {
        return nome;
    }

    public String getCargo() {
        return cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    // Método para exibir informações
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Cargo: " + cargo);
        System.out.println("Salário: " + salario);
    }
}

// Classe para representar um gerente (herda de Funcionario)
class Gerente extends Funcionario {
    private String departamento;

    // Construtor
    public Gerente(String nome, double salario, String departamento) {
        super(nome, "Gerente", salario);
        this.departamento = departamento;
    }

    // Getter para o departamento
    public String getDepartamento() {
        return departamento;
    }

    // Método para exibir informações específicas de um gerente
    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes(); // Chama o método da classe pai
        System.out.println("Departamento: " + departamento);
    }
}

// Classe principal que contém o método main
public class SistemaGestaoFuncionarios {
    public static void main(String[] args) {
        // Criando uma lista de funcionários
        ArrayList<Funcionario> funcionarios = new ArrayList<>();

        // Adicionando funcionários à lista
        funcionarios.add(new Funcionario("João", "Desenvolvedor", 5000.0));
        funcionarios.add(new Gerente("Maria", 8000.0, "TI"));

        // Iterando sobre a lista e exibindo informações
        for (Funcionario func : funcionarios) {
            func.exibirInformacoes();
            System.out.println("------------");
        }
    }
}