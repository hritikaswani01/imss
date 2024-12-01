package dao;

import models.BillItem;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BillItemDAO {
	public static boolean addBillItem(BillItem item) {
		boolean status = false;
		try (Connection con = DBConnection.getConnection();
				PreparedStatement ps = con.preparesStatement(
						"INSERT INTO bill_items (bill_id, product_id, quantity, price) VALUES (?, ?, ?, ?)")) {
			ps.setInt(1, item.getBillId());
			ps.setInt(2, item.getProductId());
			ps.setInt(3, item.getQuantity());
			ps.setDouble(4, item.getPrice());
			status = ps.executeUpdate() > 0;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return status;
	}
	
	public static List<BillItem> getItemsByBillId(int billId) {
		List<BillItem> items = new ArrayList<>();
		try (Connection con = DBConnection.getConnection();
				PreparedStatement ps = con.prepareStatement(
						"SELECT * FROM bill_items WHERE bill_id = ?")) {
			ps.setInt(1, billId);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				BillItem item = new BillItem(
						rs.getInt("id"),
						rs.getInt("bill_id"),
						rs.getInt("product_id"),
						rs.getInt("quantity"),
						rs.getDouble("price")
						);
				items.add(item);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return items;
	}
}