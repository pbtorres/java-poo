package entities;

public class Product {
	private String name;
	private Double price;
	private Integer quantity;
	
	public Product() {
		
	}
	
	public Product(String name, Double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer n) {
		this.quantity += n;
	}
	public double total() {
		return price * quantity;
	}
	
}
