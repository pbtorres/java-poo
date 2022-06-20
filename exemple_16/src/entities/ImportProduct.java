package entities;

public class ImportProduct extends Product{
	private Double custonsFee;
	
	public ImportProduct() {
		
	}

	public ImportProduct(String name, Double price, Double custonsFee) {
		super(name, price);
		this.custonsFee = custonsFee;
	}
	
	@Override
	public String priceTag() {
		return this.getName() + " " + totalPrice() + " (Cunstons fee: $" + String.format("%.2f", this.custonsFee) + ")";
	}
	
	public double totalPrice() {
		return getPrice() + this.custonsFee;  
	}
	
	public Double getCustonsFee() {
		return custonsFee;
	}

	public void setCustonsFee(Double custonsFee) {
		this.custonsFee = custonsFee;
	}
	
	
}
