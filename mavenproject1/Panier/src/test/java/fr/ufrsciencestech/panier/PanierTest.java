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
    AminePanier = new Panier(5);
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
        System.out.println("getPrix");
        Panier instance = null;
        double expResult = 0.0;
        double result = instance.getPrix();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
    
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
     * Test of getPanier method, of class Panier.
     */
    public void testGetPanier() {
        System.out.println("getPanier");
        Panier instance = null;
        ArrayList<Orange> expResult = null;
        ArrayList<Orange> result = instance.getPanier();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of estPlein method, of class Panier.
     */
    public void testEstPlein() {
        System.out.println("estPlein");
        Panier instance = null;
        boolean expResult = false;
        boolean result = instance.estPlein();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of estVide method, of class Panier.
     */
    public void testEstVide() {
        System.out.println("estVide");
        Panier instance = null;
        boolean expResult = false;
        boolean result = instance.estVide();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPanier method, of class Panier.
     */
    public void testSetPanier() {
        System.out.println("setPanier");
        ArrayList<Orange> Ppanier = null;
        Panier instance = null;
        instance.setPanier(Ppanier);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMax method, of class Panier.
     */
    public void testGetMax() {
        System.out.println("getMax");
        Panier instance = null;
        int expResult = 0;
        int result = instance.getMax();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMax method, of class Panier.
     */
    public void testSetMax() {
        System.out.println("setMax");
        int max = 0;
        Panier instance = null;
        instance.setMax(max);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
