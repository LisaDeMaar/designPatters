/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lisa.designpatterns.behavioral.state;

/**
 *
 * @author 210211911
 */
public class SadState implements EmotionalState
{
    @Override
	public String sayGoodbye() 
        {
		return "Bye. Sniff, sniff.";
	}

	@Override
	public String sayHello() 
        {
		return "Hello. Sniff, sniff.";
	}
}
