package gerenciamento.veiculos;

public class Veiculos {
	public String modelo;
	//public String tipo;
	public int ano;
	public String marca;
	
	
	public Veiculos(String modelo, int ano, String marca) {
		this.modelo = modelo;
		this.ano = ano;
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public int getAno() {
		return ano;
		
	}
	public String marca() {
		return marca;
	}
	
	public void Mostrar() {
		System.out.println("Modelo " +  modelo);
		System.out.println("Ano: " + ano);
		
	}

}
package gerenciamento.veiculos;

public class Automovel extends Veiculos{
	public String tipo;
	public double preco;
	public Automovel(String modelo, int ano, String marca,  String tipo, double preco) {
		super(modelo, ano, marca);
		this.tipo = tipo;
		this.preco = preco;
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
	 
    @Override
    public void Mostrar() {
        super.Mostrar(); 
        System.out.println("Tipo: " + tipo);
        System.out.println("R$: " + preco);
    }

}
package gerenciamento.veiculos;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		ArrayList<Veiculos> veiculos = new ArrayList<>();
		
		veiculos.add(new Automovel("Ninja300", 2013, "Kawasaki", "Moto", 29990.00));
		veiculos.add(new Automovel("Golf GTI", 2023, " Volkswagen", "Carro",  224.400));
		
		for(Veiculos auto: veiculos) {
			auto.Mostrar();
			System.out.println("-------");
		}
	}

}
