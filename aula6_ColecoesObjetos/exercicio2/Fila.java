import java.util.Deque;
import java.util.Scanner;

public class Fila {
    public void inserir(Scanner r, Deque<String> f) {
        System.out.println("Digite o nome da pessoa: ");
        f.addLast(r.nextLine());
    }

    public void remover(Deque<String> f) {
        if (!f.isEmpty()) {
            String removido = f.pollFirst();
            System.out.println("Pessoa removida: "+ removido);
        } else {
            System.out.println("Fila vazia.");
        }
    }

    public void exibir(Deque<String> f) {
        System.out.println(f);
    }
}