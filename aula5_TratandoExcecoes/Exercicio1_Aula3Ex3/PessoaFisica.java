public class PessoaFisica extends Cliente {
    private String nome;
    private String cpf;

    public String getPessoaFisica(){
        return ("\nNome: "+ nome +
                "\nCPF: "+ cpf + getCliente());
    }

    public void setPessoaFisica(String endereco, String telefone, String nome, String cpf) {
        setCliente(endereco, telefone);
        this.nome = nome;
        this.cpf = cpf;
    }
}