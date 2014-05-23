/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lisa.designpatterns.structural.decorater;

/**
 *
 * @author 210211911
 */
public class WingDecorator extends AnimalDecorator 
{
    public WingDecorator(AnimalInterface2 animal) {
		super(animal);
	}

	@Override
	public void describe() {
		animal.describe();
		System.out.println("I have wings.");
		fly();
	}

	public void fly() {
		System.out.println("I can fly.");
	}
}
