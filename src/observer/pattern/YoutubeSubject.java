package observer.pattern;

import java.util.ArrayList;
import java.util.List;

public class YoutubeSubject implements Subject {

	private String youtuberName;
	private List<Observer> observers;
	private String message;
	
	YoutubeSubject(String name){
		this.youtuberName=name;
		this.observers = new ArrayList<Observer>();
	}


	@Override
	public void addObserver(Observer o) {
		observers.add(o);
		
	}


	@Override
	public void deleteObserver(Observer o) {
		observers.remove(o);
	}


	@Override
	public void notifyObservers() {
		for(Observer o:observers) {
			o.update(youtuberName, message);
		}
	}
	
	public void setMessageByYoutuber(String message) {
		this.message = message;
		notifyObservers();
	}
	
}
