import java.util.Date;
import java.time.LocalTime;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

class CreneauTest {
    LocalTime localTime = LocalTime.now();
    Creneau creneau1 = new Creneau(new Date(), localTime, localTime.plusHours(2));
    Creneau creneau2 = new Creneau(new Date(), localTime, localTime.plusHours(2));
    String raison = "trop compétent";

    Creneau creneau3 = new Creneau(new Date(), localTime, localTime.plusHours(2));
    Entretien entretien = new Entretien( creneau3, "confirmer", "Brian", "Kyriel");

    @org.junit.jupiter.api.Test
    void getDate() {
    }

    @org.junit.jupiter.api.Test
    void verifHeureDebut() {
        assertTrue(creneau1.verifHeureDebut());
    }

    @org.junit.jupiter.api.Test
    void verifHeureFin() {

    }

    @org.junit.jupiter.api.Test
    void equals() {
        assertTrue(creneau1.equals(creneau2));
    }

    @org.junit.jupiter.api.Test
    void confirmer() {
          assertTrue(entretien.confirmer());
    }

    @org.junit.jupiter.api.Test
    void annuler() {
        assertTrue(entretien.annuler(raison));
    }

}