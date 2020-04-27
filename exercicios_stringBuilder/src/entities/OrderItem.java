package entities;

public class OrderItem {

	private Integer Quantity;
	private Double Price;
	
	private Product product;

	public OrderItem(Integer quantity, Double price, Product product) {
		Quantity = quantity;
		Price = price;
		this.product = product;
	}

	public Integer getQuantity() {
		return Quantity;
	}

	public void setQuantity(Integer quantity) {
		Quantity = quantity;
	}

	public Double getPrice() {
		return Price;
	}

	public void setPrice(Double price) {
		Price = price;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	
	public double subTotal() {
		return Price * Quantity;
	}
	
	@Override
	public String toString() {
		return product.getName()
				+ ", $"
				+ String.format("%.2f", Price) +
				"Quantity: "
				+ Quantity + 
				"Subtotal: $"
				+ String.format("%.2f", subTotal());
	}
}
