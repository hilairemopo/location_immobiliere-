public class Variable implements  Terme{
    public Variable(String nom, Integer valeur) {
        this.nom = nom;
        Valeur = valeur;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Integer getValeur() {
        return Valeur;
    }

    public void setValeur(Integer valeur) {
        Valeur = valeur;
    }

    String nom;
    Integer Valeur;
    @Override
    public void Calculervaleur() {

    }
}
