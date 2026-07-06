import java.util.ArrayList;
import java.util.Scanner;

public class Lista {
    public void inserirProd(Scanner r, ArrayList<String> l) {
        System.out.println("Digite o produto que deseja adicionar:");
        l.add(r.nextLine());
    }

    public void inserirEmPos(Scanner r, ArrayList<String> l) {
        System.out.println("Digite o produto que deseja adicionar:");
        String nome = r.nextLine();
        System.out.println("Digite a posição para o produto:");
        int pos = Integer.parseInt(r.nextLine());
        l.add(pos, nome);
    }

    public void cNome(Scanner r, ArrayList<String> l) {
        System.out.println("Digite o nome do produto que deseja consultar:");
        String nome = r.nextLine();
        int pos = l.indexOf(nome);
        if (pos != -1) {
            System.out.println("Posição da 1a ocorrência de '"+ nome +"': "+ pos);
        } else {
            System.out.println("Produto não encontrado");
        }
    }

    public void cPos(Scanner r, ArrayList<String> l) {
        System.out.println("Digite a posição que deseja consultar:");
        int pos = Integer.parseInt(r.nextLine());
        System.out.println(pos+1 +"° aluno: "+ l.get(pos));
    }

    public void substituir(Scanner r, ArrayList<String> l) {
        System.out.println("Digite a posição do produto que deseja substituir:");
        int pos = Integer.parseInt(r.nextLine());
        System.out.println("Digite o nome do novo produto:");
        String nome = r.nextLine();
        l.set(pos, nome);
    }

    public void removerNome(Scanner r, ArrayList<String> l) {
        System.out.println("Digite o nome do produto que deseja remover:");
        l.remove(r.nextLine());
        System.out.println("Lista após a remoção:"+ l);
    }

    public void removerPos(Scanner r, ArrayList<String> l) {
        System.out.println("Digite a posição do produto que deseja remover:");
        l.remove(Integer.parseInt(r.nextLine()));
        System.out.println("Lista após a remoção: "+ l);
    }
}
