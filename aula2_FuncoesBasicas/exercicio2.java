public class exercicio2 {
    public static void main(String[] args){
        String tOriginal = "Uma ideia traz outra; o boticário imaginou que, uma vez preso o alienista, viriam também buscá-lo\n" +
                "a ele, na qualidade de cúmplice. Esta ideia foi o melhor dos vesicatórios. Crispim Soares ergueu-se,\n" +
                "disse que estava bom, que ia sair; e apesar de todos os esforços e protestos da consorte vestiu-se e\n" +
                "saiu. Os velhos cronistas são unânimes em dizer que a certeza de que o marido ia colocar-se\n" +
                "nobremente ao lado do alienista consolou grandemente a esposa do boticário; e notam com muita\n" +
                "perspicácia, o imenso poder moral de uma ilusão; porquanto, o boticário caminhou resolutamente\n" +
                "ao palácio do governo, não à casa do alienista. Ali chegando, mostrou-se admirado de não ver o\n" +
                "barbeiro, a quem ia apresentar os seus protestos de adesão, não o tendo feito desde a véspera por\n" +
                "enfermo. E tossia com algum custo. Os altos funcionários que lhe ouviam esta declaração,\n" +
                "sabedores da intimidade do boticário com o alienista, compreenderam toda a importância da\n" +
                "adesão nova e trataram a Crispim Soares com apurado carinho; afirmaram-lhe que o barbeiro não\n" +
                "tardava; Sua Senhoria tinha ido à Casa Verde, a negócio importante, mas não tardava. Deram-lhe\n" +
                "cadeira, refrescos, elogios; disseram-lhe que a causa do ilustre Porfírio era a de todos os patriotas;\n" +
                "ao que o boticário ia repetindo que sim, que nunca pensara outra coisa, que isso mesmo mandaria\n" +
                "declarar a Sua Majestade.";

        //a
        String frase = "E tossia com algum custo";
        int inicio = tOriginal.indexOf(frase);
        System.out.println("a) "+tOriginal.substring(inicio,inicio + frase.length()));

        //b
        tOriginal = tOriginal.replace("alienista", "psiquiatra");
        System.out.println("\nb) "+tOriginal);

        //c
        String nome = "Crispim Soares";
        tOriginal = tOriginal.replace(nome, nome.toUpperCase());
        System.out.println("\nc) "+tOriginal);

        //d
        System.out.println("\nd)");
        System.out.println("texto contem vila: "+tOriginal.contains("vila"));
        System.out.println("texto contem custo: "+tOriginal.contains("custo"));
        System.out.println("texto contem receio: "+tOriginal.contains("receio"));

        //e
        int cont = 0;
        int indexN = tOriginal.indexOf("não");
        while (indexN != -1) {
            cont++;
            indexN = tOriginal.indexOf("não", indexN + 1);
        }
        System.out.println("\ne) a palavra 'não' aparece " + cont + " vezes");

        //f
        System.out.println("\nf) o texto possui "+ tOriginal.length() +" caracteres");

        //g
        String tSemEspaco = tOriginal.replace(" ", "");
        int qtdEspaco = tOriginal.length() - tSemEspaco.length();
        System.out.println("\ng) O texto possui "+ qtdEspaco +" espaços");
    }
}