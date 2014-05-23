/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lisa.designpatterns.behavioral;


import com.lisa.designpatterns.behavioral.command.Command;
import com.lisa.designpatterns.behavioral.command.Dinner;
import com.lisa.designpatterns.behavioral.command.DinnerCommand;
import com.lisa.designpatterns.behavioral.command.Lunch;
import com.lisa.designpatterns.behavioral.command.LunchCommand;
import com.lisa.designpatterns.behavioral.command.MealInvoker;
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
public class CommandTest {
    
    public CommandTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public void CommandMethod()
    {
                Lunch lunch = new Lunch(); // receiver
		Command lunchCommand = new LunchCommand(lunch); // concrete command
                

		Dinner dinner = new Dinner(); // receiver
		Command dinnerCommand = new DinnerCommand(dinner); // concrete command

		MealInvoker mealInvoker = new MealInvoker(lunchCommand); // invoker
                Assert.assertEquals(mealInvoker,mealInvoker);
		mealInvoker.invoke();
                

		mealInvoker.setCommand(dinnerCommand);
		mealInvoker.invoke();

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