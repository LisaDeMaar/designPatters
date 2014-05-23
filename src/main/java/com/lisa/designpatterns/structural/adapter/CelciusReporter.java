/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lisa.designpatterns.structural.adapter;

/**
 *
 * @author Lisa
 */
public class CelciusReporter 
{
    double temperatureInC;

	public CelciusReporter() 
        {
	}

	public double getTemperature() 
        {
		return temperatureInC;
	}

	public void setTemperature(double temperatureInC) 
        {
		this.temperatureInC = temperatureInC;
	}


    
}
