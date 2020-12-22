package com.ctorres.domain;

public class Category {

	 private int categoryId;
	    private String category;
	    private boolean active;
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
		 * @return the category
		 */
		public String getCategory() {
			return category;
		}
		/**
		 * @param category the category to set
		 */
		public void setCategory(String category) {
			this.category = category;
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
