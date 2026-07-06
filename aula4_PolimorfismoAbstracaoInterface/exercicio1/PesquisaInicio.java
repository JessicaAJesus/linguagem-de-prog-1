public class PesquisaInicio extends Pesquisa{
    @Override
    final public boolean buscarString(String cadeiaCaracteres) {
        return t.startsWith(cadeiaCaracteres);
    }
}