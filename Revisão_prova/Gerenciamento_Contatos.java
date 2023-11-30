
package gerenciamento.contatos;
class Contato {
    private String nome;
    private String telefone;

    public Contato(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Telefone: " + telefone;
    }
}
package gerenciamento.contatos;
class ContatoPessoal extends Contato {
    private String endereco;

    public ContatoPessoal(String nome, String telefone, String endereco) {
        super(nome, telefone);
        this.endereco = endereco;
    }

    public String getEndereco() {
        return endereco;
    }

    @Override
    public String toString() {
        return super.toString() + ", Endereço: " + endereco;
    }
}

package gerenciamento.contatos;
import java.util.ArrayList;
class ContatoProfissional extends Contato {
    private String empresa;

    public ContatoProfissional(String nome, String telefone, String empresa) {
        super(nome, telefone);
        this.empresa = empresa;
    }

    public String getEmpresa() {
        return empresa;
    }

    @Override
    public String toString() {
        return super.toString() + ", Empresa: " + empresa;
    }
}

class GerenciadorContatos {
    private ArrayList<Contato> listaContatos;

    public GerenciadorContatos() {
        this.listaContatos = new ArrayList<>();
    }

    public void adicionarContato(Contato contato) {
        listaContatos.add(contato);
    }

    public void exibirContatos() {
        for (Contato contato : listaContatos) {
            System.out.println(contato);
        }
    }
}

package gerenciamento.contatos;
public class Main {
    public static void main(String[] args) {
        GerenciadorContatos gerenciador = new GerenciadorContatos();

        ContatoPessoal contatoPessoal = new ContatoPessoal("João", "123456789", "Rua A, Cidade");
        ContatoProfissional contatoProfissional = new ContatoProfissional("Maria", "987654321", "Empresa XYZ");

        gerenciador.adicionarContato(contatoPessoal);
        gerenciador.adicionarContato(contatoProfissional);

        gerenciador.exibirContatos();
    }
}
