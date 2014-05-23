/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lisa.designpatterns.behavioral.templatemethod;

/**
 *
 * @author 210211911
 */
public class TacoMeal extends MealInterface
{
    @Override
	public void prepareIngredients() {
		System.out.println("Getting ground beef and shells");
	}

	@Override
	public void cook() {
		System.out.println("Cooking ground beef in pan");
	}

	@Override
	public void eat() {
		System.out.println("The tacos are tasty");
	}

	@Override
	public void cleanUp() {
		System.out.println("Doing the dishes");
	}
}
