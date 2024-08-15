package com.ahasan.item.entity;

import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

@Document("wishlist")
public class WishListEntity {
	
	@Id
	private String _id;

	private String itemName;

	private String itemSize;
	
	private String userId;

	
	
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}



	public String get_id() {
		return _id;
	}

	public void set_id(String _id) {
		this._id = _id;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getItemSize() {
		return itemSize;
	}

	public void setItemSize(String itemSize) {
		this.itemSize = itemSize;
	}

	@Override
	public String toString() {
		return "WishListEntity [_id=" + _id + ", itemName=" + itemName + ", itemSize=" + itemSize + ", userId=" + userId
				+ "]";
	}

	

}
