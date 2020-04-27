package entities;

public class Product {
	
	private String Name;
	private Double Price;
	
	public Product(String name, Double price) {
		Name = name;
		Price = price;
	}

	public String getName() {
		return Name;
	}
	
	public void setName(String name) {
		Name = name;
	}

	public Double getPrice() {
		return Price;
	}

	public void setPrice(Double price) {
		Price = price;
	}
}
