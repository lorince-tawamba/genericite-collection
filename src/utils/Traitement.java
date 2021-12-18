package utils;

import beans.Enseignant;
import beans.Etudiant;

public class Traitement {

    public Traitement() {
        super();
    }

    public boolean compareEtudiant(Etudiant etud1, Traitement etud2) {
        return etud1.equals(etud2);
    }

    public boolean compareEnseignant(Enseignant ens1, Enseignant ens2) {
        return ens1.equals(ens2);
    }
}
