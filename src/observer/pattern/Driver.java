package observer.pattern;

public class Driver {

	public static void main(String[] args) {
		YoutubeSubject mrBeast = new YoutubeSubject("Mr Beast");

		YoutubeSubject fiveUp = new YoutubeSubject("5-up");

		Subscriber james = new Subscriber("James",mrBeast);

		Subscriber gaurav = new Subscriber("Gaurav",fiveUp);

		Subscriber joy = new Subscriber("Joy",mrBeast);

		Subscriber vega = new Subscriber("Vega",fiveUp);

		mrBeast.setMessageByYoutuber(" Spend 1 million in an hour");
		fiveUp.setMessageByYoutuber(" New Among Us Map Airship Mod");
		
		vega.unSubscribe();
		
		fiveUp.setMessageByYoutuber(" Among Us Mod New");
	}

}
