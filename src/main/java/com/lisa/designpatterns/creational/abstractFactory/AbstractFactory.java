/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lisa.designpatterns.creational.abstractFactory;

/**
 *
 * @author Lisa
 */
public class AbstractFactory {
    
    public SpeciesFactoryInterface getSpeciesFactory(String type) {
		if ("mammal".equals(type)) {
			return new MammalFactory();
		} else {
			return new ReptileFactory();
		}
	}


    
}
