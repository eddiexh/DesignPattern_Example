package AbstractFactory.ConcreteFactory;

import AbstractFactory.*;
import AbstractFactory.ProductA.Soccer;
import AbstractFactory.ProductB.SoccerClothes;
import AbstractFactory.ProductC.SoccerShose;

public class SoccerVender extends AbstractSportVender {

	@Override
	public Clothes createClothes() {
		return new SoccerClothes();
	}

	@Override
	public Shose createShose() {
		return new SoccerShose();
	}

	@Override
	public Ball createBall() {
		return new Soccer();
	}

}
