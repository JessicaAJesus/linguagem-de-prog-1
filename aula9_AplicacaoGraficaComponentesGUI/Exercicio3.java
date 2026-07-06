import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("serial")
public class Exercicio3 extends JFrame {

    private JLabel lbValor, lbEstado, lbTipo;
    private JLabel lbResultadoValorP, lbResultadoFrete, lbResultadoTotal;
    private JTextField tfValor;
    private JCheckBox ckFidelidade;
    private JComboBox<String> cbEstado;
    private static final String[] valEst = {"SP", "RJ", "MG", "ES"};
    private static final String[] valTipo = {"Sedex", "Sedex 10"};
    private JRadioButton rbTipo[];
    private ButtonGroup bgTipo;
    private JButton btCalcular;
    private Container ct;

    public Exercicio3() {
        lbValor = new JLabel("Valor do Produto:");
        lbEstado = new JLabel("Estado:");
        lbTipo = new JLabel("Tipo de Postagem:");
        tfValor = new JTextField();
        ckFidelidade = new JCheckBox("Cliente com fidelidade");
        cbEstado = new JComboBox<>(valEst);
        rbTipo = new JRadioButton[2];
        bgTipo = new ButtonGroup();
        btCalcular = new JButton("Calcular");
        lbResultadoValorP = new JLabel("Valor do Produto: ");
        lbResultadoFrete = new JLabel("Valor do Frete: ");
        lbResultadoTotal = new JLabel("Valor Total: ");
        bgTipo = new ButtonGroup();

        setTitle("Exercício 3");
        setSize(500, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Color fundo = new Color(180, 205, 205);
        setLayout(null);
        lbResultadoValorP.setForeground(Color.blue);
        lbResultadoFrete.setForeground(Color.blue);
        lbResultadoTotal.setForeground(Color.blue);

        for (int i = 0; i < rbTipo.length; i++) {
            rbTipo[i] = new JRadioButton(valTipo[i]);
            rbTipo[i].setBackground(fundo);
            bgTipo.add(rbTipo[i]);
        }
        rbTipo[0].setSelected(true);

        ckFidelidade.setBackground(fundo);
        ct = getContentPane();
        ct.setLayout(null);
        ct.setBackground(fundo);

        lbValor.setBounds(20, 20, 150, 25);
        lbEstado.setBounds(20, 100, 100, 25);
        lbTipo.setBounds(20, 140, 150, 25);
        tfValor.setBounds(130, 20, 100, 25);
        ckFidelidade.setBounds(16, 60, 150, 25);
        cbEstado.setBounds(130, 100, 80, 25);
        rbTipo[0].setBounds(150, 140, 80, 25);
        rbTipo[1].setBounds(150, 170, 100, 25);
        btCalcular.setBounds(120, 210, 100, 30);
        lbResultadoValorP.setBounds(270, 20, 200, 25);
        lbResultadoFrete.setBounds(270, 60, 200, 25);
        lbResultadoTotal.setBounds(270, 100, 200, 25);

        bgTipo.add(rbTipo[0]);
        bgTipo.add(rbTipo[1]);

        ct.add(lbValor);
        ct.add(lbEstado);
        ct.add(lbTipo);
        ct.add(tfValor);
        ct.add(ckFidelidade);
        ct.add(cbEstado);
        ct.add(rbTipo[0]);
        ct.add(rbTipo[1]);
        ct.add(btCalcular);
        ct.add(lbResultadoValorP);
        ct.add(lbResultadoFrete);
        ct.add(lbResultadoTotal);

        btCalcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calcular();
            }
        });

        setVisible(true);
    }

    private void calcular() {
        try {
            double valorProduto = Double.parseDouble(tfValor.getText());

            // Desconto fidelidade
            if (ckFidelidade.isSelected()) {
                valorProduto *= 0.9;
            }

            // Frete base
            String estado = (String) cbEstado.getSelectedItem();
            double percentualFrete = 0;

            if (estado.equals("SP")) {
                percentualFrete = 0.10;
            } else if (estado.equals("RJ") || estado.equals("MG")) {
                percentualFrete = 0.15;
            } else if (estado.equals("ES")) {
                percentualFrete = 0.20;
            }

            double valorFrete = valorProduto * percentualFrete;

            // Sedex 10
            if (rbTipo[1].isSelected()) {
                valorFrete *= 1.2;
            }

            double valorTotal = valorProduto + valorFrete;

            lbResultadoValorP.setText("Valor do Produto: R$ " + String.format("%.2f", valorProduto));
            lbResultadoFrete.setText("Valor do Frete: R$ " + String.format("%.2f", valorFrete));
            lbResultadoTotal.setText("Valor Total: R$ " + String.format("%.2f", valorTotal));

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "O campo deve conter um número.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Exercicio3().setVisible(true);
            }
        });
    }
}