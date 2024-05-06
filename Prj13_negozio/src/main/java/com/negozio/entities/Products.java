package com.negozio.entities;

import java.util.Arrays;

public class Products{
	
	private int id;
	private String title;
	private String description;
	private double price;
	private double discountPercentage;
	private double rating;
	private int stock;
	private String brand;
	private String category;
	private String thumbnail;
	private String images[];
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public double getDiscountPercentage() {
		return discountPercentage;
	}
	public void setDiscountPercentage(double discountPercentage) {
		this.discountPercentage = discountPercentage;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getThumbnail() {
		return thumbnail;
	}
	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}
	public String[] getImages() {
		return images;
	}
	public void setImages(String[] images) {
		this.images = images;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Prodotto [id=");
		builder.append(id);
		builder.append(", title=");
		builder.append(title);
		builder.append(", description=");
		builder.append(description);
		builder.append(", price=");
		builder.append(price);
		builder.append(", discountPercentage=");
		builder.append(discountPercentage);
		builder.append(", rating=");
		builder.append(rating);
		builder.append(", stock=");
		builder.append(stock);
		builder.append(", brand=");
		builder.append(brand);
		builder.append(", category=");
		builder.append(category);
		builder.append(", thumbnail=");
		builder.append(thumbnail);
		builder.append(", images=");
		builder.append(Arrays.toString(images));
		builder.append("]");
		return builder.toString();
	}
	
	
}	
	
	
	
