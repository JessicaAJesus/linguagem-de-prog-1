import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

public class Inicio {
    public static void main(String[] args) {
        int opc;
        Scanner r = new Scanner(System.in);

        do {
            System.out.println("-----Menu-----");
            System.out.println("1) Retângulo");
            System.out.println("2) Círculo");
            while (true) {
                System.out.println("Digite sua opção (ou 0 para sair): ");
                try{
                    opc = Integer.parseInt(r.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Erro: o formato digitado não é o esperado.");
                }
            }

            switch (opc){
                case 1:
                    while (true) {
                        try {
                            System.out.println("Base do retângulo: ");
                            float br = Float.parseFloat(r.nextLine());
                            System.out.println("Altura do retângulo");
                            float ar = Float.parseFloat(r.nextLine());
                            System.out.println("Cor do retângulo:");
                            String cr = r.nextLine();
                            if (cr.isEmpty()) {
                                throw new IllegalArgumentException("Erro: Cor não pode ser vazia.");
                            }
                            new Retangulo(br, ar, cr);
                            break;
                        } catch (NumberFormatException e) {
                            System.out.println("Erro: o formato digitado não é o esperado.");
                        } catch (IllegalArgumentException e) {
                            System.out.println(e.getMessage());
                        }
                    }
                    break;
                case 2:
                    while (true) {
                        try {
                            System.out.println("Raio do círculo: ");
                            float rc = Float.parseFloat(r.nextLine());
                            System.out.println("Cor do círculo:");
                            String cc = r.nextLine();
                            if (cc.isEmpty()) {
                                throw new IllegalArgumentException("Erro: Cor não pode ser vazia.");
                            }
                            new Circulo(rc, cc);
                            break;
                        } catch (NumberFormatException e) {
                            System.out.println("Erro: o formato digitado não é o esperado.");
                        } catch (IllegalArgumentException e) {
                            System.out.println(e.getMessage());
                        }
                    }
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