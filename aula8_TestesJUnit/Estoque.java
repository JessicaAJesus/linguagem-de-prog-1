import java.util.ArrayList;
import java.util.List;

public class Estoque {
    private String loja;
    private List<Produto> produtos = new ArrayList<>();

    public Estoque (String loja) {
        this.loja = loja;
        this.produtos = new ArrayList<>();
    }

    public void armazena (Produto produto) {
        this.produtos.add(produto);
    }

    public String getLoja () {
        return loja;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }
}