/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lisa.designpatterns.structural.bridge;

/**
 *
 * @author Lisa
 */
public class SmallEngine implements Engine
{
    int horsepower;

	public SmallEngine() {
		horsepower = 100;
	}

	@Override
	public String go() {
		return "\nThe small engine is running";
		
	}


}
