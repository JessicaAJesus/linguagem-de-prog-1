import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("serial")
public class Exercicio4 extends JFrame{
    private JMenuBar mbBarra;
    private JMenu mnCadastro;

    private JMenuItem miCadFornecedores, miCadSair;
    private JMenu mnCadClientes;
    private JMenuItem miCadClientes[];
    private static final String[] cadCliItens = {"Pessoa Física", "Pessoa Jurídica"};

    public Exercicio4() {
        mbBarra = new JMenuBar();
        mnCadastro = new JMenu("Cadastro");
        mnCadClientes = new JMenu("Clientes");
        miCadClientes = new JMenuItem[2];
        miCadFornecedores = new JMenuItem("Fornecedores");
        miCadSair = new JMenuItem("Sair");

        setTitle("Exercício 4");
        setSize(500, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(new Color(180, 205, 205));
        mnCadClientes.setMnemonic('C');
        miCadFornecedores.setMnemonic('F');
        miCadSair.setMnemonic('S');
        for (int i = 0; i < miCadClientes.length; i++) {
            miCadClientes[i] = new JMenuItem(cadCliItens[i]);
            mnCadClientes.add(miCadClientes[i]);
        }
        mnCadastro.add(mnCadClientes);
        mnCadastro.add(miCadFornecedores);
        mnCadastro.add(miCadSair);
        mbBarra.add(mnCadastro);
        setJMenuBar(mbBarra);

        miCadClientes[0].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) { miCadClientesAction0(); }
        });

        miCadClientes[1].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) { miCadClientesAction1(); }
        });

        miCadFornecedores.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) { miCadFornecedoresAction(); }
        });

        miCadSair.addActionListener( e -> System.exit(0));
    }

    private void miCadClientesAction0() {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new PessoaFisica().setVisible(true);
            }
        });
    }

    private void miCadClientesAction1() {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new PessoaJuridica().setVisible(true);
            }
        });
    }

    private void miCadFornecedoresAction() {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Fornecedores().setVisible(true);
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Exercicio4().setVisible(true);
            }
        });
    }
}
