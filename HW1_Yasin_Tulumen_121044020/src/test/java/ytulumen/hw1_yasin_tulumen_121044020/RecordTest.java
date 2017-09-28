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
public class RecordTest {
    
    public RecordTest() {
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
     * Test of setType method, of class Record.
     */
    @Test
    public void testSetType() {
        System.out.println("setType");
        String recordType = "";
        Record instance = new RecordImpl();
        instance.setType(recordType);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class Record.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String recordName = "";
        Record instance = new RecordImpl();
        instance.setName(recordName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getType method, of class Record.
     */
    @Test
    public void testGetType() {
        System.out.println("getType");
        Record instance = new RecordImpl();
        String expResult = "";
        String result = instance.getType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class Record.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Record instance = new RecordImpl();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class RecordImpl implements Record {

        public void setType(String recordType) {
        }

        public void setName(String recordName) {
        }

        public String getType() {
            return "";
        }

        public String getName() {
            return "";
        }
    }
    
}
