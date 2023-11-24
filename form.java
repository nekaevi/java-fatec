import java.awt.EventQueue;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;

public class form extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField nm_cliente;
	private JTextField idade_cliente;
	private JTextField em_cliente;
	private JTextField tel_cliente;
	private JTextField cpf_cliente;
	private JTextField data_cliente;
	private JRadioButton btn_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					form frame = new form();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public form() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 475, 429);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cadastro");
		lblNewLabel.setBounds(206, 11, 89, 14);
		contentPane.add(lblNewLabel);
		
		nm_cliente = new JTextField();
		nm_cliente.setBounds(31, 53, 164, 20);
		contentPane.add(nm_cliente);
		nm_cliente.setColumns(10);
		
		idade_cliente = new JTextField();
		idade_cliente.setBounds(31, 100, 164, 20);
		contentPane.add(idade_cliente);
		idade_cliente.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Nome");
		lblNewLabel_1.setBounds(31, 39, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Idade");
		lblNewLabel_2.setBounds(31, 84, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Sexo");
		lblNewLabel_3.setBounds(31, 131, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("E-mail");
		lblNewLabel_4.setBounds(31, 176, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		em_cliente = new JTextField();
		em_cliente.setBounds(31, 191, 164, 20);
		contentPane.add(em_cliente);
		em_cliente.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Telefone");
		lblNewLabel_5.setBounds(31, 223, 67, 14);
		contentPane.add(lblNewLabel_5);
		
		tel_cliente = new JTextField();
		tel_cliente.setBounds(31, 238, 164, 20);
		contentPane.add(tel_cliente);
		tel_cliente.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("CPF");
		lblNewLabel_6.setBounds(31, 269, 46, 14);
		contentPane.add(lblNewLabel_6);
		
		cpf_cliente = new JTextField();
		cpf_cliente.setBounds(31, 286, 164, 20);
		contentPane.add(cpf_cliente);
		cpf_cliente.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Data de nascimento");
		lblNewLabel_7.setBounds(31, 315, 128, 14);
		contentPane.add(lblNewLabel_7);
		
		data_cliente = new JTextField();
		data_cliente.setBounds(31, 327, 164, 20);
		contentPane.add(data_cliente);
		data_cliente.setColumns(10);
		
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(243, 114, 180, 184);
		contentPane.add(textArea);
	
		JRadioButton btn_1 = new JRadioButton("Feminino");
		btn_1.setBounds(31, 146, 67, 23);
		contentPane.add(btn_1);
		
		JRadioButton btn_2 = new JRadioButton("Masculino");
		btn_2.setBounds(109, 146, 109, 23);
		contentPane.add(btn_2);
		
		
		JButton btnNewButton = new JButton("Enviar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nome = nm_cliente.getText();
				String email = em_cliente.getText();
				String idade = idade_cliente.getText();
				String tel = tel_cliente.getText();
				String cpf = cpf_cliente.getText();
				String data = data_cliente.getText();
				String sexo = null;
				if (btn_1.isSelected()){
					sexo = "Feminino";		
				}
				else if (btn_2.isSelected()) {
					sexo = "Masculino";	
				}
				textArea.removeAll();
			textArea.setText("Nome: " + nome + "\n" +
					         "E-mail: " + email + "\n" +
					         "Idade: " + idade + "\n" +
					         "Sexo: " + sexo + "\n" +
					         "Telefone: " + tel + "\n" +
					         "CPF: " + cpf + "\n" +
							 "Data: " + data);
			}
		});
		btnNewButton.setBounds(69, 358, 89, 23);
		contentPane.add(btnNewButton);
	}
}
