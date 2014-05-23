/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lisa.designpatterns.behavioral;



import com.lisa.designpatterns.behavioral.state.HappyState;
import com.lisa.designpatterns.behavioral.state.Person;
import com.lisa.designpatterns.behavioral.state.SadState;
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
public class StateTest {
    
    public StateTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void StateMethod()
    {
                Person person = new Person(new HappyState());
                Assert.assertEquals(person.sayHello(), "Hello, friend!");
		Assert.assertEquals(person.sayGoodbye(),"Bye, friend!");
		

		person.setEmotionalState(new SadState());
                Assert.assertEquals(person.sayHello(), "Hello. Sniff, sniff.");
                Assert.assertEquals(person.sayGoodbye(),"Bye. Sniff, sniff.");
		
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