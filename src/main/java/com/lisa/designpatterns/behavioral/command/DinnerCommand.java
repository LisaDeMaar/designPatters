/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lisa.designpatterns.behavioral.command;

/**
 *
 * @author 210211911
 */
public class DinnerCommand implements Command 
{
    Dinner dinner;

	public DinnerCommand(Dinner dinner) {
		this.dinner = dinner;
	}

	@Override
	public void execute() {
		dinner.makeDinner();
	}
}
