package fr.ufrsciencestech.panier;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       Panier monPanier = new Panier(5);
       Orange o1 = new Orange(1.5,"Maroc");
       Orange o2 = new Orange(5.0,"guinée");
       Orange o4 = new Orange(4.0,"guinée");
       Orange o5 = new Orange(3.50,"guinée");
       Orange o3 = new Orange(2.0,"France");
       
       monPanier.ajoute(o1);
       monPanier.ajoute(o2);
       monPanier.ajoute(o3);
       monPanier.ajoute(o4);
       monPanier.ajoute(o5);
      
  
       String s=monPanier.toString();
       System.out.println(s);
        monPanier.boycotteOrigine("guinée");
     //  monPanier.retire();
       String s2=monPanier.toString();
       System.out.println(s2);
        
    }
}
