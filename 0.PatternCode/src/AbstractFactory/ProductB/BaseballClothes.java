package AbstractFactory.ProductB;

import AbstractFactory.Clothes;

public class BaseballClothes implements Clothes {

	@Override
	public void wear() {
		System.out.println("Wear Baseball Clothes~~~");
	}

}
