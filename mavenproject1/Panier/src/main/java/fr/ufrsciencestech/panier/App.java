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
       
       //monPanier.ajoute(o1);
       
       String s=monPanier.toString();
        System.out.println(s);
    }
}
