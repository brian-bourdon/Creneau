import java.time.LocalTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;

public class Entretien {
    private Creneau creneau;
    private String statut;
    private String recruteur;
    private String candidat;
    private UUID entretienID = UUID.randomUUID();

    public Entretien(Creneau creneau, String statut, String recruteur, String candidat) {
        this.creneau = creneau;
        this.statut = statut;
        this.recruteur = recruteur;
        this.candidat = candidat;
        this.entretienID = entretienID;
    }

    public Creneau getCreneau() {
        return creneau;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Entretien entretien = (Entretien) o;
        return entretienID.equals(entretien.entretienID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(entretienID);
    }

    public boolean confirmer() {
        if(this.statut !=  "annuler" && this.statut.equals("planifier") && this.creneau.getDate().compareTo(new Date()) >=0) {
            this.statut = "confirmer";
            return true;
        }
        else
        {
            return false;
        }
    }

    public boolean annuler(String raison) {
        if (!raison.isEmpty()) {
            if (this.statut == "confirmer" && this.creneau.getDate().compareTo(new Date()) <= 0) {
                this.statut = "annuler";
                return true;
            }
            return false;
        }else {
            return false;
        }
    }
}
