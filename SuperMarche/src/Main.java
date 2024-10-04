import java.util.ArrayList;

public class Main {

    public static void main(String[] args)
    {
        ArrayList<Produit> ProduitMagasin=new ArrayList<Produit>();

        ProduitElectronique PE1=new ProduitElectronique("A23","PC",800,1000,10,24);
        ProduitElectronique PE2=new ProduitElectronique("A25","TV",900,1100,5,24);

        ProduitPerissable PP1=new ProduitPerissable("P45","Tomate",1,2,20,"04/08/2022");
        ProduitPerissable PP2=new ProduitPerissable("P46","Patate",1,2,20,"04/08/2022");

        Magasin m=new Magasin("12 henri bourassa",ProduitMagasin);

        m.ajouterProduit(PE1);
        m.ajouterProduit(PE2);
        m.ajouterProduit(PP1);
        m.ajouterProduit(PP2);

        System.out.println("-------------------------------------------------------");

        System.out.println(m);

        System.out.println("-------------------------------------------------------");

        m.supprimerProduit(PE2);
        m.supprimerProduit(PP2);

        System.out.println("-------------------------------------------------------");

        System.out.println(m);

    }

}