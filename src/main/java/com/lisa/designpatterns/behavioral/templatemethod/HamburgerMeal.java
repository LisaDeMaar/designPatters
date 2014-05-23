/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lisa.designpatterns.behavioral.templatemethod;

/**
 *
 * @author 210211911
 */
public class HamburgerMeal extends MealInterface
{
    @Override
	public void prepareIngredients() {
		System.out.println("Getting burgers, buns, and french fries");
	}

	@Override
	public void cook() {
		System.out.println("Cooking burgers on grill and fries in oven");
	}

	@Override
	public void cleanUp() {
		System.out.println("Throwing away paper plates");
	}
}
