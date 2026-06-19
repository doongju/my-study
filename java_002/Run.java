package bb;

import aa.Movie;

public class Run {

	public static void main(String[] args) {
		Movie mo1 = new Movie();
		Movie mo2 = new Movie();
		
		mo1.setDiscountRate(0.15);
		mo1.setName("어벤져스");
		mo1.setPrice(15000);
		
		mo2.setDiscountRate(0.25);
		mo2.setName("스파이더맨");
		mo2.setPrice(20000);
		
		mo1.inform();
		mo2.inform();
	}

}
