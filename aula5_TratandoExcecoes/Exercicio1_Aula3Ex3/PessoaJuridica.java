public class PessoaJuridica extends Cliente {
    private String razaoSocial;
    private String cnpj;

    public String getPessoaJuridica(){
        return ("\nRazaoSocial: "+ razaoSocial +
                "\nCnpj: "+ cnpj + getCliente());
    }

    public void setPessoaJuridica(String endereco, String telefone, String razaoSocial, String cnpj) {
        setCliente(endereco, telefone);
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
    }
}