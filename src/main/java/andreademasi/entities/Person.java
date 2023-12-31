package andreademasi.entities;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "people")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String first_name;
    private String last_name;
    private String email;
    private LocalDate birth_date;
    @Enumerated(EnumType.STRING)
    private Gender gender;
    @OneToMany(mappedBy = "person")
    private List<Partecipation> partecipationList;

    @ManyToMany
    @JoinTable(name = "persone_gare",
            joinColumns = @JoinColumn(name = "person_id"),
            inverseJoinColumns = @JoinColumn(name = "gara_id"))
    private Set<GaraDiAtletica> gareDiAtletica;
    @OneToMany(mappedBy = "vincitore")
    private List<GaraDiAtletica> gara_vinta;

    public Person(String first_name, String last_name, String email, LocalDate birth_date, Gender gender) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.birth_date = birth_date;
        this.gender = gender;
    }

    public Person() {
    }

    public Set<GaraDiAtletica> getGareDiAtletica() {
        return gareDiAtletica;
    }

    public void setGareDiAtletica(Set<GaraDiAtletica> gareDiAtletica) {
        this.gareDiAtletica = gareDiAtletica;
    }

    public List<GaraDiAtletica> getGara_vinta() {
        return gara_vinta;
    }

    public void setGara_vinta(List<GaraDiAtletica> gara_vinta) {
        this.gara_vinta = gara_vinta;
    }

    public long getId() {
        return id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getBirth_date() {
        return birth_date;
    }

    public void setBirth_date(LocalDate birth_date) {
        this.birth_date = birth_date;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public List<Partecipation> getPartecipationList() {
        return partecipationList;


    }

    public void setPartecipationList(List<Partecipation> partecipationList) {
        this.partecipationList = partecipationList;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", email='" + email + '\'' +
                ", birth_date=" + birth_date +
                ", gender=" + gender +
                ", partecipationList=" + partecipationList +
                '}';
    }
}
