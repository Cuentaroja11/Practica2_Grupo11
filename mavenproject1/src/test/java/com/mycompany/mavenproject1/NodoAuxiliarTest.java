/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author tu3
 */
public class NodoAuxiliarTest {
    
    public NodoAuxiliarTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getValor method, of class NodoSalon.
     */
    @Test
    public void testGetValor() {
        System.out.println("getValor");
        NodoAuxiliar instance = new NodoAuxiliar();
        String[] expResult = null;
        String[] result = instance.getValor();
                   
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setValor method, of class NodoSalon.
     */
    @Test
    public void testSetValor() {
        System.out.println("setValor");
        NodoAuxiliar instance = new NodoAuxiliar();
        String expResult = "valor";
        String result = instance.setValor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getSiguiente method, of class NodoSalon.
     */
    @Test
    public void testGetSiguiente() {
        System.out.println("getSiguiente");
        NodoAuxiliar instance = new NodoAuxiliar();
        boolean expResult = false;
        boolean result = instance.getSiguiente();
        assertTrue(result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getAnterior method, of class NodoSalon.
     */
    @Test
    public void testGetAnterior() {
        System.out.println("getAnterior");
        NodoAuxiliar instance = new NodoAuxiliar();
        boolean expResult = false;
        boolean result = instance.getAnterior();
        assertFalse(result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getPrimero method, of class NodoSalon.
     */
    @Test
    public void testGetPrimero() {
        System.out.println("getPrimero");
        NodoAuxiliar instance = new NodoAuxiliar();
        int expResult = 0;
        int result = instance.getPrimero();
        assertNotNull(result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getUltimo method, of class NodoSalon.
     */
    @Test
    public void testGetUltimo() {
        System.out.println("getUltimo");
        NodoAuxiliar instance = new NodoAuxiliar();
        String expResult = "10";
        int result = instance.getUltimo();
        assertNotSame(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of Eliminar method, of class NodoSalon.
     */
    @Test
    public void testEliminar() {
        System.out.println("Eliminar");
        NodoAuxiliar instance = new NodoAuxiliar();
        int expResult = 10;
        int result = instance.Eliminar();
        assertNotEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
