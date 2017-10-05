/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.panier;

import java.util.ArrayList;
import junit.framework.TestCase;

/**
 *
 * @author so270744
 */
public class PanierTest extends TestCase {
    
       Panier monPanier;
       Panier AminePanier ;
       Orange o1;
       Orange o2;
       Orange o3;
       Orange o4;
       Orange o5;
    
    public PanierTest(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception
    {
    monPanier = new Panier(5);
    AminePanier = new Panier(2);
     o1 = new Orange(1.5,"France");
     o2 = new Orange(5.0,"guinée");
     o4 = new Orange(4.0,"Maroc");
     o5 = new Orange(3.50,"guinée");
     o3 = new Orange(2.0,"France");
    }
    
    public void testAjoutPanierVide() throws Exception
    {
        monPanier.ajoute(o1);
        //L'oracle
        assertFalse(monPanier.estVide());
        assertTrue(monPanier.getSize()==1);
        
        assertEquals(monPanier.getOrange(0),01);
        
        
    }
    @Override
    protected void tearDown() throws Exception 
    {
        super.tearDown();
    }

    /**
     * Test of ajoute method, of class Panier.
     */
    public void testAjoute()
    {
       monPanier.ajoute(o1);
        //L'oracle
        assertFalse(monPanier.estVide());
        assertEquals(monPanier.getOrange(0),01);
        
    }

    
    /**
     * Test of retire method, of class Panier.
     */
    public void testRetire() {
          monPanier.ajoute(o1);
          int taille= monPanier.getSize();
          
              int  tailleN=taille-1;
           //L'oracle
    
        assertEquals(tailleN,monPanier.getSize());
    }

    /**
     * Test of getPrix method, of class Panier.
     */
    public void testGetPrix()
    {
        double prix=o3.getPrix()+o4.getPrix();
       AminePanier.ajoute(o3);
       AminePanier.ajoute(o4);
       assertEquals(prix,AminePanier.getPrix());
    
    }

    /**
     * Test of toString method, of class Panier.
     */
    public void testToString() {
        System.out.println("toString");
        Panier instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      
    }

    
    /**
     * Test of boycotteOrigine method, of class Panier.
     */
    public void testBoycotteOrigine() {
       
        monPanier.boycotteOrigine("France");
        assertTrue(monPanier.estVide());
    }
    
    

    /**
     * Test of equals method, of class Panier.
     */
    public void testEquals() 
    {
        System.out.println("equals");
        Object obj = null;
        Panier instance = null;
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    

    /**
     * Test of estPlein method, of class Panier.
     */
    public void testEstPlein() {
       
        assertEquals(1, 1);
    
    }

    /**
     * Test of estVide method, of class Panier.
     */
    public void testEstVide() {
         monPanier.ajoute(o1);
         int taille= monPanier.getSize();
          
         int  tailleN=taille-1;
           //L'oracle
        assertEquals(tailleN,monPanier.getSize());
    }

    /**
     * Test of setPanier method, of class Panier.
     */
    public void testSetPanier()
    {
        assertEquals(1, 1);
        
    }

    /**
     * Test of getMax method, of class Panier.
     */
    public void testGetMax() {
       
        assertEquals(1, 1);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setMax method, of class Panier.
     */
    public void testSetMax() {
      assertEquals(1, 1);
    }
    
}
