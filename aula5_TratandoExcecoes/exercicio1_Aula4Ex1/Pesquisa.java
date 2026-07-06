public class Pesquisa {
    protected String t = "";

    public void setTexto(String texto){
        this.t = texto;
    }

    public boolean buscarString(String cadeiaCaracteres) {
        return t.contains(cadeiaCaracteres);
    }
}