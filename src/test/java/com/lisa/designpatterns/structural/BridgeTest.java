/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lisa.designpatterns.structural;


import com.lisa.designpatterns.structural.bridge.BigBus;
import com.lisa.designpatterns.structural.bridge.BigEngine;
import com.lisa.designpatterns.structural.bridge.SmallCar;
import com.lisa.designpatterns.structural.bridge.SmallEngine;
import com.lisa.designpatterns.structural.bridge.Vehicle;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Lisa
 */
public class BridgeTest {
    
    public BridgeTest(){
        
    }
    
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    //@Test
    // public void hello() {}
    
    @Test
    public void BridgeMethod()
    {
          Vehicle vehicle = new BigBus(new SmallEngine());
		vehicle.drive();
                Assert.assertEquals(vehicle.drive(),"\nThe big bus is driving\nThe small engine is running");
                
		vehicle.setEngine(new BigEngine());
		vehicle.drive();
                Assert.assertEquals(vehicle.drive(), "\nThe big bus is driving\nThe big engine is running");
                

		vehicle = new SmallCar(new SmallEngine());
		vehicle.drive();
                Assert.assertEquals(vehicle.drive(),"\nThe small car is driving\nThe small engine is running");
                
		vehicle.setEngine(new BigEngine());
		vehicle.drive();
                 Assert.assertEquals(vehicle.drive(),"\nThe small car is driving\nThe big engine is running");


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
