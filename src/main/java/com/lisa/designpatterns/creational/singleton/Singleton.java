/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lisa.designpatterns.creational.singleton;

/**
 *
 * @author Lisa
 */
public class Singleton 
{
    

	private static Singleton singleton = null;

	private Singleton() {
	}

	public static Singleton getInstance() {
		if (singleton == null) {
			singleton = new Singleton();
		}
		return singleton;
	}

	public void sayHello() {
		System.out.println("Hello");
	}
}


