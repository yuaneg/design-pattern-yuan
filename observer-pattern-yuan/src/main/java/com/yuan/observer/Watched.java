package com.yuan.observer;

/**
 * 抽象主题角色。
 * 
 * @author admin
 *
 */
public interface Watched<T> {

	public void addWatcher(T t);

	public void removeWatcher(T t);

	public void notifyWatchers(String str);
	
	@SuppressWarnings("unchecked")
	public void addWatherAll(T...t);

}
