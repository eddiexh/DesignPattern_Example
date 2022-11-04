package AbstractFactory.ProductA;

import AbstractFactory.Ball;

public class Baseball implements Ball {

	@Override
	public void play() {
		System.out.println("Play Baseball!!");
	}

}
