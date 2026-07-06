import java.util.Scanner;

public class Inicio {
    public static void main(String[] args) {

        try (Scanner r = new Scanner(System.in)) {
            int opc;
            int count = 1;
            PessoaFisica[] listaPF = new PessoaFisica[2];
            PessoaJuridica[] listaPJ = new PessoaJuridica[10];
            do {
                System.out.println("Menu");
                System.out.println("1 - Inserir Cliente \n2 - Remover cliente\n3 - Consultar clientes");
                while (true) {
                    try {
                        System.out.println("Selecione uma opção: ");
                        opc = Integer.parseInt(r.nextLine());
                        break;
                    } catch (NumberFormatException e) {
                        System.out.println("Erro: A opção inserida não é um número.");
                    }
                }

                switch (opc) {
                    case 0:
                        System.out.println("Saindo...");
                        break;
                    case 1:
                        System.out.println("Pessoa física (PF) ou Pessoa Jurídica (PJ)?");
                        String tipoPessoa = r.nextLine();

                        if (tipoPessoa.equalsIgnoreCase("PF") || tipoPessoa.equalsIgnoreCase("Pessoa Física")) {
                            PessoaFisica pf = new PessoaFisica();
                            pf.setIdCliente(count++);

                            System.out.println("Nome:");
                            String nNome = r.nextLine();

                            System.out.println("CPF:");
                            String nCpf = r.nextLine();
                            if (nCpf.length() != 11) {
                                throw new IllegalArgumentException("CPF inválido.");
                            }

                            System.out.println("Endereço:");
                            String nEnd = r.nextLine();

                            System.out.println("Telefone:");
                            String nTel = r.nextLine();

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
                                throw new RuntimeException("Lista cheia!");

                        } else if (tipoPessoa.equalsIgnoreCase("PJ") || tipoPessoa.equalsIgnoreCase("Pessoa Jurídica")) {
                            PessoaJuridica pj = new PessoaJuridica();
                            pj.setIdCliente(count++);

                            System.out.println("Razão social:");
                            String nNome = r.nextLine();

                            System.out.println("Cnpj:");
                            String nCnpj = r.nextLine();
                            if (nCnpj.length() != 11) {
                                throw new IllegalArgumentException("CNPJ inválido.");
                            }

                            System.out.println("Endereço:");
                            String nEnd = r.nextLine();

                            System.out.println("Telefone:");
                            String nTel = r.nextLine();

                            pj.setPessoaJuridica(nEnd, nTel, nNome, nCnpj);

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
                                throw new RuntimeException("Lista cheia!");

                        } else {
                            throw new IllegalArgumentException("Tipo de pessoa inválido.");
                        }
                        break;
                    case 2:
                        System.out.print("Remover PF ou PJ? ");
                        String tRemover = r.nextLine();
                        if (!tRemover.equalsIgnoreCase("PF") && !tRemover.equalsIgnoreCase("PJ"))
                            throw new IllegalArgumentException("Tipo de pessoa inválido.");
                        int codRemover;
                        while (true) {
                            try {
                                System.out.print("Código: ");
                                codRemover = Integer.parseInt(r.nextLine());
                                break;
                            } catch (NumberFormatException e) {
                                System.out.println("Erro: A opção inserida não é um número.");
                            }
                        }

                        boolean removido = false;
                        if (tRemover.equalsIgnoreCase("PF")) {
                            for (int i = 0; i < listaPF.length; i++) {
                                if (listaPF[i] != null && listaPF[i].getIdCliente() == codRemover) {
                                    listaPF[i] = null;
                                    removido = true;
                                    break;
                                }
                            }
                        } else if (tRemover.equalsIgnoreCase("PJ")) {
                            for (int i = 0; i < listaPJ.length; i++) {
                                if (listaPJ[i] != null && listaPJ[i].getIdCliente() == codRemover) {
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
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}