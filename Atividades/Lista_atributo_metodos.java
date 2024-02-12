//Predio
public class Principal {
	public static void main(String[] args) {
		
		Predio pred = new Predio();
		
		pred.altura = "115 metros de altura";
		pred.metragem = "120 mil metros quadrados";
		pred.qtd_Ap = 1160;
		pred.estacionamento = "Sim";
		
		pred.mostrar();
		

	}

}
public class Predio {
	String altura;
	String metragem;
	int qtd_Ap;
	String estacionamento;
	
	void mostrar(){
	if(altura != null && metragem != null && estacionamento != null ){
		System.out.println("Altura: " + altura + "\n"+ "Metragem: " + metragem+ "\n" + "Quantidade de Apartamentos: "+ qtd_Ap + "\n" + "Tem estacionamento? " + estacionamento);
	}else {
		System.out.println("Esse predio não existe!!");
	}
	}
}

//Coelho

public class Principal {
	public static void main(String[] args) {
	
		Coelho pula = new Coelho();
		
		pula.pelagem = "Malhado";
		pula.especie = "Oryctolagus cuniculus";
		pula.raca = "Rex";
		pula.peso = "3,5 kg"; 
		pula.sexo = "Fêmea";
		
		
		pula.exibir();

	}

}
public class Coelho {
	String especie;
	String raca;
	String peso; 
	String pelagem;
	String sexo;
	
	void exibir() {
		if(especie != null && raca != null && peso != null && pelagem != null && sexo != null){
			System.out.println("Especie: " + especie + "\n"+ "Raça: " + raca + "\n" + "Peso: "+ peso + "\n" + "Pelagem: " + pelagem + "\n" + "Sexo: " + sexo);
		}else {
			System.out.println("Coelho não identificado!");
		}
	}

}

//Cadeira

public class Principal {
	public static void main(String[] args) {
	Cadeira cad= new Cadeira();
	cad.material = "Aço, Madeira, Polipropileno";
	cad.preco = "R$ 77";
	cad.tipos = "Eiffel Preto";
		
	cad.Mostrar();

	}

}
public class Cadeira {
	String material;
	String preco;
	String tipos;
	
	void Mostrar() {
		System.out.println("Material: " + material + "\n" + "Preço: " + preco + "\n" + "Tipo: " + tipos   );
	}

}

//Gravidade
public class Principal {
	public static void main(String[] args) {
	Gravidade grav = new Gravidade();
	
	grav.densidade ="Na maioria das vezes, o valor da gravidade específica é praticamente igual à densidade do material, mas essa grandeza é usada para contornar o problema da diferença de temperatura, em razão da diferença de volume dos líquidos.";
	grav.intensidade="A aceleração na Terra vale aproximadamente 9,807 m/s², já aceleração da gravidade da Lua vale 1,622 m/s²";

	grav.Exibir();

}
}
public class Gravidade {
	String densidade;
	String intensidade;
	
	void Exibir(){
		System.out.println("Densidade: "+ densidade + "\n" + "Intensidade: " + intensidade);
	}


}


//Homen aranha
public class Principal {
	public static void main(String[] args) {
		Homem_aranha aranha = new Homem_aranha();
		
		aranha.atributo="sentido aranha, herói, uniforme, escalar, força";
		aranha.metodo ="Salvar pessoas, Combater o mal";
				
		aranha.exibir();


}
}
public class Homem_aranha {
	String atributo;
	String metodo;
	
	void exibir(){
		System.out.println("Atributos:" + atributo + "\n" + "Metodos:" + metodo);
	}
	

}

//Helicoptero
public class Principal {
	public static void main(String[] args) {
		Helicoptero helic = new Helicoptero();
		
		helic.modelo = "Robinson R44";
		helic.cor = "Azul";
		helic.capacidade = "Até duas pessoas";
		
		helic.Exibir();


}
}
public class Helicoptero {
	String modelo;
	String cor;
	String capacidade;
	
	void Exibir(){
		System.out.println("Modelo:" + modelo + "\n" + "Cor:" + cor + "\n" + "Capacidade:" + capacidade  );
	}

}

//Águia
public class Principal {
	public static void main(String[] args) {
	Aguia aguia = new Aguia();
	
	aguia.bico = "Possui um bico grande curvo e afiado ";
	aguia.penas = "A cabeça e a nuca são de cor marrom dourada"; 
	aguia.garras = "Garras afiadas";
	aguia.asas="Possui asas grandes e arredondadas.";
	aguia.tamanho="66 – 100 cm";
	aguia.raca = "Águia-dourada";

	aguia.Exibir();

}
}
public class Aguia {
	String bico;
	String penas;
	String garras;
	String asas;
	String tamanho;
	String raca;
	
	void Exibir(){
		System.out.println("Bico: " + bico+ "\n" + "Penas: " + penas + "\n" + "Garras: " + garras + "\n" + "Asas: "+ asas + "\n" + "Tamanho: " + tamanho + "\n" + "Raça: " + raca);
	}


}

//Inflação
public class Principal {
	public static void main(String[] args) {
		Inflacao infla = new Inflacao();
		
		infla.atributo="valor, periódo, juros";
		infla.metodo ="Subir ou Descer no gráfico";
				
		infla.exibir();


}
}
public class Inflacao {
	String atributo;
	String metodo;
	
	void exibir(){
		System.out.println("Atributos:" + atributo + "\n" + "Metodos:" + metodo);
	}

}


//Jornalista
public class Principal {
	public static void main(String[] args) {
		Jornalista jornal = new Jornalista();
		
		jornal.atributo="materia, entrevista, manchete";
		jornal.metodo ="Entregar a notícia";
				
		jornal.exibir();


}
}
public class Jornalista {
	String atributo;
	String metodo;
	
	void exibir(){
		System.out.println("Atributos:" + atributo + "\n" + "Metodos:" + metodo);
	}


}

//Fotografia
public class Principal {
	public static void main(String[] args) {
		Fotografia ft = new Fotografia();
		
		ft.cores ="Divesas";
		ft.elementos="Luz, objeto e composição.";
		ft.pixels = "1800 x 1200 pixels";
		ft.tamanho = " 10,16 x 15,24 cm";
		ft.tipo ="Fotografia de Retrato, Fotojornalismo, Fotografia Publicitária, etc.";
				
		ft.Mostrar();


}
}
public class Fotografia {
	String pixels;
	String tamanho;
	String tipo;
	String elementos;
	String cores;
	void Mostrar() {
		System.out.println("Pixels:"+ pixels + "\n" + "Tamanho:" + tamanho + "\n" + "Tipo:"+ tipo + "\n" + "Elementos:" + elementos +"\n" + "Cores:" + cores);
	}

}

