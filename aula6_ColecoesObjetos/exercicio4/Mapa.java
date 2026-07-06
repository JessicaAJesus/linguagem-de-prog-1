import java.util.Map;
import java.util.Scanner;

public class Mapa {

    public void inserirProd(Scanner r, Map<String, Float> p) {
        System.out.println("Digite o nome do produto:");
        String chave = r.nextLine();
        System.out.println("Digite o preço do produto:");
        float preco = Float.parseFloat(r.nextLine());
        p.put(chave, preco);
    }

    public void cGeral(Scanner r, Map<String, Float> p) {
        if (p.isEmpty()){
            System.out.println("Nenhum produto cadastrado.");
            return;
        }
        System.out.println(p);
    }

    public void cNomes(Scanner r, Map<String, Float> p) {
        if (p.isEmpty()){
            System.out.println("Nenhum produto cadastrado.");
            return;
        }
        System.out.println(p.keySet());
    }

    public void cPrecos(Scanner r, Map<String, Float> p) {
        if (p.isEmpty()){
            System.out.println("Nenhum produto cadastrado.");
            return;
        }
        System.out.println(p.values());
    }

    public void cPrecoPeloNome(Scanner r, Map<String, Float> p) {
        System.out.println("Digite o nome do produto que deseja consultar o preço:");
        String chave = r.nextLine();

        if (p.containsKey(chave))
            System.out.println("O preço do produto com esse nome é: "+ p.get(chave));
        else
            System.out.println("Não existe nenhum produto com esse nome.");
    }

    public void cExisteNome(Scanner r, Map<String, Float> p) {
        System.out.println("Digite o nome do produto:");
        String chave = r.nextLine();
        System.out.println("O produto "+ chave + (p.containsKey(chave) ? "": " não") +" existe.");
    }

    public void cProdPreco(Scanner r, Map<String, Float> p) {
        System.out.println("Digite o preço do(s) produto(s) que deseja consultar");
        float preco = Float.parseFloat(r.nextLine());

        if (!p.containsValue(preco)) {
            System.out.println("Nenhum produto com esse preço encontrado.");
            return;
        }

        System.out.println("Produtos com esse preço:");

        for (String chave : p.keySet()) {
            if(p.get(chave).equals(preco)) {
                System.out.println(chave);
            }
        }
    }

    public void alterarPreco(Scanner r, Map<String, Float> p) {
        System.out.println("Digite o nome do produto que deseja alterar o preço:");
        String chave = r.nextLine();
        if (p.containsKey(chave)) {
            System.out.println("Digite o novo preço:");
            float preco = Float.parseFloat(r.nextLine());
            p.put(chave, preco);
            System.out.println("Preço atualizado!");
        } else
            System.out.println("Produto não encontrado.");
    }

    public void removerProd(Scanner r, Map<String, Float> p) {
        System.out.println("Digite o nome do produto que deseja remover");
        String chave = r.nextLine();
        if (p.containsKey(chave)) {
            p.remove(chave);
            System.out.println("Produto removido!");
        } else {
            System.out.println("Produto não encontrado.");
        }

    }
}
