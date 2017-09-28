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
public class AdministratorTest {
    
    public AdministratorTest() {
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
     * Test of addCourse method, of class Administrator.
     */
    @Test
    public void testAddCourse() {
        System.out.println("addCourse");
        String cName = "";
        String cCode = "";
        Administrator instance = null;
        Course expResult = null;
        Course result = instance.addCourse(cName, cCode);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeCourse method, of class Administrator.
     */
    @Test
    public void testRemoveCourse() {
        System.out.println("removeCourse");
        String cName = "";
        String cCode = "";
        Administrator instance = null;
        boolean expResult = false;
        boolean result = instance.removeCourse(cName, cCode);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addUser method, of class Administrator.
     */
    @Test
    public void testAddUser() {
        System.out.println("addUser");
        String uName = "";
        String password = "";
        Administrator instance = null;
        Teacher expResult = null;
        Teacher result = instance.addUser(uName, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeUser method, of class Administrator.
     */
    @Test
    public void testRemoveUser() {
        System.out.println("removeUser");
        String uName = "";
        Administrator instance = null;
        boolean expResult = false;
        boolean result = instance.removeUser(uName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of viewDocPer method, of class Administrator.
     */
    @Test
    public void testViewDocPer() {
        System.out.println("viewDocPer");
        Administrator instance = null;
        boolean expResult = false;
        boolean result = instance.viewDocPer();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of viewAssPer method, of class Administrator.
     */
    @Test
    public void testViewAssPer() {
        System.out.println("viewAssPer");
        Administrator instance = null;
        boolean expResult = false;
        boolean result = instance.viewAssPer();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
