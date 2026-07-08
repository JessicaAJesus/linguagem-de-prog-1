import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class Localizacao {
    private final HashMap<String, String> textos = new HashMap<>();

    public String getDiretorioAtual() {
        return System.getProperty("user.dir");
    }

    public Localizacao(String lang) {
        carregarArquivo(lang);
    }

    private void carregarArquivo (String lang) {
        try (FileReader fr = new FileReader(getDiretorioAtual() + lang)) {
            BufferedReader br = new BufferedReader(fr);
            String linha;

            while ((linha = br.readLine()) != null) {
                String[] partes = linha.split("=");

                if (partes.length == 2) {
                    textos.put(partes[0], partes[1]);
                }
            }
        } catch (IOException e) {
            System.out.println("Erro: não foi possível carregar o arquivo: "+ e.getMessage());
        }
    }

    public String get(String chave) {
        return textos.getOrDefault(chave, "Texto não encontrado");
    }
}