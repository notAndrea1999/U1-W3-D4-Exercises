package andreademasi.entities;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import java.time.LocalDate;
import java.util.Set;

@Entity
public class GaraDiAtletica extends Evento {
    private Set<Person> atleti;

    @OneToOne
    @JoinColumn(name = "vincitore_id")
    private Person vincitore;

    public GaraDiAtletica() {
    }

    public GaraDiAtletica(String titolo, LocalDate data_evento, String descrizione, andreademasi.entities.tipoEvento tipoEvento, int numero_massimo_partecipanti, Set<Person> atleti, Person vincitore) {
        super(titolo, data_evento, descrizione, tipoEvento, numero_massimo_partecipanti);
        this.atleti = atleti;
        this.vincitore = vincitore;
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
