package AbstractFactory;

public class BaseballVender extends AbstractSportVender {

	@Override
	public Clothes createClothes() {
		return new BaseballClothes();
	}

	@Override
	public Shose createShose() {
		return new BaseballShose();
	}

	@Override
	public Ball createBall() {
		return new Baseball();
	}

}
