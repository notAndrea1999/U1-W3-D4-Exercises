package andreademasi.entities;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Application {

    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("gestioneventi");

    public static void main(String[] args) {

        EntityManager em = emf.createEntityManager();
        PersonDAO pd = new PersonDAO(em);
        LocationDAO ld = new LocationDAO(em);
        EventoDAO ed = new EventoDAO(em);
        PartecipationDAO partd = new PartecipationDAO(em);


        em.close();
        emf.close();
    }
}
