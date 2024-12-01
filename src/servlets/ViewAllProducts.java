package servlets;

import dao.ProductDAO;
import models.Product;

import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.List;

public class ViewProductServlet extends HttpServlet {
	protected void doGet (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Product> products = ProductDAO.getAllProducts();
		request.setAttribute("products", products);
		request.getRequestDispatcher('/views/viewProducts.jsp').forward(request, response);
	}
}