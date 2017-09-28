/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.panier;

import java.util.ArrayList;

/**
 *
 * @author so270744
 */
public class Panier 
{
    
    private ArrayList<Orange> panier ;
    private int max;
    
    
    public Panier(int taille)
    {
        this.max=taille;
        
    }
 public void ajoute(Orange uneOrange)
 {
     if(!this.estPlein())
     {
         this.panier.add(uneOrange);
     }else{
           System.out.println("le panier est plein"); 
             }    
 }
 public void ajoute()
 {
     if(!this.estVide())
     {
         this.panier.remove(this.panier.size()-1);
     }else{
           System.out.println("le panier est plein"); 
             }    
 }
 
 
 public String toString()
 { String s ="";
     if(this.estPlein())
     {
         s+="le panier est plein \n";
     }else if(this.estVide())
            {
                s+="le panier est vide \n";
                return s;
            }
     
     s+=" le panier contient "+this.panier.size()+" oranges :\n";
     
     for(int i=0;i<this.panier.size();i++)
     {
         s+=""+"Orange N°"+i+" origine "+this.panier.get(i).getOrigine()+" à "+this.panier.get(i).getPrix()+"€\n";
     }
     return s;
           
 }
 
 
 @Override
 public boolean equals(Object obj)
 {
     if(this==obj) return true;
     if(this==null) return false;
     if(!(obj instanceof Panier)) return false;
     Panier p1=(Panier) obj;
     Panier p2=(Panier) obj;
     return p1.equals(obj) && p2.equals(0);
     
 }

    /**
     * @return the panier
     */
    public ArrayList<Orange> getPanier() {
        return panier;
    }
    
    public boolean estPlein()
    {
        if(this.panier.size()==this.max)
        {
            return true;
        }else
            {
               return false;
            }
    }
    
    public boolean estVide()
    {
         if(this.panier.size()==0)
        {
            return true;
        }else
            {
               return false;
            }
    }

    /**
     * @param panier the panier to set
     */
    public void setPanier(ArrayList<Orange> panier) {
        this.panier = panier;
    }

    /**
     * @return the max
     */
    public int getMax() {
        return max;
    }

    /**
     * @param max the max to set
     */
    public void setMax(int max) {
        this.max = max;
    }
    
    
}
