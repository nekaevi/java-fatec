//Pessoa- Endereco(Composição)

// Classe Pessoa
class Pessoa {
    String nome;
    Endereco endereco;

    public Pessoa(String nome, Endereco endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public void mostrarInformacoes() {
        System.out.println("Nome: " + nome);
        endereco.mostrarEndereco();
    }
}

// Classe Endereco
class Endereco {
     String rua;
     String cidade;

    public Endereco(String rua, String cidade) {
        this.rua = rua;
        this.cidade = cidade;
    }

    public void mostrarEndereco() {
        System.out.println("Endereço: " + rua + ", " + cidade);
    }
}


public class Main {
    public static void main(String[] args) {
        Endereco endereco1 = new Endereco("Rua A", "Cidade X");
        Pessoa pessoa1 = new Pessoa("João", endereco1);
        pessoa1.mostrarInformacoes();
    }
}