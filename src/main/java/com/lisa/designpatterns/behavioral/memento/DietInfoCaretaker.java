/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lisa.designpatterns.behavioral.memento;

/**
 *
 * @author 210211911
 */
public class DietInfoCaretaker 
{
        Object objMemento;

	public void saveState(DietInfo dietInfo) {
		objMemento = dietInfo.save();
	}

	public void restoreState(DietInfo dietInfo) {
		dietInfo.restore(objMemento);
	}

}
