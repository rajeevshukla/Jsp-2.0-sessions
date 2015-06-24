package com.demo.login;

public class ProductDetails {

	private int productId;
	private String productName;
	private int quantity;
	private double price;
	
	public ProductDetails(int id,String name,int quantity,double price) {
 
		 this.productId=id;
		 this.productName=name;
		 this.quantity=quantity;
		 this.price=price;
	
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	
	@Override
	public String toString() {
		return "ProductDetails [productId=" + productId + ", productName="
				+ productName + ", quantity=" + quantity + ", price=" + price
				+ "]";
	}

}
