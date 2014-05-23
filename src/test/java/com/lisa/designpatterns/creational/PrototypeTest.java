/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lisa.designpatterns.creational;



import com.lisa.designpatterns.creational.prototype.Dog;
import com.lisa.designpatterns.creational.prototype.Person;
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
public class PrototypeTest {
    
    public PrototypeTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void ProTest()
    {
                Person person1 = new Person("Fred");
		Person person2 = (Person) person1.doClone();
		Assert.assertEquals(person2.toString(), "This person is named Fred");

		Dog dog1 = new Dog("Wooof!");
                Dog dog2 = (Dog) dog1.doClone();
		Assert.assertEquals(dog2.toString(), "This dog says Wooof!");


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
