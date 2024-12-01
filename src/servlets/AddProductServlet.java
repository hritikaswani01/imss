package servlets;

import dao.ProductDAO;
import models.Product;

import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;

public class AddProductServlet extends HttpServlet {
	protected void doPost (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String category = request.getParameter("category");
		int quantity = Integer.parseInt(request.getParameter("quantity"));
		double puchasePrice = Double.parseDouble(request.getParameter("purchasePrice"));
		double sellingPrice = Double.parseDouble(request.getParameter("sellingPrice"));
		double taxRate = Double.parseDouble(request.getParameter("taxRate"));
		
		Product product = new Product(0, name, category, quantity, purchasePrice, sellingPrice, taxRate);
		
		if (ProductDAO.addProduct(product)) {
			response.sendRedirect("viewProducts");
		} else {
			response.getWriter().println("Error Adding Product. Please Try Again..");
		}
	}
}