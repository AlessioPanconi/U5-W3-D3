package alessiopanconi.u5w3d3.Es2;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Runner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        Pagina newPage1 = new Pagina(1);
        Pagina newPage2 = new Pagina(2);
        Pagina newPage3 = new Pagina(3);
        Pagina newPage4 = new Pagina(4);
        Pagina newPage5 = new Pagina(5);
        Pagina newPage6 = new Pagina(6);
        Pagina newPage7 = new Pagina(7);

        Sezione sezione1 = new Sezione("L'alba");
        Sezione sezione2 = new Sezione("Il tramonto");

        sezione1.aggiungiFiglioSezione(newPage1);
        sezione1.aggiungiFiglioSezione(newPage2);
        sezione1.aggiungiFiglioSezione(newPage3);
        sezione1.aggiungiFiglioSezione(newPage4);
        sezione1.aggiungiFiglioSezione(newPage5);

        sezione2.aggiungiFiglioSezione(newPage6);
        sezione2.aggiungiFiglioSezione(newPage7);

        List<String> listaAutori1 = new ArrayList<>();
        String autore1 = "MC-Roland";
        String autore2= "CR7";
        listaAutori1.add(autore1);
        listaAutori1.add(autore2)
        Libro superLibro = new Libro("Super Book", 99.99,listaAutori1);

        superLibro.aggiungiFiglioLibro(sezione1);
        superLibro.aggiungiFiglioLibro(sezione2);

        System.out.println(superLibro.getNumPagine());
        superLibro.stampa();
    }
}