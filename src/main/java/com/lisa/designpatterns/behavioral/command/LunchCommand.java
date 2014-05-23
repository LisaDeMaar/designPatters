/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lisa.designpatterns.behavioral.command;

/**
 *
 * @author 210211911
 */
public class LunchCommand implements Command 
{
    Lunch lunch;

	public LunchCommand(Lunch lunch) {
		this.lunch = lunch;
	}

	@Override
	public void execute() {
		lunch.makeLunch();
	}
}
