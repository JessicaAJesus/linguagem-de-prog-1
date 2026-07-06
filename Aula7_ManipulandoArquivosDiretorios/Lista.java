import java.util.ArrayList;
import java.util.Scanner;

public class Lista {

    public void inserirProd(Scanner r, ArrayList<String> l, Localizacao loc) {
        System.out.println(loc.get("lista.nomeProd"));
        l.add(r.nextLine());
    }

    public void inserirEmPos(Scanner r, ArrayList<String> l, Localizacao loc) {
        System.out.println(loc.get("lista.nomeProd"));
        String nome = r.nextLine();
        System.out.println(loc.get("lista.posProd"));
        int pos = Integer.parseInt(r.nextLine());
        l.add(pos, nome);
    }

    public void cNome(Scanner r, ArrayList<String> l, Localizacao loc) {
        System.out.println(loc.get("lista.nomeProd"));
        String nome = r.nextLine();
        int pos = l.indexOf(nome);
        if (pos != -1) {
            System.out.println(loc.get("lista.resultadoPosProd") + nome +"': "+ pos);
        } else {
            System.out.println(loc.get("lista.naoEncontrado"));
        }
    }

    public void cPos(Scanner r, ArrayList<String> l, Localizacao loc) {
        System.out.println(loc.get("lista.posProd"));
        int pos = Integer.parseInt(r.nextLine());
        System.out.println(pos +loc.get("lista.resultadoPos") + " " + l.get(pos));
    }

    public void substituir(Scanner r, ArrayList<String> l, Localizacao loc) {
        System.out.println(loc.get("lista.posProd"));
        int pos = Integer.parseInt(r.nextLine());
        System.out.println(loc.get("lista.nomeNovo"));
        String nome = r.nextLine();
        l.set(pos, nome);
    }

    public void removerNome(Scanner r, ArrayList<String> l, Localizacao loc) {
        System.out.println(loc.get("lista.nomeProd"));
        l.remove(r.nextLine());
        System.out.println(loc.get("lista.remocao") + l);
    }

    public void removerPos(Scanner r, ArrayList<String> l, Localizacao loc) {
        System.out.println(loc.get("lista.nomeProd"));
        l.remove(Integer.parseInt(r.nextLine()));
        System.out.println(loc.get("lista.remocao") + l);
    }
}