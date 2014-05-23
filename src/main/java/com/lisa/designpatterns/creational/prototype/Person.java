/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lisa.designpatterns.creational.prototype;

/**
 *
 * @author Lisa
 */
public class Person implements PrototypeInterface
{
    String name;

	public Person(String name) 
        {
		this.name = name;
	}

	@Override
	public PrototypeInterface doClone() 
        {
		return new Person(name);
	}

	public String toString() 
        {
		return "This person is named " + name;
	}

    
}
