package singleton;

public class Preferences {
	private boolean shareInfo;
	private static Preferences uniqueInstance = null;
	
	private Preferences()
	{
		this.shareInfo = false;
	}
	
	public void setShareInfo(boolean value)
	{
		this.shareInfo = value;
	}
	
	public static Preferences getInstance() {
		if(uniqueInstance == null) {
			uniqueInstance = new Preferences();
		}
		return uniqueInstance;
	}
	
	public String toString()
	{
		return "Application Preferences:\nShare information: " + this.shareInfo; 
	}
}
