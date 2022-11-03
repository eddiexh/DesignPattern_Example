package AbstractFactory;

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
