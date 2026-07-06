import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Inicio {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);

        System.out.println("Selecione o idioma desejado (pt/en):");
        String idioma = r.nextLine();

        Localizacao loc;

        if (idioma.equals("en"))
            loc = new Localizacao("/localizacao-en.txt");
        else
            loc = new Localizacao("/localizacao-pt.txt");

        try {
            ArrayList<String> lista = new ArrayList<>();
            Lista produtos = new Lista();
            RegistroLog log = new RegistroLog(loc);
            String msg;

            int opc;
            do {

                System.out.println(loc.get("menu.inicio"));
                System.out.println(loc.get("menu.opc1"));
                System.out.println(loc.get("menu.opc2"));
                System.out.println(loc.get("menu.opc3"));
                System.out.println(loc.get("menu.opc4"));
                System.out.println(loc.get("menu.opc5"));
                System.out.println(loc.get("menu.opc6"));
                System.out.println(loc.get("menu.opc7"));
                System.out.println(loc.get("menu.selecao"));
                opc = Integer.parseInt(r.nextLine());

                switch (opc) {
                    case 1:
                        produtos.inserirProd(r, lista, loc);
                        msg = loc.get("msg.inserir");
                        break;
                    case 2:
                        produtos.inserirEmPos(r, lista, loc);
                        msg = loc.get("msg.inserirEmPos");
                        break;
                    case 3:
                        produtos.cNome(r, lista, loc);
                        msg = loc.get("msg.cNome");
                        break;
                    case 4:
                        produtos.cPos(r, lista, loc);
                        msg = loc.get("msg.cPos");
                        break;
                    case 5:
                        produtos.substituir(r, lista, loc);
                        msg = loc.get("msg.substituir");
                        break;
                    case 6:
                        produtos.removerNome(r, lista, loc);
                        msg = loc.get("msg.removerNome");
                        break;
                    case 7:
                        produtos.removerPos(r, lista, loc);
                        msg = loc.get("msg.removerPos");
                        break;
                    default:
                        msg = "";
                        if (opc == 0) {
                            System.out.println(loc.get("mensagem.sair"));
                            log.fechaArq();
                        }
                        else
                            System.out.println(loc.get("mensagem.invalido"));
                }
                if (!msg.isEmpty()) {
                    log.novoRegistro(msg);
                }

            } while (opc != 0);
        } catch (NumberFormatException e) {
            System.out.println(loc.get("erro.formato"));
        } catch (IndexOutOfBoundsException e) {
            System.out.println(loc.get("erro.posicao"));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            r.close();
        }
    }
}