/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lisa.designpatterns.structural.decorater;

/**
 *
 * @author 210211911
 */
public class GrowlDecorator extends AnimalDecorator 
{
    public GrowlDecorator(AnimalInterface2 animal) {
		super(animal);
	}

	@Override
	public void describe() {
		animal.describe();
		growl();
                
               
	}

	public void growl() {
		System.out.println("Grrrrr.");
	}
}
