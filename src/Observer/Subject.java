package Observer;

import java.util.List;

public abstract class Subject {
	private List<Observer> observerList;

	public abstract void addObserver(Observer obs);
	public abstract void notifyObservers();
	public abstract void done();

}
