<!DOCTYPE html>
<html>
<head>
    <title>View Products</title>
</head>
<body>
    <h1>Product List</h1>
    <table border="1" cellpadding="5">
        <thead>
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Category</th>
                <th>Quantity</th>
                <th>Purchase Price</th>
                <th>Selling Price</th>
                <th>Tax Rate</th>
            </tr>
        </thead>
        <tbody>
            <%
                List<models.Product> products = (List<models.Product>) request.getAttribute("products");
                if (products != null && !products.isEmpty()) {
                    for (models.Product product : products) {
            %>
            <tr>
                <td><%= product.getId() %></td>
                <td><%= product.getName() %></td>
                <td><%= product.getCategory() %></td>
                <td><%= product.getQuantity() %></td>
                <td><%= product.getPurchasePrice() %></td>
                <td><%= product.getSellingPrice() %></td>
                <td><%= product.getTaxRate() %></td>
            </tr>
            <%
                    }
                } else {
            %>
            <tr>
                <td colspan="7">No products found.</td>
            </tr>
            <%
                }
            %>
        </tbody>
    </table>
</body>
</html>
