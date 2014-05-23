/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lisa.designpatterns.structural.decorater;

/**
 *
 * @author 210211911
 */
public class LivingAnimal implements AnimalInterface2 
{
    @Override
    public void describe() 
    {
        
	System.out.println("\nI am an animal.");
	
    }
    
}
