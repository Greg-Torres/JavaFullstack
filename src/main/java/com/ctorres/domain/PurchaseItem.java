package com.ctorres.domain;

public class PurchaseItem {

	    private int productId;
	    private int quantity;
	    private double total;
	    private boolean active;
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
		 * @return the quantity
		 */
		public int getQuantity() {
			return quantity;
		}
		/**
		 * @param quantity the quantity to set
		 */
		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}
		/**
		 * @return the total
		 */
		public double getTotal() {
			return total;
		}
		/**
		 * @param total the total to set
		 */
		public void setTotal(double total) {
			this.total = total;
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

}
