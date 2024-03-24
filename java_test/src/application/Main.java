package application;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		Map<String, String> loginfo = new HashMap<>();
		
		String id = "doug";
		String password = "12345";
		
		loginfo.put(id, password);
		
		System.out.print("User: ");
		String idField = sc.next();
		System.out.print("Senha: ");
		String passwordField = sc.next();
		
		if(loginfo.get(idField).equals(passwordField)) {
			System.out.println("Ola");
		}
		
		sc.close();
		
	}
}
