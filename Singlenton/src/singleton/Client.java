package singleton;

public class Client {
	public static void main(String[] args) {
		//Preferences pref =  new Preferences();
		Preferences pref = Preferences.getInstance();
		System.out.println(pref.toString());
		pref.setShareInfo(true);
		System.out.println(pref.toString());
		//...
		//pref = new Preferences();
		pref =  Preferences.getInstance();
		System.out.println(pref.toString());
		
		
	}
}
