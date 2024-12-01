package models;

public class BillItem {
	private int id;
	private int billId;
	private int productId;
	private int quantity;
	private double price;
	
	public BillItem(int id, int billId, int productId, int quantity, double price) {
		this.id = id;
		this.billId = billId;
		this.productId = productId;
		this.quantity = quantity;
		this.price = price;
	}
	
	public int getId() {
		return billId;
	}
	
	public int getBillId() {
		return billId;
	}
	
	public int getProductId() {
		return productId;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public double getPrice() {
		return price;
	}
	
	
}