import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Conjunto {

    public void inserirPrimeiro(Scanner r, Set<String> c1) {
        System.out.println("Digite a quantidade de produtos:");
        int qtd = Integer.parseInt(r.nextLine());
        for (int i = 0; i < qtd; i++) {
            System.out.println("Digite o nome do "+ (i+1) + "° produto: ");
            c1.add(r.nextLine());
        }
    }

    public void inserirSegundo(Scanner r, Set<String> c2) {
        System.out.println("Digite a quantidade de produtos:");
        int qtd = Integer.parseInt(r.nextLine());
        for (int i = 0; i < qtd; i++) {
            System.out.println("Digite o nome do "+ (i+1) + "° produto: ");
            c2.add(r.nextLine());
        }
    }

    public void uniao(Set<String> c1, Set<String> c2) {
        Set<String> resultado = new TreeSet<>(c1);
        resultado.addAll(c2);
        System.out.println("União dos dois conjuntos: "+ resultado);
    }

    public void interseccao(Set<String> c1, Set<String> c2) {
        Set<String> resultado = new TreeSet<>(c1);
        resultado.retainAll(c2);
        System.out.println("Intersecção dos dois conjuntos: "+ resultado);
    }

    public void diferenca(Set<String> c1, Set<String> c2) {
        Set<String> resultado = new TreeSet<>(c1);
        resultado.removeAll(c2);
        System.out.println("Diferença entre os dois conjuntos: "+ resultado);
    }

    public void verificacao(Set<String> c1, Set<String> c2) {
        if (c2.containsAll(c1))
            System.out.println("O conjunto 1 está contido no conjunto 2.");
        else
            System.out.println("O conjunto 1 não está contido no conjunto 2.");
    }
}