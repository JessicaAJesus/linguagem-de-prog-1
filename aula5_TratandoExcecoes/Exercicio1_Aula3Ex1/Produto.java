public class Produto {
    private int codigo;
    private String descricao;
    private double preco;
    private boolean ativo;

    public Produto(){
        codigo = 0;
        descricao = "";
        preco = 0;
        ativo = false;
    }

    public int getCodigo(){
        return codigo;
    }

    public String getDescricao(){
        return descricao;
    }

    public double getPreco(){
        return preco;
    }

    public boolean getAtivo(){
        return ativo;
    }

    public void setCodigo(int codigo){
        this.codigo = codigo;
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }

    public void setAtivo(boolean ativo){
        this.ativo = ativo;
    }
}