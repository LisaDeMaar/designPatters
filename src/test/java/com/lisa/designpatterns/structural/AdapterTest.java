/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lisa.designpatterns.structural;


import com.lisa.designpatterns.structural.adapter.TemperatureClassReporter;
import com.lisa.designpatterns.structural.adapter.TemperatureInfo;
import com.lisa.designpatterns.structural.adapter.TemperatureObjectReporter;
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
public class AdapterTest {
    
    public AdapterTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public void AdapterTest()
    {
        // class adapter
                
		System.out.println("class adapter test");
		TemperatureInfo tempInfo = new TemperatureClassReporter();
                tempInfo.setTemperatureInC(0);
                Assert.assertNotNull(tempInfo.getTemperatureInC());
                Assert.assertNotNull(tempInfo.getTemperatureInF());
		
		// object adapter
		System.out.println("\nobject adapter test");
		tempInfo = new TemperatureObjectReporter();
                Assert.assertNotNull(tempInfo.getTemperatureInC());
                Assert.assertNotNull(tempInfo.getTemperatureInF());
	
                
       

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
