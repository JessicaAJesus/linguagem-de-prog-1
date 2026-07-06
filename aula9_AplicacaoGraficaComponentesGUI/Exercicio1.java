import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("serial")
public class Exercicio1 extends JFrame{
    private JLabel lbValor1, lbValor2, lbOperacao;
    private JTextField tfValor1, tfValor2;
    private JComboBox<Character> cbOperacao;
    private static final Character[] valOpe = {'+', '-', 'x', '/', '%'};
    private JButton btCalcular;
    private Container ct;

    public Exercicio1() {
        lbValor1 = new JLabel("Valor 1");
        lbValor2 = new JLabel("Valor 2");
        lbOperacao = new JLabel("Operação");
        tfValor1 = new JTextField();
        tfValor2 = new JTextField();
        cbOperacao = new JComboBox<>(valOpe);
        btCalcular = new JButton("Calcular");

        setTitle("Exercício 1");
        setSize(500, 250);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        btCalcular.setToolTipText("Calcula os valores com base na operação.");

        ct = getContentPane();
        ct.setLayout(null);
        ct.setBackground(new Color(180, 205, 205));

        //posicionamento
        lbValor1.setBounds(40,20,100,25);
        tfValor1.setBounds(120,20,100,25);
        lbValor2.setBounds(40, 80, 100, 25);
        tfValor2.setBounds(120, 80, 100, 25);
        lbOperacao.setBounds(40, 140, 100, 25);
        cbOperacao.setBounds(120, 140, 100, 25);
        btCalcular.setBounds(300, 140, 100, 25);

        ct.add(lbValor1);
        ct.add(lbValor2);
        ct.add(tfValor1);
        ct.add(tfValor2);
        ct.add(lbOperacao);
        ct.add(cbOperacao);
        ct.add(btCalcular);

        btCalcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                verificacao();
            }
        });
    }

    public void verificacao() {
        String valor1 = tfValor1.getText();
        String valor2 = tfValor2.getText();
        char operacao = (char) cbOperacao.getSelectedItem();

        if (!isDouble(valor1) || !isDouble(valor2)) {
            JOptionPane.showMessageDialog(this, "Os campos devem conter números.", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (operacao == '%') {
            if (!isInteger(valor1) || !isInteger(valor2)) {
                JOptionPane.showMessageDialog(this, "Para resto da divisão (%) use apenas inteiros.", "Erro", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }

        if (operacao == '/' && Double.parseDouble(valor2) == 0) {
            JOptionPane.showMessageDialog(this, "Divisão por zero não permitida.", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        btCalcularAction();
    }

    public void btCalcularAction() {
        double valor1 = Double.parseDouble(tfValor1.getText());
        double valor2 = Double.parseDouble(tfValor2.getText());
        char operacao = (char) cbOperacao.getSelectedItem();
        double resultado = 0;

        switch (operacao){
            case '+':
                resultado = valor1 + valor2;
                break;
            case '-':
                resultado = valor1 - valor2;
                break;
            case 'x':
                resultado = valor1 * valor2;
                break;
            case '/':
                resultado = valor1 / valor2;
                break;
            case '%':
                resultado = valor1 % valor2;
                break;
        }

        JOptionPane.showMessageDialog(this, resultado, "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }

    public static boolean isDouble(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static boolean isInteger(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Exercicio1().setVisible(true);
            }
        });
    }
}