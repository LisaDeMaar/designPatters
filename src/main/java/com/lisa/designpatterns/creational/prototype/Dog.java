/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lisa.designpatterns.creational.prototype;

/**
 *
 * @author Lisa
 */
public class Dog implements PrototypeInterface
{
        String sound;

	public Dog(String sound) 
        {
		this.sound = sound;
	}

	@Override
	public PrototypeInterface doClone() {
		return new Dog(sound);
	}

        @Override
	public String toString() 
        {
		return "This dog says " + sound;
    
}
}
