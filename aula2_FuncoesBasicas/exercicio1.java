import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        int opc = 1;
        Scanner r = new Scanner(System.in);

        do {
            System.out.println("Escolha uma opção do menu ou 0 para sair");
            System.out.println("1 - Arredondar número");
            System.out.println("2 - Calcular raiz quadrada");
            System.out.println("3 - Calcular a potência");

            opc = r.nextInt();

            switch (opc){
                case 0:
                    System.out.println("Saindo...");
                    break;
                case 1:
                    System.out.println("Digite um valor decimal:");
                    double vArr = r.nextDouble();

                    System.out.println("Valor arredondado: "+ Math.round(vArr));
                    break;
                case 2:
                    System.out.println("Digite um valor maior ou igual a zero:");
                    double vRaiz = r.nextDouble();

                    System.out.println("Raiz quadrada de "+ vRaiz+ ": "+ Math.sqrt(vRaiz));
                    break;
                case 3:
                    System.out.println("Digite o valor da base da potência:");
                    double base = r.nextDouble();

                    System.out.println("Digite o valor do expoente:");
                    double expoente = r.nextDouble();

                    System.out.println("O resultado da potência é: "+ Math.pow(base, expoente));
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        } while (opc != 0);

        r.close();
    }
}