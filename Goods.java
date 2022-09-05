package homework1;

import java.util.Arrays;

public class Goods {
	private String description;
	private double price;
	private double weight;
	private int amount;

	
	
	public Goods(String description, double price,double weight, int amount) {
		super();
		this.description = description;
		this.price = price;
		this.weight = weight;
		this.amount = amount;

	}


	public Goods() {
		super();
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


	public void setPrice(double price) {
		this.price = price;
	}

	
	public double getWeight() {
		return weight;
	}


	public void setWeight(double weight) {
		this.weight = weight;
	}


	public int getAmount() {
		return amount;
	}


	public void setAmount(int amount) {
		this.amount = amount;
	}


	public String fullInfo(String description, double price, double weight, int amount) {
		String[] temp = new String[4];
		temp[0] = "Item: " + description;
		temp[1] = "Price: " + price + "$";
		temp[2] = "Weight: " + weight + "kg";
		temp[3] = "No. of items: " + amount;
		String result = Arrays.toString(temp);
		return result;
		
	}
	
	public String nameAndPrice (String description, double price) {
		String [] temp = new String[2];
		temp[0] = "Item: " + description;
		temp[1] = "Price: " + price;
		String result = Arrays.toString(temp);
		return result;
	}


	@Override
	public String toString() {
		return "Goods [description=" + description + ", price=" + price + ", weight=" + weight + ", amount=" + amount
				+ "]";
	}
	
}
