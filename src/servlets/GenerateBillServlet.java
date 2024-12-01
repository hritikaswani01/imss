package servlets;

import dao.BillDAO;
import dao.BillItemDAO;
import models.Bill;
import models.BillItem;

import javax.servlet.http.*;
import javax.servlet.ServletException;
import javax.io.IOException;
import java.util.ArrayList;

public class GenerateBillServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int userId = Integer.parseInt(request.getParameter("userId"));
		double total = Double.parseDouble(request.getParameter("total"));
		double tax = Double.parseDouble(request.getParameter("tax"));
		double discount = Double.parseDouble(request.getParameter("discount"));
		
		
		Bill bill = new Bill(0, userId, total, tax, discount, new ArrayList<>());
		int billId	= BillDAO.createBill(bill);
		
		if (billId > 0) {
				String[] productIds = request.getParameterValues("productIds");
				String[] quantities = request.getParameterValues("quantities");
				String[] prices = request.getParameterValues("prices");
				
				for (int i=0; i<productIds.length; i++) {
					BillItem item = new BillItem(
							0,
							billId,
							Integer.parseInt(productIds[i]),
							Integer.parseInt(quantities[i]),
							Integer.parseInt(prices[i])
					);
					BillItemDAO.addBillItem(item);
				}
				response.sendRedirect("viewBills");
		} else {
			response.getWriter().println("Error Generating bill. Please Try Again.")
		}
		
	}
}