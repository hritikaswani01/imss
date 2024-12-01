package models;

public class Product {
	private int id;
	private String name;
	private String category;
	private int quantity;
	private double purchasePrice;
	private double sellingPrice;
	private double taxRate;
	
	public Product(int id, String name, String category, int quantity, double purchasePrice, double sellingPrice, double taxRate) {
		this.id = id;
		this.name = name;
		this.category = category;
		this.quantity = quantity;
		this.purchasePrice = purchasePrice;
		this.sellingPrice = sellingPrice;
		this.taxRate = taxRate;
	}
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getCategory() {
		return category;
	}
	public double getPurchasePrice() {
		return purchasePrice;
	}
	public double getSellingPrice() {
		return sellingPrice;
	}
	public double getTaxRate() {
		return taxRate;
	}
}