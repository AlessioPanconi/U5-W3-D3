package alessiopanconi.u5w3d3.Es1;

import java.util.Date;


public class Info {

    private String name;
    private String cognome;
    private Date dataDiNascita;

    public Info(String cognome, Date dataDiNascita, String name) {
        this.cognome = cognome;
        this.dataDiNascita = dataDiNascita;
        this.name = name;
    }

    //GETTER
    public String getCognome() {
        return cognome;
    }
    public Date getDataDiNascita() {
        return dataDiNascita;
    }
    public String getName() {
        return name;
    }
    //SETTER
    public void setCognome(String cognome) {
        this.cognome = cognome;
    }
    public void setDataDiNascita(Date dataDiNascita) {
        this.dataDiNascita = dataDiNascita;
    }
    public void setName(String name) {
        this.name = name;
    }
}
