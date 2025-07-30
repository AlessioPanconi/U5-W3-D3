package alessiopanconi.u5w3d3.Es2;

import java.util.ArrayList;
import java.util.List;

public class Sezione implements CompositeInterface{

    private String titolo;
    private List<CompositeInterface> children = new ArrayList<>();

    public Sezione(String titolo) {
        this.titolo = titolo;
    }

    public void aggiungiFiglioSezione(CompositeInterface child) {
        children.add(child);
    }

    public void stampa() {
        System.out.println("La sezione intitolata: " + titolo + "è composta da :");
        for (CompositeInterface c : children) {
            c.stampa();
        }
    }

    @Override
    public int getNumPagine() {
        int totale = 0;
        for (CompositeInterface c : children) {
            totale += c.getNumPagine();
        }
        return totale;
    }
}
