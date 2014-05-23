/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lisa.designpatterns.structural.bridge;

/**
 *
 * @author Lisa
 */
public class BigEngine implements Engine
{
    int horsepower;

	public BigEngine() {
		horsepower = 350;
	}

	@Override
	public String go() {
		return "\nThe big engine is running";
		
	}


    
}
