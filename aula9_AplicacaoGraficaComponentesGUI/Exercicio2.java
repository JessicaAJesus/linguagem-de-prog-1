import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("serial")
public class Exercicio2 extends JFrame{
    private JLabel lbTemperatura, lbOperacao;
    private JTextField tfTemperatura;
    private static final String[] valDef = {"Celsius para Fahrenheit",
                                            "Fahrenheit para Celsius",
                                            "Celsius para Kelvin",
                                            "Kelvin para Celsius",
                                            "Fahrenheit para Kelvin",
                                            "Kelvin para Fahrenheit"
                                            };
    private JRadioButton rbOperacao[];
    private ButtonGroup bgOperacao;
    private JPanel pnOperacao;
    private Container ct;

    public Exercicio2() {
        lbTemperatura = new JLabel("Temperatura");
        lbOperacao = new JLabel("Operações");
        tfTemperatura = new JTextField();
        rbOperacao = new JRadioButton[6];
        bgOperacao = new ButtonGroup();
        pnOperacao = new JPanel();

        setTitle("Exercício 2");
        setSize(300, 380);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Color fundo = new Color(180, 205, 205);

        for (int i = 0; i < rbOperacao.length; i++) {
            rbOperacao[i] = new JRadioButton(valDef[i]);
            rbOperacao[i].setBackground(fundo);
            bgOperacao.add(rbOperacao[i]);
        }
        rbOperacao[0].setSelected(true);

        pnOperacao.setBorder(BorderFactory.createEtchedBorder());
        pnOperacao.setBackground(fundo);
        ct = getContentPane();
        ct.setLayout(null);
        ct.setBackground(fundo);
        lbOperacao.setOpaque(true);
        lbOperacao.setBackground(fundo);

        //posicionamento
        lbTemperatura.setBounds(40,40,100,25);
        tfTemperatura.setBounds(130, 40, 110, 25);
        lbOperacao.setBounds(60, 80, 65, 25);
        pnOperacao.setBounds(40,92,200, 180);
        rbOperacao[0].setBounds(15, 15, 180, 25);
        rbOperacao[1].setBounds(15, 40, 180, 25);
        rbOperacao[2].setBounds(15, 65, 180, 25);
        rbOperacao[3].setBounds(15, 90, 180, 25);
        rbOperacao[4].setBounds(15, 115, 180, 25);
        rbOperacao[5].setBounds(15, 140, 180, 25);

        ct.add(lbTemperatura);
        ct.add(tfTemperatura);
        ct.add(lbOperacao);
        ct.add(pnOperacao);
        pnOperacao.setLayout(null);

        for (int i = 0; i < rbOperacao.length; i++) {
            pnOperacao.add(rbOperacao[i]);
        }

        for (int i = 0; i < rbOperacao.length; i++) {
            int index = i;

            rbOperacao[i].addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    if (verificacao())
                        btOperacaoAction(index);
                }
            });
        }
    }

    public boolean verificacao() {
        String temperatura = tfTemperatura.getText();
        if (!isDouble(temperatura)) {
            JOptionPane.showMessageDialog(this, "O campo deve conter um número.", "Erro", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

    public void btOperacaoAction(int opc) {
        double temp = Double.parseDouble(tfTemperatura.getText());
        double resultado = 0;
        switch (opc) {
            case 0:
                resultado = temp * 1.8 + 32;
                break;
            case 1:
                resultado = (temp - 32) / 1.8;
                break;
            case 2:
                resultado = temp + 273.15;
                break;
            case 3:
                resultado = temp - 273.15;
                break;
            case 4:
                resultado = (temp + 459.67) / 1.8;
                break;
            case 5:
                resultado = temp * 1.8 - 459.67;
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

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Exercicio2().setVisible(true);
            }
        });
    }
}