package com.yuan.observer;

/**
 * 具体的观察者。
 * 
 * @author admin
 *
 */
public class ConcreteWatcher1 implements Watcher {

	@Override
	public void update(String str) {
		System.out.println(this.getClass().getName() + str);

	}

}
