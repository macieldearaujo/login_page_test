package application;

public class Main {

	public static void main(String args[]) {
		IDandPassword logininfo = new IDandPassword();
		
		LoginPage loginPage = new LoginPage(logininfo.getLoginInfo());
	}
}
