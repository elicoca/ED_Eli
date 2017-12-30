/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Clase auxiliar para hacer pruebas unitarias
 * @author Eli Coca
 */
public class depositoTest {
    
    public depositoTest() {
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
     * Test of Deposito method, of class deposito. En este método no voy a hacer ninguna prueba unitaria al no tener
     * parámetros.
     */
    @Test
    public void testDeposito_0args() {
        System.out.println("Deposito");
        deposito instance = new deposito();
        instance.Deposito();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Deposito method con los parámetros necesarios, of class deposito. Aquí vamos a hacer pruebas unitarias.
     */
    @Test
    public void testDeposito_3args() {
        System.out.println("Deposito");
        float valor_diametro = 1.0F;
        float valor_altura = 1.0F;
        String valor_idDeposito = "001";
        deposito instance = new deposito();
        instance.Deposito(valor_diametro, valor_altura, valor_idDeposito);
        // TODO review the generated test code and remove the default call to fail.
        if ("000".equals(valor_idDeposito)){
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of setValoresDeposito method, of class deposito. Aquí también vamos a hacer pruebas unitarias.
     */
    @Test
    public void testSetValoresDeposito() {
        //System.out.println("setValoresDeposito");
        String valor_idDeposito = "001";
        float valor_diametro = 1.0F;
        float valor_altura = 1.0F;
        deposito instance = new deposito();
        instance.setValoresDeposito(valor_idDeposito, valor_diametro, valor_altura);
        // TODO review the generated test code and remove the default call to fail.
        if ("000".equals(valor_idDeposito)){
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of getDiametro method, of class deposito. Aquí también realizo un par de pruebas unitarias.
     */
    @Test
    public void testGetDiametro() {
        System.out.println("getDiametro");
        deposito instance = new deposito();
        float expResult = 0.0F;
        float result = instance.getDiametro();
        assertEquals(expResult, result, 0.0F);
        // TODO review the generated test code and remove the default call to fail.
        if (result!=expResult){
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of getAltura method, of class deposito.
     */
    @Test
    public void testGetAltura() {
        System.out.println("getAltura");
        deposito instance = new deposito();
        float expResult = 0.0F;
        float result = instance.getAltura();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIdDeposito method, of class deposito.
     */
    @Test
    public void testGetIdDeposito() {
        System.out.println("getIdDeposito");
        deposito instance = new deposito();
        String expResult = "";
        String result = instance.getIdDeposito();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of valorCapacidad method, of class deposito.
     */
    @Test
    public void testValorCapacidad() {
        System.out.println("valorCapacidad");
        deposito instance = new deposito();
        float expResult = 0.0F;
        float result = instance.valorCapacidad();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
