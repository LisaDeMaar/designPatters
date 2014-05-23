/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lisa.designpatterns.structural.bridge;

//import com.sun.xml.internal.ws.api.pipe.Engine;
import com.lisa.designpatterns.structural.bridge.Vehicle;
/*
 * @author Lisa
 */
public class SmallCar extends Vehicle
{
    public SmallCar(Engine engine) {
		this.weightInKilos = 600;
		this.engine = engine;
	}

	@Override
	public String drive() {
		return "\nThe small car is driving" + engine.go(); 
		
	}


    
}
