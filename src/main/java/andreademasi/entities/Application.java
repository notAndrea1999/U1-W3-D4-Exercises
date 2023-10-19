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

            //List<Concerto> concertoList = ed.getConcertiPerGenere(Genere.ROCK);
            //concertoList.forEach(concerto -> System.out.println(concerto));


            //List<Concerto> concertoListPerStreaming = ed.getConcertiPerStraming(Streaming.TRUE);
            //concertoListPerStreaming.forEach(concerto -> System.out.println(concerto));

//            Location foundL1 = ld.findById(3);
//            Location foundL2 = ld.findById(4);
//            Location foundL3 = ld.findById(5);

            // PartitaDiCalcio p1 = new PartitaDiCalcio("partita1", d1, "desc1", tipoEvento.randomTipoEvento(), 22, foundL1, "Roma", "Lazio", "Roma", 3, 2);
            // PartitaDiCalcio p2 = new PartitaDiCalcio("partita1", d1, "desc1", tipoEvento.randomTipoEvento(), 22, foundL2, "Milan", "Inter", "Milan", 4, 1);
            // PartitaDiCalcio p3 = new PartitaDiCalcio("partita1", d1, "desc1", tipoEvento.randomTipoEvento(), 22, foundL3, "Fiorentina", "Atlanta", "Fiorentina", 3, 0);
//            ed.save(p1);
//            ed.save(p2);
//            ed.save(p3);

//            List<PartitaDiCalcio> partitaDiCalcioList = ed.getPartiteVinteInCasa("Roma");
//            partitaDiCalcioList.forEach(partitaDiCalcio -> System.out.println(partitaDiCalcio));

            List<PartitaDiCalcio> partitaDiCalcioList = ed.getPartiteVinteInTrasferta("Lazio");
            partitaDiCalcioList.forEach(partitaDiCalcio -> System.out.println(partitaDiCalcio));

        } catch (Exception ex) {
            System.out.println(ex);
        }


        em.close();
        emf.close();
    }
}
