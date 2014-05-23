/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lisa.designpatterns.behavioral.visitor;


/**
 *
 * @author 210211911
 */
public class TwoElement implements NumberElement  
{
        int a;
	int b;

	public TwoElement(int a, int b) {
		this.a = a;
		this.b = b;
	}

	@Override
	public void accept(NumberVisitor visitor) {
		visitor.visit(this);
	}
}
