/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lisa.designpatterns.structural.decorater;

/**
 *
 * @author 210211911
 */
public abstract class AnimalDecorator implements AnimalInterface2
{
    AnimalInterface2 animal;

	public AnimalDecorator(AnimalInterface2 animal) 
        {
		this.animal = animal;
	}
}
