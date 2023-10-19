package andreademasi.entities;

import javax.persistence.Entity;
import java.time.LocalDate;

@Entity
public class PartitaDiCalcio extends Evento {
    private String squadra_di_casa;
    private String squadra_ospite;
    private String squadra_vincente;
    private int gol_squadra_di_casa;
    private int gol_squadra_ospite;

    public PartitaDiCalcio() {
    }

    public PartitaDiCalcio(String titolo, LocalDate data_evento, String descrizione, andreademasi.entities.tipoEvento tipoEvento, int numero_massimo_partecipanti, String squadra_di_casa, String squadra_ospite, String squadra_vincente, int gol_squadra_di_casa, int gol_squadra_ospite) {
        super(titolo, data_evento, descrizione, tipoEvento, numero_massimo_partecipanti);
        this.squadra_di_casa = squadra_di_casa;
        this.squadra_ospite = squadra_ospite;
        this.squadra_vincente = squadra_vincente;
        this.gol_squadra_di_casa = gol_squadra_di_casa;
        this.gol_squadra_ospite = gol_squadra_ospite;
    }

    public String getSquadra_di_casa() {
        return squadra_di_casa;
    }

    public void setSquadra_di_casa(String squadra_di_casa) {
        this.squadra_di_casa = squadra_di_casa;
    }

    public String getSquadra_ospite() {
        return squadra_ospite;
    }

    public void setSquadra_ospite(String squadra_ospite) {
        this.squadra_ospite = squadra_ospite;
    }

    public String getSquadra_vincente() {
        return squadra_vincente;
    }

    public void setSquadra_vincente(String squadra_vincente) {
        this.squadra_vincente = squadra_vincente;
    }

    public int getGol_squadra_di_casa() {
        return gol_squadra_di_casa;
    }

    public void setGol_squadra_di_casa(int gol_squadra_di_casa) {
        this.gol_squadra_di_casa = gol_squadra_di_casa;
    }

    public int getGol_squadra_ospite() {
        return gol_squadra_ospite;
    }

    public void setGol_squadra_ospite(int gol_squadra_ospite) {
        this.gol_squadra_ospite = gol_squadra_ospite;
    }

    @Override
    public String toString() {
        return "PartitaDiCalcio{" +
                "squadra_di_casa='" + squadra_di_casa + '\'' +
                ", squadra_ospite='" + squadra_ospite + '\'' +
                ", squadra_vincente='" + squadra_vincente + '\'' +
                ", gol_squadra_di_casa=" + gol_squadra_di_casa +
                ", gol_squadra_ospite=" + gol_squadra_ospite +
                '}';
    }
}
