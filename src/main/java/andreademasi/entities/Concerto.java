package andreademasi.entities;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.time.LocalDate;

@Entity
public class Concerto extends Evento {
    @Enumerated(EnumType.STRING)
    private Genere genere;

    @Enumerated(EnumType.STRING)
    private Streaming streaming;

    public Concerto() {
    }

    public Concerto(String titolo, LocalDate data_evento, String descrizione, andreademasi.entities.tipoEvento tipoEvento, int numero_massimo_partecipanti, Location location, Genere genere, Streaming streaming) {
        super(titolo, data_evento, descrizione, tipoEvento, numero_massimo_partecipanti, location);
        this.genere = genere;
        this.streaming = streaming;
    }

    public Genere getGenere() {
        return genere;
    }

    public void setGenere(Genere genere) {
        this.genere = genere;
    }

    public Streaming getStreaming() {
        return streaming;
    }

    public void setStreaming(Streaming streaming) {
        this.streaming = streaming;
    }

    @Override
    public String toString() {
        return "Concerto{" +
                "genere=" + genere +
                ", streaming=" + streaming +
                '}';
    }
}
