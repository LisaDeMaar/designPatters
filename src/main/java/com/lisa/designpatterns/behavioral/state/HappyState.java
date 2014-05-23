/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lisa.designpatterns.behavioral.state;

/**
 *
 * @author 210211911
 */
public class HappyState implements EmotionalState
{
    @Override
	public String sayGoodbye() {
		return "Bye, friend!";
	}

	@Override
	public String sayHello() {
		return "Hello, friend!";
	}
}
