package entities;

public class Product {
	private String name;
	private double price;
	private int  quantity;
	
	// cria��o de um contrutor - serve para ser executado no momento da inicia��o do objeto
	// Sobrecarga - � mais de um contrutor com o mesmo nome, mas com parametros diferentes
	
	//Construtores
	public Product() {
	}//mantem o contrutor padr�o
	
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}
	// m�todos getters e setters
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public int getQuantity(){
		return quantity;
	}
	
	// m�todos
	
	public double totalValueInStock() {
		return price * quantity;
	}
	
	public void  addProducts(int quantity) {
		this.quantity += quantity;
	}
	
	public void  removeProducts(int  quantity) {
		this.quantity -= quantity;
	}
	
	public String toString() {
		return name
		+ ", $ "
		+ String.format("%.2f", price)
		+ ", "
		+ quantity
		+ " units, Total: $ "
		+ String.format("%.2f", totalValueInStock());
	}
}
