package andreademasi.entities;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Table(name = "eventi")
public abstract class Evento {
    @Id
    @GeneratedValue
    private long id;

    private String titolo;
    private LocalDate data_evento;
    private String descrizione;
    @Enumerated(EnumType.STRING)
    private tipoEvento tipoEvento;
    private int numero_massimo_partecipanti;
    @OneToMany(mappedBy = "evento", cascade = CascadeType.REMOVE)
    private Set<Partecipation> partecipationSet;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "location_id")
    private Location location;

    public Evento() {
    }

    public Evento(String titolo, LocalDate data_evento, String descrizione, tipoEvento tipoEvento, int numero_massimo_partecipanti, Location location) {
        this.titolo = titolo;
        this.data_evento = data_evento;
        this.descrizione = descrizione;
        this.tipoEvento = tipoEvento;
        this.numero_massimo_partecipanti = numero_massimo_partecipanti;
        this.location = location;
    }

    public Set<Partecipation> getPartecipationSet() {
        return partecipationSet;
    }

    public long getId() {
        return id;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public LocalDate getData_evento() {
        return data_evento;
    }

    public void setData_evento(LocalDate data_evento) {
        this.data_evento = data_evento;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public andreademasi.entities.tipoEvento getTipoEvento() {
        return tipoEvento;
    }

    public void setTipoEvento(andreademasi.entities.tipoEvento tipoEvento) {
        this.tipoEvento = tipoEvento;
    }

    public int getNumero_massimo_partecipanti() {
        return numero_massimo_partecipanti;
    }

    public void setNumero_massimo_partecipanti(int numero_massimo_partecipanti) {
        this.numero_massimo_partecipanti = numero_massimo_partecipanti;
    }

    @Override
    public String toString() {
        return "Evento{" +
                "id=" + id +
                ", titolo='" + titolo + '\'' +
                ", data_evento=" + data_evento +
                ", descrizione='" + descrizione + '\'' +
                ", tipoEvento=" + tipoEvento +
                ", numero_massimo_partecipanti=" + numero_massimo_partecipanti +
                '}';
    }

    
}
