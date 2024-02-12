package loja;

public class Funcionario {
	 String nome;
	 int cadastro;
	
	public Funcionario(String nome, int cadastro) {
		this.nome = nome;
		this.cadastro = cadastro;
	}
	public void bateroponto() {
		System.out.println(nome +" Bateu o ponto.");
	}
	public void fecharocaixa() {
		System.out.println(nome +" Fechou o caixa.");
	}
	public String getNome() {
        return nome;
    }
}


package loja;

public class Gerente extends Funcionario {

	public Gerente(String nome, int cadastro) {
		super(nome, cadastro);
		
	}
	public void solicitarMaterial() {
        System.out.println(getNome() + " solicitou material.");
    }
	

}


package loja;

public class Vendedor extends Funcionario {

	public Vendedor(String nome, int cadastro) {
		super(nome, cadastro);
	}

    public void realizarvenda() {
        System.out.println(getNome() + " realizou uma venda.");
    }

}


package loja;

public class Faxineiro extends Funcionario {

	public Faxineiro(String nome, int cadastro) {
		super(nome, cadastro);
	}
	
}


package loja;

public class Principal {

	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario("Evily", 01);
        Gerente gerente = new Gerente("Maria", 02);
        Vendedor vendedor = new Vendedor("Pedro", 03);
        Faxineiro faxineiro = new Faxineiro("Ana", 04);

        funcionario.bateroponto();
        funcionario.fecharocaixa();

        gerente.bateroponto();
        gerente.fecharocaixa();
        gerente.solicitarMaterial();

        vendedor.bateroponto();
        vendedor.fecharocaixa();
        vendedor.realizarvenda();

        faxineiro.bateroponto();
        faxineiro.fecharocaixa();
    }
}
