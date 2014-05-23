/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.lisa.designpatterns.structural;


import com.lisa.designpatterns.structural.proxy.FastThing;
import com.lisa.designpatterns.structural.proxy.Proxy;
import java.util.Date;
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
public class ProxyTest {
    
    public ProxyTest() {
    }

    
    @Test
    public void ProxyTest() 
    {
        Proxy proxy = new Proxy();
        
        FastThing fastThing = new FastThing();
        fastThing.sayHello();
        
        Assert.assertNotEquals(proxy, fastThing);
        
        proxy.sayHello();
        
        
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
