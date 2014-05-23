/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lisa.designpatterns.behavioral.visitor;

/**
 *
 * @author 210211911
 */
public interface NumberElement 
{
    public void accept(NumberVisitor visitor);
}
