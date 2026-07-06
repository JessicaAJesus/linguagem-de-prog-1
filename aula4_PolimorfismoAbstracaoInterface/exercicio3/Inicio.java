import java.util.Scanner;

public class Inicio {
    public static void main(String[] args) {
        int opc;
        Scanner r = new Scanner(System.in);

        do {
            System.out.println("-----Menu-----");
            System.out.println("1) Retângulo");
            System.out.println("2) Círculo");
            System.out.println("Digite sua opção (ou 0 para sair): ");
            opc = Integer.parseInt(r.nextLine());

            switch (opc){
                case 1:
                    System.out.println("Base do retângulo: ");
                    float br = Float.parseFloat(r.nextLine());
                    System.out.println("Altura do retângulo");
                    float ar = Float.parseFloat(r.nextLine());
                    System.out.println("Cor do retângulo:");
                    String cr = r.nextLine();
                    new Retangulo(br, ar, cr);
                    break;
                case 2:
                    System.out.println("Raio do círculo: ");
                    float rc = Float.parseFloat(r.nextLine());
                    System.out.println("Cor do círculo:");
                    String cc = r.nextLine();
                    new Circulo(rc, cc);
                    break;
                default:
                    if (opc != 0)
                        System.out.println("Opção inválida!");
                    else
                        System.out.println("Programa encerrado!");
                    break;
            }

        } while (opc != 0);

        r.close();
    }
}