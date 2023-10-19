package andreademasi.entities;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.time.LocalDate;
import java.util.List;

public class Application {

    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("gestioneventi");

    public static void main(String[] args) {

        EntityManager em = emf.createEntityManager();
        PersonDAO pd = new PersonDAO(em);
        LocationDAO ld = new LocationDAO(em);
        EventoDAO ed = new EventoDAO(em);
        PartecipationDAO partd = new PartecipationDAO(em);
        LocalDate d1 = LocalDate.of(2021, 01, 01);

        try {

            List<Concerto> concertoList = ed.getConcertiPerGenere(Genere.ROCK);
            concertoList.forEach(concerto -> System.out.println(concerto));


            List<Concerto> concertoListPerStreaming = ed.getConcertiPerStraming(Streaming.TRUE);
            concertoListPerStreaming.forEach(concerto -> System.out.println(concerto));


        } catch (Exception ex) {
            System.out.println(ex);
        }


        em.close();
        emf.close();
    }
}
