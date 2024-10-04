import java.util.ArrayList;

public class Magasin
{
    private String adresse;
    private ArrayList<Produit> ProduitMagasin=new ArrayList<Produit>();

    //Constructeur de la classe magasin
    public ArrayList<Produit> getProduitMagasin() {
        return ProduitMagasin;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setProduitMagasin(ArrayList<Produit> produitMagasin) {
        ProduitMagasin = produitMagasin;
    }

    public String getAdresse() {
        return adresse;
    }

    public Magasin(String adresse, ArrayList<Produit> produitMagasin)
    {
        this.adresse = adresse;
        ProduitMagasin = produitMagasin;
    }

    public void ajouterProduit(Produit p)
    {
        ProduitMagasin.add(p);
        System.out.println("["+p.toString()+"] a été ajouter avec succes");
    }

    public void supprimerProduit(Produit p)
    {
        ProduitMagasin.remove(p);
        System.out.println("["+p.toString()+"] a été supprimer avec succes");
    }

    @Override
    public String toString() {
        return "Magasin\n [adresse=" + adresse+"]\n" + ", ProduitMagasin=" + ProduitMagasin + "]";
    }
}