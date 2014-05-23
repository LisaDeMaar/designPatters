/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lisa.designpatterns.behavioral.chainOfResponsibility;

/**
 *
 * @author 210211911
 */
public abstract class PlanetHandler 
{
    PlanetHandler successor;

	public void setSuccessor(PlanetHandler successor) {
		this.successor = successor;
	}

	public abstract void handleRequest(PlanetEnum request);
}
