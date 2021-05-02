package observer.pattern;

public interface Subject {
	void addObserver(Observer o);
	void notifyObservers();
	void deleteObserver(Observer o);
}
