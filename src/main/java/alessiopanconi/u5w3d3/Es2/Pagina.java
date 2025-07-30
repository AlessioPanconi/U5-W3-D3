package alessiopanconi.u5w3d3.Es2;

public class Pagina implements CompositeInterface{

    private int numPagina;

    public Pagina(int numPagina) {
        this.numPagina = numPagina;
    }

    @Override
    public void stampa() {
        System.out.println("Pagina: " + numPagina + " stampata");
    }

    @Override
    public int getNumPagine() {
        return 1;
    }
}
