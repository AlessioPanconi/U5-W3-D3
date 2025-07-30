package alessiopanconi.u5w3d3.Es1;

public class UserData {

    private String nomeCompleto;
    private int eta;

    public void getData(DataSource ds)
    {
        nomeCompleto = ds.getNomeCompleto();
        eta = ds.getEta();
    }

    @Override
    public String toString() {
        return "UserData{" +
                "eta=" + eta +
                ", nomeCompleto='" + nomeCompleto + '\'' +
                '}';
    }
}
