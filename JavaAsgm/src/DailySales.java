
public class DailySales {

	private String foodItem;
	private int amount;
	private double perPrice;
	private double price;
	
	public DailySales() {
		super();
	}

	public DailySales(String foodItem, int amount, double perPrice, double price) {
		super();
		this.foodItem = foodItem;
		this.amount = amount;
		this.perPrice = perPrice;
		this.price = price;
	}

	public String getFoodItem() {
		return foodItem;
	}

	public void setFoodItem(String foodItem) {
		this.foodItem = foodItem;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public double getPerPrice() {
		return perPrice;
	}

	public void setPerPrice(double perPrice) {
		this.perPrice = perPrice;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
