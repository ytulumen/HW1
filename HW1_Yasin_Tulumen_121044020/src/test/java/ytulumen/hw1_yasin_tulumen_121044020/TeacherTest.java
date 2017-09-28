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
public class TeacherTest {
    
    public TeacherTest() {
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
     * Test of addUser method, of class Teacher.
     */
    @Test
    public void testAddUser() {
        System.out.println("addUser");
        String uName = "";
        String password = "";
        Teacher instance = null;
        Tutor expResult = null;
        Tutor result = instance.addUser(uName, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeUser method, of class Teacher.
     */
    @Test
    public void testRemoveUser() {
        System.out.println("removeUser");
        String uName = "";
        Teacher instance = null;
        boolean expResult = false;
        boolean result = instance.removeUser(uName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addDoc method, of class Teacher.
     */
    @Test
    public void testAddDoc() {
        System.out.println("addDoc");
        String docType = "";
        String docName = "";
        Teacher instance = null;
        Document expResult = null;
        Document result = instance.addDoc(docType, docName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeDoc method, of class Teacher.
     */
    @Test
    public void testRemoveDoc() {
        System.out.println("removeDoc");
        String docName = "";
        Teacher instance = null;
        boolean expResult = false;
        boolean result = instance.removeDoc(docName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addAssi method, of class Teacher.
     */
    @Test
    public void testAddAssi() {
        System.out.println("addAssi");
        String assiType = "";
        String assiName = "";
        Teacher instance = null;
        Assignment expResult = null;
        Assignment result = instance.addAssi(assiType, assiName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeAssi method, of class Teacher.
     */
    @Test
    public void testRemoveAssi() {
        System.out.println("removeAssi");
        String assiName = "";
        Teacher instance = null;
        boolean expResult = false;
        boolean result = instance.removeAssi(assiName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of viewDocPer method, of class Teacher.
     */
    @Test
    public void testViewDocPer() {
        System.out.println("viewDocPer");
        Teacher instance = null;
        boolean expResult = false;
        boolean result = instance.viewDocPer();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of viewAssPer method, of class Teacher.
     */
    @Test
    public void testViewAssPer() {
        System.out.println("viewAssPer");
        Teacher instance = null;
        boolean expResult = false;
        boolean result = instance.viewAssPer();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
