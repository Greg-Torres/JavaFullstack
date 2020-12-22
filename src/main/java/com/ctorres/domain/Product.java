package com.ctorres.domain;

public class Product {
	
	 private int productId;
	    private String name;
	    private int categoryId;
	    private double price;
	    private int stock;
	    private boolean active;
	    private Category category;
		/**
		 * @return the productId
		 */
		public int getProductId() {
			return productId;
		}
		/**
		 * @param productId the productId to set
		 */
		public void setProductId(int productId) {
			this.productId = productId;
		}
		/**
		 * @return the name
		 */
		public String getName() {
			return name;
		}
		/**
		 * @param name the name to set
		 */
		public void setName(String name) {
			this.name = name;
		}
		/**
		 * @return the categoryId
		 */
		public int getCategoryId() {
			return categoryId;
		}
		/**
		 * @param categoryId the categoryId to set
		 */
		public void setCategoryId(int categoryId) {
			this.categoryId = categoryId;
		}
		/**
		 * @return the price
		 */
		public double getPrice() {
			return price;
		}
		/**
		 * @param price the price to set
		 */
		public void setPrice(double price) {
			this.price = price;
		}
		/**
		 * @return the stock
		 */
		public int getStock() {
			return stock;
		}
		/**
		 * @param stock the stock to set
		 */
		public void setStock(int stock) {
			this.stock = stock;
		}
		/**
		 * @return the active
		 */
		public boolean isActive() {
			return active;
		}
		/**
		 * @param active the active to set
		 */
		public void setActive(boolean active) {
			this.active = active;
		}
		/**
		 * @return the category
		 */
		public Category getCategory() {
			return category;
		}
		/**
		 * @param category the category to set
		 */
		public void setCategory(Category category) {
			this.category = category;
		}

}
