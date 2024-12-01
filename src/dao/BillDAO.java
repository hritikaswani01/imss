package DAO;

import models.Bill;
import models.BillItem;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BillDAO {
	public static int createBill (Bill bill) {
		int generatedBillId = -1;
		try (Connection con = DBConnection.getConnection();
				PreparedStatement ps = con.prepareStatement(
						"INSERT INTO bills (user_id, total, tax, discount) VALUES (?, ?, ?, ?)", 
						Statement.RETURN_GENERATED_KEYS)){
			ps.setInt(1, bill.getUserId());
			ps.setDouble(2, bill.getTotal());
			ps.setDouble(3, bill.getTax());
			ps.setDouble(4, bill.getDiscount());
			ps.executeUpdate();
			
			ResultSet rs = ps.getGeneratedKeys();
			if (rs.next()) {
				generatedBillId = rs.getInt(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return generatedBillId;
	}
	
	public static List<Bill> getAllBills () {
		List<Bill> bills = new ArrayList();
		try (Connection con = DBConnection.getConnection();
				PreparedStatement ps = con.preparedStatement("SELECT * from bills")){
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Bill bill = new Bill(
						rs.getInt("id"),
						rs.getDouble("user_id"),
						rs.getDouble("total"),
						rs.getDouble("tax"),
						rs.getDouble("discount"),
						null
						);
				bills.add(bill);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return bills;
	}
	
}