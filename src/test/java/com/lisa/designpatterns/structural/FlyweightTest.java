/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lisa.designpatterns.structural;


import com.lisa.designpatterns.structural.flyweight.FlyweightFactory;
import com.lisa.designpatterns.structural.flyweight.FlyweightInterface;
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
public class FlyweightTest {
    
    public FlyweightTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public void FlyweightTest()
    {
        FlyweightFactory flyweightFactory = FlyweightFactory.getInstance();
        
        

		for (int i = 0; i < 5; i++) 
                {
			FlyweightInterface flyweightAdder = flyweightFactory.getFlyweight("add");
			flyweightAdder.doMath(i, i);
                        Assert.assertEquals(i, i);

			FlyweightInterface flyweightMultiplier = flyweightFactory.getFlyweight("multiply");
			flyweightMultiplier.doMath(i, i);
                }

                
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
