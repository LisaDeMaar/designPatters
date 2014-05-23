/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lisa.designpatterns.behavioral.observer;

/**
 *
 * @author 210211911
 */
public class WeatherCustomer1  implements WeatherObserver
{
    @Override
	public void doUpdate(int temperature) {
		System.out.println("Weather customer 1 just found out the temperature is:" + temperature);
	}
}
