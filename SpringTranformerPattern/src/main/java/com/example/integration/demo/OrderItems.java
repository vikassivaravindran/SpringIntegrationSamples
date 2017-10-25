package com.example.integration.demo;

import java.lang.reflect.Constructor;



/**
 * Entity Class for OrderItems.
 * 
 *
 */
public class OrderItems {

	/**
	 * Default {@link Constructor} for creating instances of OrderItems.
	 */
	public OrderItems() {
		// default constructor to create new instances of this class
	}


	private Long orderID;

	private String productName;

	private String locationName;


	private Long quantity;


	public OrderItems(Long orderID, String productName, String locationName, Long quantity) {
		super();
		this.orderID = orderID;
		this.productName = productName;
		this.locationName = locationName;
		this.quantity = quantity;
	}


	@Override
	public String toString() {
		return "OrderItems [orderID=" + orderID + ", productName=" + productName + ", locationName=" + locationName
				+ ", quantity=" + quantity + "]";
	}


	public Long getOrderID() {
		return orderID;
	}


	public void setOrderID(Long orderID) {
		this.orderID = orderID;
	}


	public String getProductName() {
		return productName;
	}


	public void setProductName(String productName) {
		this.productName = productName;
	}


	public String getLocationName() {
		return locationName;
	}


	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}


	public Long getQuantity() {
		return quantity;
	}


	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}
	

}