package observer.pattern;

class Subscriber implements Observer{

	private String subscriberName;
	private Subject subject;
	
	public Subscriber(String subscriberName,Subject subject) {
		this.subscriberName = subscriberName;
		this.subject = subject;
		subject.addObserver(this);
	}

	public void update(String youtuberName, String videoName) {
		System.out.println(subscriberName + " checkout new video by" + youtuberName + "whose video is" + videoName);
	}
	
	public void unSubscribe() {
		System.out.println(subscriberName + " Unsbscribing");
		subject.deleteObserver(this);
	}
}