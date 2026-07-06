import java.util.Scanner;

public class Inicio {
    public static void main(String[] args) {

        Produto p = new Produto();
        Scanner r = new Scanner(System.in);

        System.out.println("Digite um valor inteiro para o código:");
        p.setCodigo(r.nextInt());
        r.nextLine();

        System.out.println("Digite uma descrição para o produto:");
        p.setDescricao(r.nextLine());

        System.out.println("Digite um valor para o preço:");
        p.setPreco(r.nextFloat());

        System.out.println("Digite o estado do produto (true ou false):");
        p.setAtivo(r.nextBoolean());

        System.out.println("\nValores do produto:");
        System.out.println("Codigo: " + p.getCodigo());
        System.out.println("Descrição: " + p.getDescricao());
        System.out.println("Preco: " + p.getPreco());
        System.out.println("Estado: " + p.getAtivo());

        r.close();
    }
}