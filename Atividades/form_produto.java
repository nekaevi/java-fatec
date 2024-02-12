
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import java.awt.Color;


public class form_produto extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField nm_produto;
    private JTextField vl_preco;
    private ArrayList<Produto> produtos = new ArrayList<>();

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    form_produto frame = new form_produto();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public form_produto() {
    	setResizable(false);
        setTitle("Cadastro de Produtos");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 516, 299);
        contentPane = new JPanel();
        contentPane.setForeground(new Color(251, 183, 214));
        contentPane.setBackground(new Color(255, 223, 252));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNewLabel = new JLabel("Cadastro de Produto");
        lblNewLabel.setFont(new Font("Corbel Light", Font.PLAIN, 29));
        lblNewLabel.setBounds(11, 12, 243, 36);
        contentPane.add(lblNewLabel);

        nm_produto = new JTextField();
        nm_produto.setBounds(12, 87, 170, 22);
        contentPane.add(nm_produto);
        nm_produto.setColumns(10);

        vl_preco = new JTextField();
        vl_preco.setColumns(10);
        vl_preco.setBounds(11, 131, 170, 22);
        contentPane.add(vl_preco);

        JLabel lblNewLabel_1 = new JLabel("Produto:");
        lblNewLabel_1.setBounds(13, 73, 82, 15);
        contentPane.add(lblNewLabel_1);

        JLabel lblNewLabel_1_1 = new JLabel("Preço (R$):");
        lblNewLabel_1_1.setBounds(11, 116, 82, 15);
        contentPane.add(lblNewLabel_1_1);

        final JTextArea textArea = new JTextArea();
        textArea.setEditable(false);
        textArea.setBounds(247, 69, 213, 181);
        contentPane.add(textArea);


        JButton btnCadastrar = new JButton("Cadastrar");
        btnCadastrar.setForeground(new Color(0, 0, 0));
        btnCadastrar.setBackground(new Color(251, 183, 214));
        btnCadastrar.setIcon(new ImageIcon("C:\\Users\\csari\\Downloads\\imresizer-1700711956649.jpg"));
        btnCadastrar.setSelectedIcon(new ImageIcon("C:\\Users\\csari\\Downloads\\arrow-right.png"));
        btnCadastrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String produtoNome = nm_produto.getText();
                String preco = vl_preco.getText();
                

                Produto novoProduto = new Produto(produtoNome, preco);
                produtos.add(novoProduto);

                nm_produto.setText("");
                vl_preco.setText("");

                textArea.setText("Produtos Cadastrados:\n");
                produtos.forEach(produto -> textArea.setText(
                		"Os dados cadastrados são" + "\n"
                		+ "O nome é: " + produto.getNome() + "\n"
                		+ "O valor é: " + produto.getPreco() + "\n"));
                
                
                if(produtoNome != null||preco != null) {
					JOptionPane.showMessageDialog(contentPane, "Cadastro concluído!", "Alerta", JOptionPane.INFORMATION_MESSAGE);
				}
				
				else{
					JOptionPane.showMessageDialog(contentPane, "Alguma coisa está vazia!", "Erro", JOptionPane.ERROR_MESSAGE);
				
				}
            }
        });
        btnCadastrar.setBounds(42, 170, 115, 31);
        contentPane.add(btnCadastrar);
        
        JLabel lblNewLabel_3 = new JLabel("Dados dos Produtos Registrados:");
        lblNewLabel_3.setBounds(246, 52, 201, 14);
        contentPane.add(lblNewLabel_3);
        
        
    }

    public class Produto {
        private String nome;
        private String preco;

        public Produto(String nome, String preco) {
            this.nome = nome;
            this.preco = preco;
        }

        public String getNome() {
            return nome;
        }
   
        public String getPreco() {
            return preco;
        }
    }
}
