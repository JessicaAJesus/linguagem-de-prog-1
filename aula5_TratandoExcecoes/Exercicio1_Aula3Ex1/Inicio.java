import java.util.Scanner;

public class Inicio {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        Produto p = new Produto();

        while (true) {
            try {
                System.out.println("Digite um valor inteiro para o código:");
                p.setCodigo(Integer.parseInt(r.nextLine()));
                break;
            } catch (NumberFormatException e) {
                System.out.println("Erro: Formato é diferente do solicitado!\n");
            }
        }

        System.out.println("Digite uma descrição para o produto:");
        p.setDescricao(r.nextLine());

        while (true) {
            try {
                System.out.println("Digite um valor para o preço:");
                p.setPreco(Double.parseDouble(r.nextLine()));
                break;
            } catch (NumberFormatException e) {
                System.out.println("Erro: Formato é diferente do solicitado!\n");
            }
        }

        while (true) {
                System.out.println("Digite o estado do produto (sim ou não):");
                String ativo = r.nextLine();

                if (ativo.equals("sim")) {
                    p.setAtivo(true);
                    break;
                } else if (ativo.equals("não")) {
                    p.setAtivo(false);
                    break;
                } else {
                    System.out.println("Erro: Informe apenas sim ou não.\n");
                }
        }

        System.out.println("\nValores do produto:");
        System.out.println("Codigo: " + p.getCodigo());
        System.out.println("Descrição: " + p.getDescricao());
        System.out.println("Preco: " + p.getPreco());
        System.out.println("Estado: " + p.getAtivo());
    }
}