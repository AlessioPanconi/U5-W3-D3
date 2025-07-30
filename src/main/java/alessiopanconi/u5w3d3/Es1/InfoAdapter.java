package alessiopanconi.u5w3d3.Es1;

import java.util.Calendar;
import java.util.Date;

public class InfoAdapter implements DataSource {
    private Info info;

    public InfoAdapter(Info info) {
        this.info = info;
    }
    @Override
    public String getNomeCompleto() {
        return info.getName() + " " + info.getCognome();
    }

    @Override
    public int getEta() {
        Date dataNascita = info.getDataDiNascita();
        Calendar dataNascitaCalendar = Calendar.getInstance();
        dataNascitaCalendar.setTime(dataNascita);
        Calendar oggi = Calendar.getInstance();

        int eta = oggi.get(Calendar.YEAR) - dataNascitaCalendar.get(Calendar.YEAR);

        if (oggi.get(Calendar.DAY_OF_YEAR) < dataNascitaCalendar.get(Calendar.DAY_OF_YEAR)) {
            eta--;
        }
        return eta;
    }
}
