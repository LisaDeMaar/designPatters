/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lisa.designpatterns.behavioral.templatemethod;

/**
 *
 * @author 210211911
 */
public abstract class MealInterface 
{
    // template method
	public final void doMeal() {
		prepareIngredients();
		cook();
		eat();
		cleanUp();
	}

	public abstract void prepareIngredients();

	public abstract void cook();

	public void eat() {
		System.out.println("Mmm, that's good");
	}

	public abstract void cleanUp();
    
}
