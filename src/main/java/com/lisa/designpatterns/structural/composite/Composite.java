/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lisa.designpatterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lisa
 */
public class Composite implements Component
{
        List<Component> components = new ArrayList<Component>();

	@Override
	public void sayHello() 
        {
		for (Component component : components) 
                {
			component.sayHello();
		}
	}

	@Override
	public void sayGoodbye() {
		for (Component component : components) {
			component.sayGoodbye();
		}
	}

	public void add(Component component) {
		components.add(component);
	}

	public void remove(Component component) {
		components.remove(component);
	}

	public List<Component> getComponents() {
		return components;
	}

	public Component getComponent(int index) {
		return components.get(index);
	}


     
}
