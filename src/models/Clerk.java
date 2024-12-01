package models;

public class Clerk extends User {
	public Clerk(int id, String username) {
		super(id, username, "Clerk");
	}
	
	public void generateBill() {
		System.out.println("Generating the Report...");
	}
}