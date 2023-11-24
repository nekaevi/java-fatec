import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.Font;
import java.awt.Color;

class CalculadoraNumeros {
    public static double calcularMedia(ArrayList<Integer> numeros) {
        if (numeros == null || numeros.isEmpty()) {
            throw new IllegalArgumentException("A lista de números não pode ser nula ou vazia.");
        }

        int soma = 0;
        for (int numero : numeros) {
            soma += numero;
        }

        return (double) soma / numeros.size();
    }
}

public class form_calculadora extends JFrame {

    private static final long serialVersionUID = 1L;

    private JTextField numeroField1;
    private JTextField numeroField2;
    private JTextArea resultadoArea;

    public form_calculadora() {
        setTitle("Calculadora de Média + Tratamento de Erros");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(475, 271);
        setLocationRelativeTo(null);
        getContentPane().setLayout(null);

        JPanel panel = new JPanel();
        panel.setBackground(new Color(253, 255, 149));
        panel.setBounds(0, 0, 458, 236);
        JLabel label1 = new JLabel("Número 1:");
        label1.setBounds(10, 71, 140, 14);
        JLabel label2 = new JLabel("Número 2:");
        label2.setBounds(10, 110, 139, 14);
        numeroField1 = new JTextField(10);
        numeroField1.setBounds(10, 85, 143, 20);
        numeroField2 = new JTextField(10);
        numeroField2.setBounds(9, 125, 143, 20);
        JButton calcularButton = new JButton("Calcular Média");
        calcularButton.setBackground(new Color(243, 164, 255));
        calcularButton.setBounds(14, 168, 133, 23);
        resultadoArea = new JTextArea(5, 20);
        resultadoArea.setBounds(203, 60, 191, 127);
        resultadoArea.setEditable(false);
        panel.setLayout(null);

        panel.add(label1);
        panel.add(numeroField1);
        panel.add(label2);
        panel.add(numeroField2);
        panel.add(calcularButton);
        panel.add(resultadoArea);

        getContentPane().add(panel);
        
        JLabel lblNewLabel = new JLabel("Calcular Média + Tratamento de Erros");
        lblNewLabel.setFont(new Font("Segoe UI Light", Font.PLAIN, 18));
        lblNewLabel.setBounds(77, 5, 306, 38);
        panel.add(lblNewLabel);

        calcularButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int numero1 = Integer.parseInt(numeroField1.getText().trim());
                    int numero2 = Integer.parseInt(numeroField2.getText().trim());

                    ArrayList<Integer> numeros = new ArrayList<>();
                    numeros.add(numero1);
                    numeros.add(numero2);

                    double media = CalculadoraNumeros.calcularMedia(numeros);

                    resultadoArea.setText("Média dos números: " + media);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Por favor, insira números válidos.");
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Ocorreu um erro: " + ex.getMessage());
                }
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new form_calculadora().setVisible(true);
            }
        });
    }
}
