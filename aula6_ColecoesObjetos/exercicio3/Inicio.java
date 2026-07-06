import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Inicio {
    public static void main(String[] args) {

        try (Scanner r = new Scanner(System.in)) {
            int opc;
            Set<String> conjunto1 = new TreeSet<>();
            Set<String> conjunto2 = new TreeSet<>();
            Conjunto c = new Conjunto();
            
            do {
                System.out.println("-----Menu-----");
                System.out.println("1 - Inserir produtos no 1° Conjunto");
                System.out.println("2 - Inserir produtos no 2° conjunto");
                System.out.println("3 - Consultar todos produtos nos dois conjuntos (união)");
                System.out.println("4 - Consultar apenas produtos em comum nos dois conjuntos (intersecção)");
                System.out.println("5 - Consultar produtos do 1° conjunto que não existem no 2° conjunto (diferença)");
                System.out.println("6 - Consultar se o 1° conjunto está contido no 2° conjunto (verificação de subconjunto)");
                System.out.println("Selecione sua opção:");
                opc = Integer.parseInt(r.nextLine());

                switch (opc) {
                    case 1:
                        c.inserirPrimeiro(r, conjunto1);
                        break;
                    case 2:
                        c.inserirSegundo(r, conjunto2);
                        break;
                    case 3:
                        c.uniao(conjunto1, conjunto2);
                        break;
                    case 4:
                        c.interseccao(conjunto1, conjunto2);
                        break;
                    case 5:
                        c.diferenca(conjunto1, conjunto2);
                        break;
                    case 6:
                        c.verificacao(conjunto1, conjunto2);
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
        }
    }
}