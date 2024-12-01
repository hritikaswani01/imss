<!DOCTYPE html>
<html>
	<head>
		<title>Add Product</title>
	</head>
	<body>
		<h1>Add New Product</h1>
		<form action='../addProduct' method='post'>
			<label for="name">Product Name:</label>
			<input type="text" name="name" id="name" placeholder="Enter product name" required ><br>
			
			<label for="category">Category:</label>
			<input type="text" name="category" id="category" placeholder="Enter Category" required><br>
			<label for="quantity">Quantity:</label>
			<input type="number" name="quantity" id="quantity" placeholder="Enter quantity" required><br>

			<label for="purchasePrice">Purchase Price:</label>
			<input type="number" name="purchasePrice" id="purchasePrice" step="0.01" placeholder="Enter purchase price" required><br>

			<label for="sellingPrice">Selling Price:</label>
			<input type="number" name="sellingPrice" id="sellingPrice" step="0.01" placeholder="Enter selling price" required><br>

			<label for="taxRate">Tax Rate:</label>
			<input type="number" name="taxRate" id="taxRate" step="0.01" placeholder="Enter tax rate" required><br>

			<button type="submit">Add Product</button>
		</form>
	</body>
</html>