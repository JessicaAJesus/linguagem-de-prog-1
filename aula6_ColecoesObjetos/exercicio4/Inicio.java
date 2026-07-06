import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Inicio {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        Map<String, Float> produtos = new HashMap<>();
        Mapa m = new Mapa();

        int opc;
        try {
            do {
                System.out.println("-----Menu-----");
                System.out.println("1 - Inserir produto");
                System.out.println("2 - Consultar nomes e preços dos produtos");
                System.out.println("3 - Consultar somete os nomes dos produtos");
                System.out.println("4 - Consultar somente os preços dos produtos");
                System.out.println("5 - Consultar preço de produto (pelo nome)");
                System.out.println("6 - Consultar se produto existe (pelo nome)");
                System.out.println("7 - Consultar produtos com um determinado preço");
                System.out.println("8 - Alterar preço do produto");
                System.out.println("9 - Remover produto");
                System.out.println("Selecione sua opção:");
                opc = Integer.parseInt(r.nextLine());

                switch (opc) {
                    case 1:
                        m.inserirProd(r, produtos);
                        break;
                    case 2:
                        m.cGeral(r, produtos);
                        break;
                    case 3:
                        m.cNomes(r, produtos);
                        break;
                    case 4:
                        m.cPrecos(r, produtos);
                        break;
                    case 5:
                        m.cPrecoPeloNome(r, produtos);
                        break;
                    case 6:
                        m.cExisteNome(r, produtos);
                        break;
                    case 7:
                        m.cProdPreco(r, produtos);
                        break;
                    case 8:
                        m.alterarPreco(r, produtos);
                        break;
                    case 9:
                        m.removerProd(r, produtos);
                        break;
                    default:
                        if (opc == 0)
                            System.out.println("Saindo...");
                        else
                            System.out.println("Opção inválida.");
                }

            } while (opc != 0);

        } catch (NumberFormatException e) {
            System.out.println("Erro: o formato digitado não foi o esperado.");
        }
    }
}