/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lisa.designpatterns.behavioral;


import com.lisa.designpatterns.behavioral.observer.WeatherCustomer1;
import com.lisa.designpatterns.behavioral.observer.WeatherCustomer2;
import com.lisa.designpatterns.behavioral.observer.WeatherStation;
import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author 210211911
 */
public class ObserverTest {
    
    public ObserverTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public void ObserverMethod()
    {
        WeatherStation weatherStation = new WeatherStation(33);
		
		WeatherCustomer1 wc1 = new WeatherCustomer1();
		WeatherCustomer2 wc2 = new WeatherCustomer2();
		weatherStation.addObserver(wc1);
		weatherStation.addObserver(wc2);
		
		weatherStation.setTemperature(34);
		
		weatherStation.removeObserver(wc1);
		
		weatherStation.setTemperature(35);
                
                Assert.assertNotEquals(wc1, wc2);
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