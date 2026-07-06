public class PesquisaFim extends Pesquisa{
    @Override
    final public boolean buscarString(String cadeiaCaracteres) {
        return t.endsWith(cadeiaCaracteres);
    }
}