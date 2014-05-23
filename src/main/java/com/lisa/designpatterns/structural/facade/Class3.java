/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lisa.designpatterns.structural.facade;

/**
 *
 * @author Lisa
 */
public class Class3 
{
    
    public int doMoreStuff(Class1 class1, Class2 class2, int x) {
		return class1.doSomethingComplicated(x) * class2.doAnotherThing(class1, x);
	}


}
