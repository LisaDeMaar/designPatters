/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lisa.designpatterns.behavioral.chainOfResponsibility;

/**
 *
 * @author 210211911
 */
public class VenusHandler extends PlanetHandler
{
    public void handleRequest(PlanetEnum request) {
		if (request == PlanetEnum.VENUS) {
			System.out.println("VenusHandler handles " + request);
			System.out.println("Venus is poisonous.\n");
		} else {
			System.out.println("VenusHandler doesn't handle " + request);
			if (successor != null) {
				successor.handleRequest(request);
			}
		}
	}
}
