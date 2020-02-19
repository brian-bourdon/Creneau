import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;
import java.util.Objects;

public class Creneau {
    private Date date;
    private LocalTime heureDebut;
    private LocalTime heureFin;

    public Creneau(Date date, LocalTime heureDebut, LocalTime heureFin) {
        this.date = date;
        this.heureDebut = heureDebut;
        this.heureFin = heureFin;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Creneau creneau = (Creneau) o;
        return Objects.equals(date, creneau.date) &&
                Objects.equals(heureDebut, creneau.heureDebut) &&
                Objects.equals(heureFin, creneau.heureFin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, heureDebut, heureFin);
    }

    public Date getDate() {
        return date;
    }

    public LocalTime getHeureDebut() {
        return heureDebut;
    }

    public LocalTime getHeureFin() {
        return heureFin;
    }

    boolean verifHeureDebut() {
        if(this.heureDebut.compareTo(this.heureFin) < 0 ){
            return true;
        }else{
            return false;
        }
    }

}
