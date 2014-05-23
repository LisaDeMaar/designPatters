/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lisa.designpatterns.creational;


import com.lisa.designpatterns.creational.builder.ItalianMealBuilder;
import com.lisa.designpatterns.creational.builder.JapaneseMealBuilder;
import com.lisa.designpatterns.creational.builder.Meal;
import com.lisa.designpatterns.creational.builder.MealBuilder;
import com.lisa.designpatterns.creational.builder.MealDirector;
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
public class BuilderTest {
    
    public BuilderTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public void BuilderTest()
    {
                MealBuilder mealBuilder = new ItalianMealBuilder();
		MealDirector mealDirector = new MealDirector(mealBuilder);
		mealDirector.constructMeal();
		Meal meal = mealDirector.getMeal();
                Assert.assertEquals(meal.toString(), "drink:red wine, main course:pizza, side:bread");
		
		
		mealBuilder = new JapaneseMealBuilder();
		mealDirector = new MealDirector(mealBuilder);
		mealDirector.constructMeal();
		meal = mealDirector.getMeal();
		Assert.assertEquals(meal.toString(), "drink:sake, main course:chicken teriyaki, side:miso soup");
                
                

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
