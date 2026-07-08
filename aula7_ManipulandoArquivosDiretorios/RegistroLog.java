import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class RegistroLog {
    private BufferedWriter bw;
    private Localizacao loc;

    public RegistroLog(Localizacao loc) throws IOException {
        this.loc = loc;
        FileWriter fw = new FileWriter("registro-log.txt", true);
        bw = new BufferedWriter(fw);
    }

    public void novoRegistro(String msg) throws IOException {
        Calendar cal = Calendar.getInstance();
        String dataHora = new SimpleDateFormat(loc.get("registro.formatoDataHora")).format(cal.getTime());

        bw.write("[" + dataHora + loc.get("registro.operacao") + " " + msg + ".");
        bw.newLine();
        bw.flush();
    }

    public void fechaArq() throws IOException {
        bw.close();
        System.out.println(loc.get("registro.fechado"));
    }
}