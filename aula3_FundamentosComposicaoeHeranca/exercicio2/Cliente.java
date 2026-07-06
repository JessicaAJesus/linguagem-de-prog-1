public class Cliente {
    private String nome;
    private String cpf;
    private String endereco;
    private String email;

    public String getCliente() {
        return ("\n Nome: "+ nome +
                "\n CPF: "+ cpf +
                "\n Endereco: "+ endereco +
                "\n Email: "+ email);
    }

    public void setCliente(String nome, String cpf, String endereco, String email){
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.email = email;
    }
}
