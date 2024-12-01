<!DOCTYPE html>
<html>
<head>
    <title>Generate Bill</title>
</head>
<body>
    <h1>Generate Bill</h1>
    <form action="../generateBill" method="post">
        <label for="userId">User ID:</label>
        <input type="number" name="userId" id="userId" placeholder="Enter user ID" required><br>

        <label for="total">Total Amount:</label>
        <input type="number" name="total" id="total" step="0.01" placeholder="Enter total amount" required><br>

        <label for="tax">Tax Amount:</label>
        <input type="number" name="tax" id="tax" step="0.01" placeholder="Enter tax amount" required><br>

        <label for="discount">Discount:</label>
        <input type="number" name="discount" id="discount" step="0.01" placeholder="Enter discount amount"><br>

        <h3>Bill Items</h3>
        <div id="items">
            <div>
                <label for="productId">Product ID:</label>
                <input type="number" name="productIds" placeholder="Enter product ID" required>
                <label for="quantity">Quantity:</label>
                <input type="number" name="quantities" placeholder="Enter quantity" required>
                <label for="price">Price:</label>
                <input type="number" name="prices" step="0.01" placeholder="Enter price" required>
            </div>
        </div>
        <button type="button" onclick="addItem()">Add Another Item</button><br>

        <button type="submit">Generate Bill</button>
    </form>

    <script>
        function addItem() {
            const itemsDiv = document.getElementById("items");
            const newItem = document.createElement("div");
            newItem.innerHTML = `
                <label for="productId">Product ID:</label>
                <input type="number" name="productIds" placeholder="Enter product ID" required>
                <label for="quantity">Quantity:</label>
                <input type="number" name="quantities" placeholder="Enter quantity" required>
                <label for="price">Price:</label>
                <input type="number" name="prices" step="0.01" placeholder="Enter price" required>
            `;
            itemsDiv.appendChild(newItem);
        }
    </script>
</body>
</html>
