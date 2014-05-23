/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lisa.designpatterns.behavioral.mediator;

/**
 *
 * @author 210211911
 */
public class FrenchBuyer extends Buyer
{
    public FrenchBuyer(Mediator mediator) 
    {
		super(mediator, "euro");
		this.mediator.registerFrenchBuyer(this);
    }
}
