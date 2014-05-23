/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lisa.designpatterns.structural.bridge;




/**
 *
 * @author Lisa
 */
public class BigBus extends Vehicle
{
    public BigBus(Engine engine) {
		this.weightInKilos = 3000;
		this.engine = engine;
	}

	@Override
	public String drive() {
		return "\nThe big bus is driving" + engine.go();
                
	}


}
