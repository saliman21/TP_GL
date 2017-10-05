/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.panier;

/**
 *
 * @author so270744
 */
public class PrixNegatifException extends Exception
{
    public PrixNegatifException()
    {
        
      super("Vous essayez d'instancier la classe orange avec un prix négatif");
    }
    


    
}
