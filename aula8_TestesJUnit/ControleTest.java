
import org.junit.jupiter.api.Test;

import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ControleTest {
    @Test
    public void deveRetornarProdutosComEstoqueInsuficiente () {
        Estoque estoque = new Estoque("Mercadinho");

        Produto p1 = new Produto("Água mineral sem gás", 25, 20, 50);
        Produto p2 = new Produto("Arroz", 7, 15, 30);
        Produto p3 = new Produto("Feijão", 16, 15, 30);

        estoque.armazena(p1);
        estoque.armazena(p2);
        estoque.armazena(p3);

        Controle controle = new Controle();
        controle.controlaEstoques(estoque);

        List<Produto> resultado = controle.getProdutosComEstoqueInsuficiente();

        assertEquals(1, resultado.size());
        assertEquals("Arroz", resultado.get(0).getNome());
    }

    @Test
    public void deveRetornarProdutosComEstoqueExcedente () {
        Estoque estoque = new Estoque("Mercadinho");

        Produto p1 = new Produto("Bolacha", 60, 20, 50);
        Produto p2 = new Produto("Leite", 7, 15, 30);
        Produto p3 = new Produto("Pão de forma", 35, 15, 30);

        estoque.armazena(p1);
        estoque.armazena(p2);
        estoque.armazena(p3);

        Controle controle = new Controle();
        controle.controlaEstoques(estoque);

        List<Produto> resultado = controle.getProdutosComEstoqueExcedente();

        assertEquals(2, resultado.size());
        assertEquals("Bolacha", resultado.get(0).getNome());
        assertEquals("Pão de forma", resultado.get(1).getNome());
    }

    @Test
    public void deveRetornarProdutosComEstoqueZerado () {
        Estoque estoque = new Estoque("Mercadinho");

        Produto p1 = new Produto("Água mineral com gás", 0, 10, 20);
        Produto p2 = new Produto("Café", 0, 15, 30);
        Produto p3 = new Produto("Suco de laranja", 35, 15, 30);

        estoque.armazena(p1);
        estoque.armazena(p2);
        estoque.armazena(p3);

        Controle controle = new Controle();
        controle.controlaEstoques(estoque);

        List<Produto> resultado = controle.getProdutosComEstoqueZerado();

        assertEquals(2, resultado.size());
        assertEquals("Água mineral com gás", resultado.get(0).getNome());
        assertEquals("Café", resultado.get(1).getNome());
    }

    @Test
    public void deveRetornarProdutosComEstoqueAdequado () {
        Estoque estoque = new Estoque("Mercadinho");

        Produto p1 = new Produto("Biscoito", 25, 20, 50);
        Produto p2 = new Produto("Sal", 14, 15, 30);
        Produto p3 = new Produto("Açucar", 19, 15, 30);

        estoque.armazena(p1);
        estoque.armazena(p2);
        estoque.armazena(p3);

        Controle controle = new Controle();
        controle.controlaEstoques(estoque);

        List<Produto> resultado = controle.getProdutosComEstoqueAdequado();

        assertEquals(2, resultado.size());
        assertEquals("Biscoito", resultado.get(0).getNome());
        assertEquals("Açucar", resultado.get(1).getNome());
    }

    @Test
    public void deveRetornarTodasListasVaziasParaEstoqueSemProdutos() {
        Estoque estoque = new Estoque("Mercadinho");

        Controle controle = new Controle();

        controle.controlaEstoques(estoque);

        assertEquals(0, controle.getProdutosComEstoqueInsuficiente().size());
        assertEquals(0, controle.getProdutosComEstoqueExcedente().size());
        assertEquals(0, controle.getProdutosComEstoqueZerado().size());
        assertEquals(0, controle.getProdutosComEstoqueAdequado().size());
    }

    @Test
    public void deveRetornarListaVaziaParaEstoqueQueNaoContemProdutosComEstoqueZerado() {
        Estoque estoque = new Estoque("Mercadinho");

        estoque.armazena(new Produto("Laranja", 10, 5, 20));
        estoque.armazena(new Produto("Maça", 1, 5, 20));

        Controle controle = new Controle();

        controle.controlaEstoques(estoque);

        List<Produto> resultado = controle.getProdutosComEstoqueZerado();
        assertEquals(0, resultado.size());
    }
}