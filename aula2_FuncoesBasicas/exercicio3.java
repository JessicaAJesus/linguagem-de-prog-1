import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) throws ParseException {
        Scanner r = new Scanner(System.in);

        System.out.println("Digite uma data dd/MM/yyyy");
        String data = r.nextLine();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Calendar d = Calendar.getInstance();
        d.setTime(sdf.parse(data));
        System.out.println(sdf.format(d.getTime()));

        int opc;
        do{
            System.out.println("Selecione uma opção do menu ou 0 para sair:");
            System.out.println("1 - Adicionar dias");
            System.out.println("2 - Adicionar meses");
            System.out.println("3 - Adicionar Anos");
            System.out.println("4 - Subtrair dias");
            System.out.println("5 - Subtrair meses");
            System.out.println("6 - Subtrair anos");
            opc = r.nextInt();

            switch (opc){
                case 0:
                    System.out.println("Saindo...");
                    break;
                case 1:
                    System.out.println("Digite quantos dias deseja adicionar:");
                    int adicionaDias = r.nextInt();
                    d.set(Calendar.DAY_OF_MONTH, d.get(Calendar.DAY_OF_MONTH) + adicionaDias);

                    System.out.println("Data definida:");
                    System.out.println(sdf.format(d.getTime()));
                    break;
                case 2:
                    System.out.println("Digite quantos meses deseja adicionar:");
                    int adicionaMeses = r.nextInt();
                    d.set(Calendar.MONTH, d.get(Calendar.MONTH) + adicionaMeses);

                    System.out.println("Data definida:");
                    System.out.println(sdf.format(d.getTime()));
                    break;
                case 3:
                    System.out.println("Digite quantos anos deseja adicionar:");
                    int adicionaAnos = r.nextInt();
                    d.set(Calendar.YEAR, d.get(Calendar.YEAR) + adicionaAnos);

                    System.out.println("Data definida:");
                    System.out.println(sdf.format(d.getTime()));
                    break;
                case 4:
                    System.out.println("Digite quantos dias deseja subtrair:");
                    int subtraiDias = r.nextInt();
                    d.set(Calendar.DAY_OF_MONTH, d.get(Calendar.DAY_OF_MONTH) - subtraiDias);

                    System.out.println("Data definida:");
                    System.out.println(sdf.format(d.getTime()));
                    break;
                case 5:
                    System.out.println("Digite quantos meses deseja subtrair:");
                    int subtraiMeses = r.nextInt();
                    d.set(Calendar.MONTH, d.get(Calendar.MONTH) - subtraiMeses);

                    System.out.println("Data definida:");
                    System.out.println(sdf.format(d.getTime()));
                    break;
                case 6:
                    System.out.println("Digite quantos anos deseja subtrair:");
                    int subtraiAnos = r.nextInt();
                    d.set(Calendar.YEAR, d.get(Calendar.YEAR) - subtraiAnos);

                    System.out.println("Data definida:");
                    System.out.println(sdf.format(d.getTime()));
                    break;
            }
        } while (opc != 0);
    }
}
