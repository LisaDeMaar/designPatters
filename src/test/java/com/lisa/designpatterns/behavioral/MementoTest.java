/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lisa.designpatterns.behavioral;


import com.lisa.designpatterns.behavioral.memento.DietInfo;
import com.lisa.designpatterns.behavioral.memento.DietInfoCaretaker;
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
public class MementoTest {
    
    public MementoTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public void MementoMethod()
    {
        // caretaker
		DietInfoCaretaker dietInfoCaretaker = new DietInfoCaretaker();

		// originator
		DietInfo dietInfo = new DietInfo("Fred", 1, 100);
		Assert.assertEquals("Fred", "Fred");
                Assert.assertEquals(1, 1);
                Assert.assertEquals(100, 100);

		dietInfo.setDayNumberAndWeight(2, 99);
                Assert.assertEquals(2, 2);
                Assert.assertEquals(99, 99);
		
		System.out.println("Saving state.");
		dietInfoCaretaker.saveState(dietInfo);

		dietInfo.setDayNumberAndWeight(3, 98);
		Assert.assertEquals(3, 3);
                Assert.assertEquals(98, 98);

		dietInfo.setDayNumberAndWeight(4, 97);
		Assert.assertEquals(4, 4);
                Assert.assertEquals(97, 97);

		System.out.println("Restoring saved state.");
		dietInfoCaretaker.restoreState(dietInfo);
		System.out.println(dietInfo);

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