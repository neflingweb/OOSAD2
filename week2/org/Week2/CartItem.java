package org.Week2;

public class CartItem {

	public CartItem() {
		// TODO - implement CartItem.CartItem
		throw new UnsupportedOperationException();
	}

	public int getItemID() {
		return this.itemID;
	}

	/**
	 * 
	 * @param itemID
	 */
	public void setItemID(int itemID) {
		this.itemID = itemID;
	}

	public float getPrice() {
		return this.price;
	}

	/**
	 * 
	 * @param price
	 */
	public void setPrice(float price) {
		this.price = price;
	}

	private int itemID;
	private float price;
	private int taxBand;

}