/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lisa.designpatterns.creational.builder;

/**
 *
 * @author Lisa
 */
public interface MealBuilder {
    
        public void buildDrink();

	public void buildMainCourse();

	public void buildSide();

	public Meal getMeal();

    
}
