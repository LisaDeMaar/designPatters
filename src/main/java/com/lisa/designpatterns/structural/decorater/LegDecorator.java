/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lisa.designpatterns.structural.decorater;

/**
 *
 * @author 210211911
 */
public class LegDecorator extends AnimalDecorator 
{
    public LegDecorator(AnimalInterface2 animal) {
		super(animal);
	}

	@Override
	public void describe() {
		animal.describe();
		System.out.println("I have legs.");
		dance();
	}

	public void dance() {
		System.out.println("I can dance.");
	}
    
}
