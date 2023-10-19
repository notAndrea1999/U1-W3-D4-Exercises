package andreademasi.entities;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;

@Entity
public class GaraDiAtletica extends Evento {
    @ManyToMany
    @JoinTable(name = "persone_gare",
            joinColumns = @JoinColumn(name = "gara_id"),
            inverseJoinColumns = @JoinColumn(name = "person_id"))
    private Set<Person> atleti;

    @ManyToOne
    @JoinColumn(name = "person_id")
    private Person vincitore;


    public GaraDiAtletica() {
    }

    public GaraDiAtletica(String titolo, LocalDate data_evento, String descrizione, andreademasi.entities.tipoEvento tipoEvento, int numero_massimo_partecipanti, Location location, Set<Person> atleti) {
        super(titolo, data_evento, descrizione, tipoEvento, numero_massimo_partecipanti, location);
        this.atleti = atleti;
    }


    public Set<Person> getAtleti() {
        return atleti;
    }

    public void setAtleti(Set<Person> atleti) {
        this.atleti = atleti;
    }

    public Person getVincitore() {
        return vincitore;
    }

    public void setVincitore(Person vincitore) {
        this.vincitore = vincitore;
    }

    @Override
    public String toString() {
        return "GaraDiAtletica{" +
                "atleti=" + atleti +
                ", vincitore=" + vincitore +
                '}';
    }
}
