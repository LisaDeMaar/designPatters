/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lisa.designpatterns.structural.flyweight;

/**
 *
 * @author Lisa
 */
public class FlyweightMultiplier implements FlyweightInterface 
{
    String operation;

	public FlyweightMultiplier() {
		operation = "multiplying";
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void doMath(int a, int b) {
		System.out.println(operation + " " + a + " and " + b + ": " + (a * b));
	}


    
}
