/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lisa.designpatterns.behavioral.observer;

/**
 *
 * @author 210211911
 */
public interface WeatherSubject 
{
        public void addObserver(WeatherObserver weatherObserver);

	public void removeObserver(WeatherObserver weatherObserver);

	public void doNotify();
}
