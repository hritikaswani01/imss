<!DOCTYPE html>
<html>
<head>
    <title>View Bills</title>
</head>
<body>
    <h1>Bill List</h1>
    <table border="1" cellpadding="5">
        <thead>
            <tr>
                <th>Bill ID</th>
                <th>User ID</th>
                <th>Total Amount</th>
                <th>Tax</th>
                <th>Discount</th>
                <th>Date</th>
            </tr>
        </thead>
        <tbody>
            <%
                List<models.Bill> bills = (List<models.Bill>) request.getAttribute("bills");
                if (bills != null && !bills.isEmpty()) {
                    for (models.Bill bill : bills) {
            %>
            <tr>
                <td><%= bill.getId() %></td>
                <td><%= bill.getUserId() %></td>
                <td><%= bill.getTotal() %></td>
                <td><%= bill.getTax() %></td>
                <td><%= bill.getDiscount() %></td>
                <td><%= bill.getDate() %></td>
            </tr>
            <%
                    }
                } else {
            %>
            <tr>
                <td colspan="6">No bills found.</td>
            </tr>
            <%
                }
            %>
        </tbody>
    </table>
</body>
</html>
