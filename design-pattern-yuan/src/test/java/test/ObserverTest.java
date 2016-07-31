package test;

import org.junit.Test;

import com.yuan.observer.ConcreteWatched;
import com.yuan.observer.ConcreteWatcher1;
import com.yuan.observer.ConcreteWatcher2;
import com.yuan.observer.Watched;
import com.yuan.observer.Watcher;

public class ObserverTest {
	
	@Test
	public void test(){
		Watched<Watcher> wach = new ConcreteWatched();
		wach.addWatherAll(new ConcreteWatcher1(),new ConcreteWatcher2());
		wach.notifyWatchers("开心");
	}
}
