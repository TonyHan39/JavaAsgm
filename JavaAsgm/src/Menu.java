
public class Menu {

	private String foodID;
    private String foodName;
    private double price;
    private String category;
    
    public Menu(){
        
    }
    
    public Menu(String foodID, String foodName, double price, String category){
        super();
	this.foodID = foodID;
	this.foodName = foodName;
	this.price = price;
	this.category = category;
    }

    public String getFoodID() {
        return foodID;
    }

    public void setFoodID(String foodID) {
        this.foodID = foodID;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
    
}
