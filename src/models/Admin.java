package models;

public class Admin extends User {
	public Admin (int id, String username) {
		super(id, username, "Admin");
	}
	
	public void generateReport() {
		System.out.println("Generating Report...");
	}
}