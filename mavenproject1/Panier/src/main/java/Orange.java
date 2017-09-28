/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author so270744
 */
public class Orange 
{

   
  private double prix;
  private String origine;

    /**
     * @return the prix
     */
    public double getPrix() {
        return prix;
    }

    /**
     * @return the origine
     */
    public String getOrigine() {
        return origine;
    }
    
    private Orange(double Pprix,String Porigine)
    {
        this.prix =Pprix;
        this.origine= Porigine;
    }

    /**
     * @param prix the prix to set
     */
    public void setPrix(double prix)
    throws prixnegatifExeception
        {
                    
               
            if(prix<0)
            {
                throw new prixnegatifExeception();
            }else{
                    this.prix = prix;
                  }
        }
    }
  


class prixnegatifExeception extends Exception
{
    public prixnegatifExeception()
    {
      System.out.println("Vous essayez d'instancier la classe orange avec un prix est négatifs");
    }
    
}
