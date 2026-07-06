import java.util.Scanner;

public class Inicio {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        int opc; int count = 1;

        PessoaFisica[] listaPF = new PessoaFisica[10];
        PessoaJuridica[] listaPJ = new PessoaJuridica[10];

        do{
            System.out.println("Menu");
            System.out.println("1 - Inserir Cliente \n2 - Remover cliente\n3 - Consultar clientes");
            System.out.println("Selecione uma opção: ");
            opc = r.nextInt();

            switch (opc){
                case 0:
                    System.out.println("Saindo...");
                    break;
                case 1:
                    System.out.println("Pessoa física (PF) ou Pessoa Jurídica (PJ)?");
                    String tipoPessoa = r.next();

                    if (tipoPessoa.equals("PF") || tipoPessoa.equals("Pessoa Física")) {
                        PessoaFisica pf = new PessoaFisica();
                        pf.setIdCliente(count++);

                        System.out.println("Nome:");
                        r.nextLine();
                        String nNome = r.nextLine();

                        System.out.println("CPF:");
                        String nCpf = r.next();

                        System.out.println("Endereço:");
                        r.nextLine();
                        String nEnd = r.nextLine();

                        System.out.println("Telefone:");
                        String nTel = r.next();

                        pf.setPessoaFisica(nEnd, nTel, nNome, nCpf);

                        boolean cadastrou = false;
                        for (int i = 0; i < listaPF.length; i++) {
                            if (listaPF[i] == null) {
                                listaPF[i] = pf;
                                cadastrou = true;
                                break;
                            }
                        }
                        if (cadastrou)
                            System.out.println("PF cadastrada!");
                        else
                            System.out.println("Lista cheia! Tente remover alguém antes de cadastrar novamente.");

                    } else if (tipoPessoa.equals("PJ") || tipoPessoa.equals("Pessoa Jurídica")) {
                        PessoaJuridica pj = new PessoaJuridica();
                        pj.setIdCliente(count++);

                        System.out.println("Razão social:");
                        r.nextLine();
                        String nNome = r.nextLine();

                        System.out.println("Cnpj:");
                        String nCpf = r.next();

                        System.out.println("Endereço:");
                        r.nextLine();
                        String nEnd = r.nextLine();

                        System.out.println("Telefone:");
                        String nTel = r.next();

                        pj.setPessoaJuridica(nEnd, nTel, nNome, nCpf);

                        boolean cadastrou = false;
                        for (int i = 0; i < listaPJ.length; i++) {
                            if (listaPJ[i] == null) {
                                listaPJ[i] = pj;
                                cadastrou = true;
                                break;
                            }
                        }
                        if (cadastrou)
                            System.out.println("PJ cadastrada!");
                        else
                            System.out.println("Lista cheia! Tente remover alguém antes de cadastrar novamente.");

                    } else {
                        System.out.println("Opção não especificada.");
                        break;
                    }
                    break;
                case 2:
                    System.out.print("Remover PF ou PJ? ");
                    String tRemover = r.next();
                    System.out.print("Código: ");
                    int codRemover = r.nextInt();

                    boolean removido = false;
                    if(tRemover.equals("PF")) {
                        for(int i = 0; i < listaPF.length; i++) {
                            if(listaPF[i] != null && listaPF[i].getIdCliente() == codRemover) {
                                listaPF[i] = null;
                                removido = true;
                                break;
                            }
                        }
                    } else if(tRemover.equals("PJ")) {
                        for(int i = 0; i < listaPF.length; i++) {
                            if(listaPJ[i] != null && listaPJ[i].getIdCliente() == codRemover) {
                                listaPJ[i] = null;
                                removido = true;
                                break;
                            }
                        }
                    }
                    System.out.println(removido ? "Removido!" : "Código não encontrado.");
                    break;
                case 3:
                    System.out.println("LISTA PESSOAS FÍSICAS");
                    for (PessoaFisica p : listaPF) {
                        if (p != null) {
                            System.out.println("\nCód: " + p.getIdCliente() + " | Dados: " + p.getPessoaFisica());
                        }
                    }
                    System.out.println("\nLISTA PESSOAS JURÍDICAS");
                    for (PessoaJuridica j : listaPJ) {
                        if (j != null) {
                            System.out.println("\nCód: " + j.getIdCliente() + " | Dados: " + j.getPessoaJuridica());
                        }
                    }
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        } while (opc != 0);
    }
}