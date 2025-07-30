package alessiopanconi.u5w3d3.Es2;

import java.util.ArrayList;
import java.util.List;

public class Libro implements CompositeInterface{

    private String titolo;
    private double prezzo;
    private List<String> autori = new ArrayList<>();
    private List<CompositeInterface> children = new ArrayList<>();

    public Libro(String titolo, double prezzo, List<String> autori) {
        this.titolo = titolo;
        this.prezzo = prezzo;
        this.autori = autori;
    }

    public void aggiungiFiglioLibro(CompositeInterface child) {
        children.add(child);
    }

    @Override
    public int getNumPagine() {
        int totale = 0;
        for (CompositeInterface c : children) {
            totale += c.getNumPagine();
        }
        return totale;
    }

    public void stampa() {
        System.out.println("Il libro si intitola :" + titolo + " e costa :" + prezzo +"$");
        for (CompositeInterface c : children) {
            c.stampa();
        }
    }
}
