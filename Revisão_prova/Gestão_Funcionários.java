package Gestao.funcionarios;
public class Funcionario {
	
	public String nome;
	public String cargo;
	private double salario;
	public Funcionario(String nome, String cargo, double salario) {
		this.nome = nome;
		this.cargo = cargo;
		this.salario = salario;
	}
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
	public void exibir() {
		System.out.println("Nome: " + nome);
		System.out.println("Cargo: " + cargo);
		System.out.println("Salario: " + salario);
	}
}


package Gestao.funcionarios;

public class Gerente extends Funcionario {

	private String departamento;

	public Gerente(String nome, String cargo, double salario, String departamento) {
		super(nome, cargo, salario);
		this.departamento = departamento;
		// TODO Auto-generated constructor stub
	
}
	 // Getter para o departamento
    public String getDepartamento() {
        return departamento;
    }

    // Método para exibir informações específicas de um gerente
    @Override
    public void exibir() {
        super.exibir(); // Chama o método da classe pai
        System.out.println("Departamento: " + departamento);
    }
}
package Gestao.funcionarios;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Criando uma lista de funcionários
        ArrayList<Funcionario> funcionarios = new ArrayList<>();

        // Adicionando funcionários à lista
        funcionarios.add(new Funcionario("João", "Desenvolvedor", 5000.0));
        funcionarios.add(new Gerente("Maria", "Gerente", 8000.0, "TI"));

        // Iterando sobre a lista e exibindo informações
        for (Funcionario func : funcionarios) {
            func.exibir();
            System.out.println("------------");
        }
    }

	}

