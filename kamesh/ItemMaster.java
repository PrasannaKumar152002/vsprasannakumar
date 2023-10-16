package Database;

import java.io.Serializable;

public class ItemMaster implements Serializable{
	private int ItemId;
	private String ItemName;
	private long quantity;
	private float Price;
	private int value;
	private String category;
	
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getItemId() {
		return ItemId;
	}
	public void setItemId(int itemId) {
		ItemId = itemId;
	}
	public String getItemName() {
		return ItemName;
	}
	public void setItemName(String itemName) {
		ItemName = itemName;
	}
	public long getQuantity() {
		return quantity;
	}
	public void setQuantity(long quantity) {
		this.quantity = quantity;
	}
	public float getPrice() {
		return Price;
	}
	public void setPrice(float price) {
		Price = price;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ItemId;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ItemMaster other = (ItemMaster) obj;
		if (ItemId != other.ItemId)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "ItemMaster [getItemId()=" + getItemId() + ", getItemName()=" + getItemName() + ", getQuantity()="
				+ getQuantity() + ", getPrice()=" + getPrice() + ", getValue()=" + getValue() + ", hashCode()="
				+ hashCode() + "]";
	}
	
}
