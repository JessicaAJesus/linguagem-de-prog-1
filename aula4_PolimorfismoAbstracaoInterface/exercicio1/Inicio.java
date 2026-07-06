import java.util.Scanner;

public class Inicio {
    public static void main(String[] args) {
        int opc;
        Scanner r = new Scanner(System.in);
        Pesquisa p = null;
        String texto = "";

        do {
            System.out.println("-----Menu-----");
            System.out.println("1) Informar texto");
            System.out.println("2) Buscar string");
            System.out.println("3) Buscar string no inicio");
            System.out.println("4) Buscar string no fim");
            System.out.println("Digite sua opção: ");
            opc = Integer.parseInt(r.nextLine());

            switch (opc){
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
            if (opc == 2 || opc == 3|| opc == 4) {
                p.setTexto(texto);
                System.out.print("Digite o texto que deseja buscar: ");
                System.out.println("A cadeia de caracteres " + (p.buscarString(r.nextLine()) ? "" : "não ") + "existe no texto.");
            }

        } while (opc != 0);

        r.close();
    }
}