import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

public class Entretien {
    private Creneau creneau;

    public Entretien(Creneau creneau) {
        this.creneau = creneau;
    }

    public Creneau getCreneau() {
        return creneau;
    }
}
