package DAO;

import models.Product;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductDAO {
	public static boolean addProduct(Product product) {
		boolean status = false;
		try (Connection con = DBConnection.getConnection();
			PreparedStatement ps = con.prepareStatement("INSERT INTO products (name, category, quantity, purchase_price, selling_price, tax_rate) values (?, ?, ?, ?, ?, ?)")
				){
			ps.setString(1, product.getName());
			ps.setString(2, product.getCategory());
			ps.setInt(3, product.getQuantity());
			ps.setDouble(4, product.getPurchasePrice());
			ps.setDouble(5, product.getSellingPrice());
			ps.setDouble(6, product.getTaxRate());
			status = ps.executeUpdate() > 0;
		} catch(Exception e) {
			e.printStackTrace();
		}
		return status;
	}
	
	
	public static List<Product> getAllProducts() {
		List<Product> products = new ArrayList<>();
		try (Connection con = DBConnection.getConnection(); Statement stmt = con.createStatement(); ResultSet rs = stmt.executeQuery("SELECT * FROM products")){
			while (rs.next()) {
				products.add(new Product(
						rs.getInt("id"),
						rs.getString("category"),
						rs.getInt("quantity"),
						rs.getDouble("purchase_price"),
						rs.getDouble("selling_price"),
						rs.getDouble("tax_rate")
						));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return products;
	}
}