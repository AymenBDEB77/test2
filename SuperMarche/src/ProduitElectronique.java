public class ProduitElectronique extends Produit
{
    private int stockElectro;
    private int dureeGarantie;

    public ProduitElectronique(String id, String nom, double prixAchat, double prixVente, int stockElectro,int dureeGarantie)
    {
        super(id, nom, prixAchat, prixVente);
        this.stockElectro = stockElectro;
        this.dureeGarantie = dureeGarantie;
    }


    public int getStockElectro() {
        return stockElectro;
    }


    public void setStockElectro(int stockElectro) {
        this.stockElectro = stockElectro;
    }


    public int getDureeGarantie() {
        return dureeGarantie;
    }


    public void setDureeGarantie(int dureeGarantie) {
        this.dureeGarantie = dureeGarantie;
    }

    public String toString()
    {
        return "ProduitElectronique : "+super.toString()+" ,stockElectro=" + stockElectro + ", dureeGarantie=" + dureeGarantie+"\n";
    }


    public double remplirStockPe(int qte)
    {
        stockElectro+=qte;
        return prixAchat*qte;
    }

    public double vendrePe(int qtev)
    {

        if(qtev<=stockElectro)
        {
            stockElectro-=qtev;
            return prixVente*qtev;
        }
        else
        {
            System.out.println("Stockk insuffisant!!!");
            return 0;
        }
    }

}