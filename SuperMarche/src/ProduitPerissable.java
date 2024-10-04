public class ProduitPerissable extends Produit
{
    private double stockPeris;
    private String dateLimite;

    public ProduitPerissable(String id, String nom, double prixAchat, double prixVente, double stockPeris,String dateLimite)
    {
        super(id, nom, prixAchat, prixVente);
        this.stockPeris = stockPeris;
        this.dateLimite = dateLimite;
    }

    public double getStockPeris() {
        return stockPeris;
    }

    public void setStockPeris(double stockPeris) {
        this.stockPeris = stockPeris;
    }

    public String getDateLimite() {
        return dateLimite;
    }

    public void setDateLimite(String dateLimite) {
        this.dateLimite = dateLimite;
    }


    public String toString() {
        return "ProduitPerissable : "+super.toString() +" ,stock périssable : "+ stockPeris + ", dateLimite: " + dateLimite+"\n";
    }

    public double remplirStockPp(double qte)
    {
        stockPeris+=qte;
        return prixAchat*qte;
    }

    public double vendrePp(int qtev)
    {

        if(qtev<=stockPeris)
        {
            stockPeris-=qtev;
            return prixVente*qtev;
        }
        else
        {
            System.out.println("Stockk insuffisant!!!");
            return 0;
        }
    }

}