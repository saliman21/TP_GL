package fr.ufrsciencestech.panier;

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
    
    public Orange(double Pprix,String Porigine)
    {
        prix =Pprix;
        origine= Porigine;
    }

    public void setPrix(double prix) throws PrixNegatifException
    {
                    
               
            if(prix<0)
            {
                throw new PrixNegatifException();
            }else{
                    this.prix = prix;
                  }
    }
    }
  



