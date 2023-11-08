package Veiculo;
public class Carro {
	public String marca;
	public String modelo;
	public double combustivel = 0;
	public int tanque = 50;
	public double motor;
	private double velocidade;
	public boolean girarChave;
	public double vl_gasolina  ;
	public int ano;
	public double vl_total_tanque;
	
	public Carro(String marca, String modelo, int ano, boolean girarChave, double vl_gasolina) {
		this.combustivel = 0;
        this.velocidade = 0;
        this.girarChave = girarChave;
        this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
        this.vl_gasolina= tanque * vl_gasolina;
    }
	
    public void ligarMotor() {
        if (!this.girarChave) {
            System.out.println("O carro está desligado!");
        }
    }

    public void desligarMotor() {
        if (this.girarChave) {         
            this.velocidade = 0;
            System.out.println("O carro está ligando");
        }
    }

	 public void acelerar(int quantidade) {
	        if (this.girarChave) {
	            this.velocidade += quantidade;
	            if (this.velocidade > 180) {
	            	System.out.println("Está fora do limite de velocidade!!");
	                this.velocidade = 180;
	            }
	        }
	    }

	    public void frear(int quantidade) {
	        this.velocidade -= quantidade;
	        if (this.velocidade < 0) {
	            this.velocidade = 0;	            
	        }
	    }
	    
}



package aplicacao.principal;
import Veiculo.Carro;

public class Principal {
	public static void main(String[] args) {
		Carro ford = new Carro("Ford", "Fusion", 2020 , true, 5.74);
		
		System.out.println(ford.marca);
		System.out.println(ford.modelo);
		System.out.println(ford.ano);
		System.out.println(ford.vl_gasolina);
		ford.ligarMotor();
		ford.desligarMotor();
		ford.acelerar(200);
		ford.frear(20);		
 
	}

	
}
