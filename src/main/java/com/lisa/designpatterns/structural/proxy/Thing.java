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
public abstract class Thing 
{
    	public void sayHello() {
		System.out.println(this.getClass().getSimpleName() + " says howdy at " + new Date());
	}


}
