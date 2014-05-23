/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lisa.designpatterns.creational.factory;

/**
 *
 * @author Lisa
 */
public class AnimalFactory
{
    
    public AnimalInterface getAnimal(String type) 
    {
		if ("canine".equals(type)) 
                {
			return new Dog2();
		} 
                else 
                {
			return new Cat();
		}
	}
    
}
