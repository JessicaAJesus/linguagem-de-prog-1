import java.util.ArrayList;
import java.util.Scanner;

public class Inicio {
    public static void main(String[] args) {

        try (Scanner r = new Scanner(System.in)) {
            ArrayList<String> lista = new ArrayList<>();
            Lista produtos = new Lista();
            int opc;
            do {
                System.out.println("-----Menu-----");
                System.out.println("1 - Inserir produto");
                System.out.println("2 - Inserir produto em posição específica");
                System.out.println("3 - Consultar produto (pelo nome)");
                System.out.println("4 - Consultar produto (pela posição)");
                System.out.println("5 - Substituir produto");
                System.out.println("6 - Remover produto (pelo nome)");
                System.out.println("7 - Remover produto (pela posição)");
                System.out.println("Selecione sua opção:");
                opc = Integer.parseInt(r.nextLine());

                switch (opc) {
                    case 1:
                        produtos.inserirProd(r, lista);
                        break;
                    case 2:
                        produtos.inserirEmPos(r, lista);
                        break;
                    case 3:
                        produtos.cNome(r, lista);
                        break;
                    case 4:
                        produtos.cPos(r, lista);
                        break;
                    case 5:
                        produtos.substituir(r, lista);
                        break;
                    case 6:
                        produtos.removerNome(r, lista);
                        break;
                    case 7:
                        produtos.removerPos(r, lista);
                        break;
                    default:
                        if (opc == 0)
                            System.out.println("Saindo...");
                        else
                            System.out.println("Opção inválida.");
                }

            } while (opc != 0);
        } catch (NumberFormatException e) {
            System.out.println("Erro: Formato digitado é diferente do esperado.");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Erro: A posição digitada não pertence a lista.");
        }
    }
}