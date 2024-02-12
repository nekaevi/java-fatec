package cadastro.produtos;

public class Produtos {
	public String nome;
	public String tipo;
	private double preco;
	
	public Produtos(String nome, String tipo, double preco) {
		this.nome = nome;
		this.tipo = tipo;
		this.preco = preco;
	}
	
	public String getNome() {
		return nome;
	}
	public String getTipo() {
		return tipo;
	}
    public double getPreco() {
        return preco;
    }

	public void setPreco(double preco) {
		this.preco = preco;
	}
	private static void ligar() {
		System.out.println("Ligando o Servidor");
		System.out.println("Servidor Ligado");
		// Lógica para apagar tabela do banco de dados
	}
	
	private static void Conectar() {
		System.out.println("Conectando a rede...");
		System.out.println("Conectado");
		// Lógica para subir a aplicação para produção
	}
	
	public void Mostrar() {
		System.out.println("Nome do Produto: " + nome);
		System.out.println("Categoria do produto: " + tipo);
		System.out.println("R$: " + preco);
	}

}

package cadastro.produtos;

public class Eletronico extends Produtos {
	
	public String desc;
	public Eletronico(String nome, String tipo, double preco, String desc) {
		super(nome, tipo, preco);
		this.desc = desc;
		// TODO Auto-generated constructor stub
	}
	public String getDesc() {
		return desc;
	}
	@Override
	public void Mostrar() {
		super.Mostrar();
		System.out.println("Desrição: " + desc);
	}

}
package cadastro.produtos;
import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		Conectar();
		ligar();

		ArrayList<Produtos> produtos = new ArrayList<>();
		
		produtos.add(new Produtos("Cetim", "Tecido", 12.0 ));
		produtos.add(new Eletronico("Celular", "Eletronico" , 1050.0, "64GB de armazenamento"));
		
		for(Produtos prod: produtos) {
			prod.Mostrar();
			System.out.println("-------");
		}


	}

}