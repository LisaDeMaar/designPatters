/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lisa.designpatterns.creational;


import com.lisa.designpatterns.creational.abstractFactory.AbstractFactory;
import com.lisa.designpatterns.creational.abstractFactory.AbstractFactory;
import com.lisa.designpatterns.creational.abstractFactory.SpeciesFactoryInterface;
import com.lisa.designpatterns.creational.abstractFactory.SpeciesFactoryInterface;
import com.lisa.designpatterns.creational.factory.AnimalInterface;
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
public class AbstractFactoryTest {
    
    public AbstractFactoryTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public void AbstractFacTest()
    {
        AbstractFactory abstractFactory = new AbstractFactory();
        

		SpeciesFactoryInterface speciesFactory1 = abstractFactory.getSpeciesFactory("reptile");
		AnimalInterface a1 = speciesFactory1.getAnimal("tyrannosaurus");
                Assert.assertEquals(a1.makeSound(), "Roar");
                
                
		AnimalInterface a2 = speciesFactory1.getAnimal("snake");
		Assert.assertEquals(a2.makeSound(), "Hiss");

		SpeciesFactoryInterface speciesFactory2 = abstractFactory.getSpeciesFactory("mammal");
		AnimalInterface a3 = speciesFactory2.getAnimal("dog");
		Assert.assertEquals(a3.makeSound(), "Woof");
                
		AnimalInterface a4 = speciesFactory2.getAnimal("cat");
		Assert.assertEquals(a4.makeSound(), "Meow");

        
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
