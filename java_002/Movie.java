package aa;

public class Movie {
	
	private String name;
	private int price;
	private double discountRate;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public double getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}

	public Movie() {
		
	}
	
	public void inform() {
		System.out.println("영화제목 : " + name + "가격 : " + price + "할인율 : " + discountRate);
	}
	
}
