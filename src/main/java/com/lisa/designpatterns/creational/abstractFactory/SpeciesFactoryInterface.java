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
public interface SpeciesFactoryInterface {
    
    public abstract AnimalInterface getAnimal(String type);

    
}
