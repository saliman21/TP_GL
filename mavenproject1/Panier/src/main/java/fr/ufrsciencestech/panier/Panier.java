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
    
    public ArrayList<Orange> lePanier ;
    private int max;
    
    
    public Panier(int taille)
    {
        max=taille;
        lePanier=new  ArrayList<Orange>();
        
    }
 public void ajoute(Orange uneOrange)
 {
     if(this.estPlein())
     {
         System.out.println("le panier est plein"); 
     }else{
           this.lePanier.add(uneOrange);
             }    
 }
 public void retire()
 {
     if(this.estVide())
     {
         System.out.println("le panier est vide");
     }else{
            this.lePanier.remove(this.lePanier.size());
             }    
 }
 public double getPrix()
{
    double prix=0;
       
     for(int i=0;i<this.lePanier.size();i++)
     {
         prix+=this.lePanier.get(i).getPrix();
     }
 
     return prix;
 }
 
    @Override
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
     
     s+=" le panier contient "+this.lePanier.size()+" oranges :\n";
     
     for(int i=0;i<this.lePanier.size();i++)
     {
         s+=""+"Orange N°"+i+" origine "+this.lePanier.get(i).getOrigine()+" à "+this.lePanier.get(i).getPrix()+"€\n";
     }
     
     s+="le prix total du panier est "+this.getPrix()+"€\n";
     return s;
           
 }
 
 public void boycotteOrigine(String origine)
 {
      for(int i=0;i<this.lePanier.size();i++)
     {
         if(this.lePanier.get(i).getOrigine()==origine)
         {
                 this.lePanier.remove(i);
         }
     }
      
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
        return lePanier;
    }
    
    public boolean estPlein()
    {
        int taille= this.lePanier.size();
        
        if(taille==this.max)
        {
            return true;
        }else
            {
               return false;
            }
    }
    
    public boolean estVide()
    {
         if(this.lePanier.isEmpty())
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
    public void setPanier(ArrayList<Orange> Ppanier) {
        this.lePanier = Ppanier;
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
