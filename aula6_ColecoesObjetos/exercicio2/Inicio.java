import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Inicio {
    public static void main(String[] args) {

        try (Scanner r = new Scanner(System.in)) {
            int opc;
            Deque<String> fila = new LinkedList<>();
            Fila f = new Fila();

            do {
                System.out.println("-----Menu-----");
                System.out.println("1 - Inserir pessoa");
                System.out.println("2 - Remover pessoa");
                System.out.println("3 - Imprimir fila");
                System.out.println("Selecione sua opção:");
                opc = Integer.parseInt(r.nextLine());

                switch (opc) {
                    case 1:
                        f.inserir(r, fila);
                        break;
                    case 2:
                        f.remover(fila);
                        break;
                    case 3:
                        f.exibir(fila);
                        break;
                    default:
                        if (opc == 0)
                            System.out.println("Saindo...");
                        else
                            System.out.println("Opção inválida.");
                }

            } while (opc != 0);
        } catch (NumberFormatException e) {
            System.out.println("Erro: A opção selecionada não é um número inteiro.");
        }
    }
}