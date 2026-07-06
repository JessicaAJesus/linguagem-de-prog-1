public class Cliente {
    private int idCliente;
    private String endereco;
    private String telefone;

    public int getIdCliente() {
        return idCliente;
    }

    public String getCliente() {
        return ("\nEndereço: "+ endereco +
                "\nTelefone: "+ telefone);
    }

    protected void setIdCliente(int idCliente){
        this.idCliente = idCliente;
    }

    protected void setCliente(String endereco, String telefone){
        this.endereco = endereco;
        this.telefone = telefone;
    }
}