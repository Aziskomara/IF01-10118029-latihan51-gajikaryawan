/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if01.pkg10118029.latihan51.gajikaryawan;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author acer
 */
public class managerTest {
    
    public managerTest() {
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
     * Test of getKehadiran method, of class manager.
     */
    @Test
    public void testGetKehadiran() {
        System.out.println("getKehadiran");
        manager instance = new manager();
        int expResult = 0;
        int result = instance.getKehadiran();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setKehadiran method, of class manager.
     */
    @Test
    public void testSetKehadiran() {
        System.out.println("setKehadiran");
        int kehadiran = 0;
        manager instance = new manager();
        instance.setKehadiran(kehadiran);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of tunjanganKehadiran method, of class manager.
     */
    @Test
    public void testTunjanganKehadiran() {
        System.out.println("tunjanganKehadiran");
        int hadir = 0;
        manager instance = new manager();
        float expResult = 0.0F;
        float result = instance.tunjanganKehadiran(hadir);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of tunjanganJabatan method, of class manager.
     */
    @Test
    public void testTunjanganJabatan() {
        System.out.println("tunjanganJabatan");
        String jabatan = "";
        manager instance = new manager();
        float expResult = 0.0F;
        float result = instance.tunjanganJabatan(jabatan);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of tunjanganGolongan method, of class manager.
     */
    @Test
    public void testTunjanganGolongan() {
        System.out.println("tunjanganGolongan");
        int golongan = 0;
        manager instance = new manager();
        float expResult = 0.0F;
        float result = instance.tunjanganGolongan(golongan);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of gajiTotal method, of class manager.
     */
    @Test
    public void testGajiTotal() {
        System.out.println("gajiTotal");
        manager instance = new manager();
        float expResult = 0.0F;
        float result = instance.gajiTotal();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
