package alessiopanconi.u5w3d3.Es1;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
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
        LocalDate localDateNascita = dataNascita.toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDate();
        LocalDate oggi = LocalDate.now();

        return Period.between(localDateNascita, oggi).getYears();
    }
}
