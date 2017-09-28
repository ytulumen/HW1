/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ytulumen.hw1_yasin_tulumen_121044020;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author yasin
 */
public class TutorTest {
    
    public TutorTest() {
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
     * Test of viewDocPer method, of class Tutor.
     */
    @Test
    public void testViewDocPer() {
        System.out.println("viewDocPer");
        Tutor instance = null;
        boolean expResult = false;
        boolean result = instance.viewDocPer();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of viewAssPer method, of class Tutor.
     */
    @Test
    public void testViewAssPer() {
        System.out.println("viewAssPer");
        Tutor instance = null;
        boolean expResult = false;
        boolean result = instance.viewAssPer();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
