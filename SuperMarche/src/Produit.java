public class Produit
{
    protected String id;
    protected String nom;
    protected double prixAchat;
    protected double prixVente;

    public Produit(String id, String nom, double prixAchat, double prixVente)
    {
        this.id = id;
        this.nom = nom;
        this.prixAchat = prixAchat;
        this.prixVente = prixVente;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getPrixAchat() {
        return prixAchat;
    }

    public void setPrixAchat(double prixAchat) {
        this.prixAchat = prixAchat;
    }

    public double getPrixVente() {
        return prixVente;
    }

    public void setPrixVente(double prixVente) {
        this.prixVente = prixVente;
    }

    public double solde(double s)
    {
        prixVente=prixVente*(1-s/100);
        return prixVente;
    }

    public double augmenterPrix(double aug)
    {
        prixVente=prixVente*(1+aug/100);
        return prixVente;
    }

    public String toString() {
        return " id=" + id + ", nom=" + nom + ", prixAchat=" + prixAchat + ", prixVente=" + prixVente;
    }
}
