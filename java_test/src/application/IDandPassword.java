package application;

import java.util.HashMap;

public class IDandPassword {

	private HashMap<String, String> logininfo = new HashMap<>();
	
	public IDandPassword() {
		logininfo.put("douglinhas", "12345");
		logininfo.put("admin", "batatafrita");
		logininfo.put("bro", "pizza");
	}
	
	protected HashMap<String, String> getLoginInfo() {
		return logininfo;
	}
}
