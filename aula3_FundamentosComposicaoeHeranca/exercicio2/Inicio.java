public class Inicio {
    public static void main(String[] args){
        Conta titular = new Conta();
        titular.setIdConta(123);
        titular.setAgencia(2222);
        titular.setNumeroConta("12341234");
        titular.setCliente("Maria do Carmo", "11122233311", "00001-001", "mariadocarmo123@gmail.com");

        System.out.println("Dados da Conta:");
        System.out.println("Código: "+ titular.getIdConta());
        System.out.println("Agencia: "+ titular.getAgencia());
        System.out.println("Numero da Conta: "+ titular.getNumeroConta());
        System.out.println("Dados do Cliente: "+ titular.getCliente());
    }
}
