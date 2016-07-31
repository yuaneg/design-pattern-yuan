package com.yuan.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体的主题角色。
 * 
 * @author admin
 *
 */
public class ConcreteWatched implements Watched<Watcher> {
	
	// 存放观察者
	private List<Watcher> list = new ArrayList<Watcher>();

	@Override
	public void addWatcher(Watcher watcher) {
		list.add(watcher);
	}

	@Override
	public void removeWatcher(Watcher watcher) {
		list.remove(watcher);
	}

	@Override
	public void notifyWatchers(String str) {
		// 自动调用实际上是主题进行调用的
		for (Watcher watcher : list) {
			watcher.update(str);
		}

	}

	@Override
	public void addWatherAll(Watcher... t) {
		for(Watcher w : t){
			addWatcher(w);
		}
		
	}
}
