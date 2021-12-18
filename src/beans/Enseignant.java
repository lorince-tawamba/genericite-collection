package beans;

import java.util.Objects;

public class Enseignant {

    private String matricule;
    private String nom;
    private String tel;

    public Enseignant() {
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
        Enseignant that = (Enseignant) o;
        return Objects.equals(matricule, that.matricule) && Objects.equals(nom, that.nom) && Objects.equals(tel, that.tel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(matricule, nom, tel);
    }
}
