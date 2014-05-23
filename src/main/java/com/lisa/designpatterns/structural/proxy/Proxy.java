/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lisa.designpatterns.structural.proxy;

import java.util.Date;

/**
 *
 * @author Lisa
 */
public class Proxy  
{
    SlowThing slowThing;

	public Proxy() {
		System.out.println("Creating proxy at " + new Date());
	}

	public void sayHello() {
		if (slowThing == null) {
			slowThing = new SlowThing();
		}
		slowThing.sayHello();
	}


    
		
}
