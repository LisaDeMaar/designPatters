/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lisa.designpatterns.behavioral;


import com.lisa.designpatterns.behavioral.templatemethod.HamburgerMeal;
import com.lisa.designpatterns.behavioral.templatemethod.MealInterface;
import com.lisa.designpatterns.behavioral.templatemethod.TacoMeal;
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
public class TemplateMethodTest {
    
    public TemplateMethodTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void TemplateMethod()
    {
        MealInterface meal1 = new HamburgerMeal();
		meal1.doMeal();

		System.out.println();

		MealInterface meal2 = new TacoMeal();
		meal2.doMeal();
                
                Assert.assertNotEquals(meal1, meal2);
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