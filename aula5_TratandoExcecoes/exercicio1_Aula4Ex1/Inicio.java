import java.util.Scanner;

public class Inicio {
    public static void main(String[] args) {
        int opc;
        try (Scanner r = new Scanner(System.in)) {
            Pesquisa p = null;
            String texto = "";
            do {
                System.out.println("-----Menu-----");
                System.out.println("1) Informar texto");
                System.out.println("2) Buscar string");
                System.out.println("3) Buscar string no inicio");
                System.out.println("4) Buscar string no fim");
                while (true) {
                    try {
                        System.out.println("Digite sua opção: ");
                        opc = Integer.parseInt(r.nextLine());
                        break;
                    } catch (NumberFormatException e) {
                        System.out.println("Erro: A opção digitada não é um número.");
                    }
                }

                switch (opc) {
                    case 1:
                        System.out.print("Digite um texto: ");
                        texto = r.nextLine();
                        p = new Pesquisa();
                        p.setTexto(texto);
                        break;
                    case 2:
                        p = new Pesquisa();
                        break;
                    case 3:
                        p = new PesquisaInicio();
                        break;
                    case 4:
                        p = new PesquisaFim();
                        break;
                    default:
                        if (opc != 0)
                            System.out.println("Opção inválida!");
                        else
                            System.out.println("Programa encerrado!");
                        break;
                }
                if (opc == 2 || opc == 3 || opc == 4) {
                    p.setTexto(texto);
                    if (texto.isEmpty()) {
                        throw new IllegalStateException("Nenhum texto foi informado ainda.");
                    }
                    System.out.print("Digite o texto que deseja buscar: ");
                    String busca = r.nextLine();
                    if (busca.isEmpty()) {
                        throw new IllegalArgumentException("Texto de busca não pode ser vazio.");
                    }
                    System.out.println("A cadeia de caracteres " + (p.buscarString(r.nextLine()) ? "" : "não ") + "existe no texto.");
                }

            } while (opc != 0);

        } catch (IllegalStateException | IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("\nOperação de busca finalizada.");
        }

    }
}