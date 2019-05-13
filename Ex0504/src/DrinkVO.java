
public class DrinkVO {
	private int price;
	private String title;
	private int stock;

	public DrinkVO(int price, String title, int stock) {
		this.price = price;
		this.title = title;
		this.stock = stock;
	}

	public int getPrice() {
		return price;
	}

	public String getTitle() {
		return title;
	}

	public int getStock() {
		return stock;
	}

	public String getState() {
		return title + "(" + price + "원," + stock + "개)";
	}

	public void setStock(int stock) {
		this.stock = stock;
	}
	
	public String toString() {
		return title + "(" + price + "원," + stock + "개)";
	}

}
