package servlets;

import dao.BillDAO;
import models.Bill;

import javax.servlet.http.*;
import javax.servlet.ServletException;
import java.io.IOException;
import java.util.List;

public class ViewBillsServlet extends HttpServlet {
	protected void 	doGet (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Bill> bills = BillDAO.getAllBills();
		request.setAttribute("bills", bills);
		request.getRequestDispatcher("/views/viewBills.jsp").forward(request, response);
	}
}