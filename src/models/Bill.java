package models;

import java.util.List;

public class Bill {
	private int id;
	private int userId;
	private double total;
	private double tax;
	private double discount;
	private List<BillItem> items;
	
	public Bill(int id, int userId, double total, double tax, double discount, List<BillItem> items) {
		this.id = id;
		this.userId = userId;
		this.total = total;
		this.tax = tax;
		this.discount = discount;
		this.items = items;
	}
	public int getId() {
		return id;
	}
	public int getUserId() {
		return userId;
	}
	public double getTotal() {
		return total;
	}
	public double getTax() {
		return tax;
	}
	
	public double getDiscount() {
		return discount;
	}
	
	public List<BillItem> getItems() {
		return items;
	}
	
	
	
	
	
	
	
	
}