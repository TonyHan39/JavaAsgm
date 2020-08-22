
public class TransRecord {

	private String transId;
	private String foodName;
	private double perPrice;
	private int amount;
	private double totalPerItem;
	private String date;
	
	public TransRecord() {
		super();
	}

	



	public TransRecord(String transId, String foodName, double perPrice, int amount, double totalPerItem, String date) {
		super();
		this.transId = transId;
		this.foodName = foodName;
		this.perPrice = perPrice;
		this.amount = amount;
		this.totalPerItem = totalPerItem;
		this.date = date;
	}





	public String getTransId() {
		return transId;
	}

	public void setTransId(String transId) {
		this.transId = transId;
	}

	public String getFoodName() {
		return foodName;
	}

	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}

	public double getPerPrice() {
		return perPrice;
	}

	public void setPerPrice(double perPrice) {
		this.perPrice = perPrice;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public double getTotalPerItem() {
		return totalPerItem;
	}

	public void setTotalPerItem(double totalPerItem) {
		this.totalPerItem = totalPerItem;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	
}
