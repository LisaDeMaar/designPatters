/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lisa.designpatterns.creational.abstractFactory;

import com.lisa.designpatterns.creational.factory.AnimalInterface;
import com.lisa.designpatterns.creational.factory.Cat;
import com.lisa.designpatterns.creational.factory.Dog2;



/**
 *
 * @author Lisa
 */
public class MammalFactory implements SpeciesFactoryInterface{
    
    	@Override
	public AnimalInterface getAnimal(String type) {
		if ("dog".equals(type)) {
			return new Dog2();
		} else {
			return new Cat();
		}
	}


    
}
