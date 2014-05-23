/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lisa.designpatterns.structural;


import com.lisa.designpatterns.structural.facade.Facade;
import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Lisa
 */
public class FacadeTest {
    
    public FacadeTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public void FacadeTest()
    {
             Facade facade = new Facade();
		int x = 3;
		System.out.println("Cube of " + x + ":" + facade.cubeX(x));
                Assert.assertEquals(facade.cubeX(x), 27);
		System.out.println("Cube of " + x + " times 2:" + facade.cubeXTimes2(x));
                Assert.assertEquals(facade.cubeXTimes2(x), 54);
		System.out.println(x + " to sixth power times 2:" + facade.xToSixthPowerTimes2(x));
                Assert.assertEquals(facade.xToSixthPowerTimes2(x), 1458);

    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
