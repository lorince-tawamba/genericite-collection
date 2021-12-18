package beans;

import java.util.Objects;

public class Etudiant {

    private String matricule;
    private String nom;
    private String tel;

    public Etudiant() {
        super();
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Etudiant etudiant = (Etudiant) o;
        return Objects.equals(matricule, etudiant.matricule) && Objects.equals(nom, etudiant.nom) && Objects.equals(tel, etudiant.tel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(matricule, nom, tel);
    }
}
