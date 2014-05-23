/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lisa.designpatterns.creational.abstractFactory;

import com.lisa.designpatterns.creational.factory.AnimalInterface;



/**
 *
 * @author Lisa
 */
public class ReptileFactory implements SpeciesFactoryInterface 
{
    @Override
	public AnimalInterface getAnimal(String type) {
		if ("snake".equals(type)) {
			return new Snake();
		} else {
			return new Tyrannosaurus();
		}

    
}
}
