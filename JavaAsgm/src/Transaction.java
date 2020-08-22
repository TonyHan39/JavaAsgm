
public class Transaction {
	
	private String transId;
	private double recieve;
	private double total;
	private double change;
	private String date;
	
	public Transaction() {
		super();
	}

	public Transaction(String transId, double recieve, double total, double change, String date) {
		super();
		this.transId = transId;
		this.recieve = recieve;
		this.total = total;
		this.change = change;
		this.date = date;
	}

	public String getTransId() {
		return transId;
	}

	public void setTransId(String transId) {
		this.transId = transId;
	}

	public double getRecieve() {
		return recieve;
	}

	public void setRecieve(double recieve) {
		this.recieve = recieve;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public double getChange() {
		return change;
	}

	public void setChange(double change) {
		this.change = change;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	
	
}
