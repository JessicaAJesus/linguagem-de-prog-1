import java.util.ArrayList;
import java.util.List;

public class Controle {
    private List<Produto> produtosComEstoqueInsuficiente = new ArrayList<>();
    private List<Produto> produtosComEstoqueExcedente = new ArrayList<>();
    private List<Produto> produtosComEstoqueZerado = new ArrayList<>();
    private List<Produto> produtosComEstoqueAdequado = new ArrayList<>();

    public void controlaEstoques (Estoque estoque) {
        produtosComEstoqueInsuficiente.clear();
        produtosComEstoqueExcedente.clear();
        produtosComEstoqueZerado.clear();
        produtosComEstoqueAdequado.clear();

        for (Produto p : estoque.getProdutos()) {
            if (p.getQuantidade() == 0) {
                produtosComEstoqueZerado.add(p);
            } else if (p.getQuantidade() < p.getEstoqueMinimo()) { //só pode fazer parte de uma lista
                produtosComEstoqueInsuficiente.add(p);
            } else if (p.getQuantidade() > p.getEstoqueMaximo()) {
                produtosComEstoqueExcedente.add(p);
            } else {
                produtosComEstoqueAdequado.add(p);
            }
        }
    }

    public List<Produto> getProdutosComEstoqueInsuficiente() {
        return produtosComEstoqueInsuficiente;
    }

    public List<Produto> getProdutosComEstoqueExcedente() {
        return produtosComEstoqueExcedente;
    }

    public List<Produto> getProdutosComEstoqueZerado() {
        return produtosComEstoqueZerado;
    }

    public List<Produto> getProdutosComEstoqueAdequado() {
        return produtosComEstoqueAdequado;
    }
}