/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lisa.designpatterns.structural;


import com.lisa.designpatterns.structural.decorater.AnimalInterface2;
import com.lisa.designpatterns.structural.decorater.GrowlDecorator;
import com.lisa.designpatterns.structural.decorater.LegDecorator;
import com.lisa.designpatterns.structural.decorater.LivingAnimal;
import com.lisa.designpatterns.structural.decorater.WingDecorator;
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
public class DecoratorTest {
    
    public DecoratorTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void DecoratorMethod()
    {
        AnimalInterface2 animal = new LivingAnimal();
		animal.describe();
                Assert.assertEquals(animal, animal);

		animal = new LegDecorator(animal);
		animal.describe();

		animal = new WingDecorator(animal);
		animal.describe();

		animal = new GrowlDecorator(animal);
		animal = new GrowlDecorator(animal);
		animal.describe();
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