/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lisa.designpatterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Lisa
 */
public class FlyweightFactory 
{
    private static FlyweightFactory flyweightFactory;

	private Map<String, FlyweightInterface> flyweightPool;

	private FlyweightFactory() {
		flyweightPool = new HashMap<String, FlyweightInterface>();
	}

	public static FlyweightFactory getInstance() {
		if (flyweightFactory == null) {
			flyweightFactory = new FlyweightFactory();
		}
		return flyweightFactory;
	}

	public FlyweightInterface getFlyweight(String key) {
		if (flyweightPool.containsKey(key)) {
			return flyweightPool.get(key);
		} else {
			FlyweightInterface flyweight;
			if ("add".equals(key)) {
				flyweight = new FlyweightAdder();
			} else {
				flyweight = new FlyweightMultiplier();
			}
			flyweightPool.put(key, flyweight);
			return flyweight;
		}
	}


}
