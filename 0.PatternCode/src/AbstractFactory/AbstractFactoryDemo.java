package AbstractFactory;

import AbstractFactory.ConcreteFactory.BaseballVender;
import AbstractFactory.ConcreteFactory.SoccerVender;

public class AbstractFactoryDemo { /* 代替Client的角色 */

	public static void main(String[] args) {
		AbstractSportVender asv = new SoccerVender(); /* New出Soccer的工廠，並製造出足球相關產品 */
		Ball ball = asv.createBall();
		ball.play();
		Clothes clothes = asv.createClothes();
		clothes.wear();
		Shose shose = asv.createShose();
		shose.go();
		System.out.println("============================");
		asv = new BaseballVender(); /* New出Baseball的工廠，並製造出棒球相關產品 通常會使用另一個工廠(Class)負責*/
		ball = asv.createBall();
		ball.play();
		clothes = asv.createClothes();
		clothes.wear();
		shose = asv.createShose();
		shose.go();
	}

}

/** 參與者
 * AbstractFactory -- AbstractSportVender
 * ConcreteFactory -- BaseballVender, SoccerVender
 * AbstractProduct -- Ball, Clothes, Shose
 * ConcreteProduct -- Baseball, Soccer, BaseballClothes, SoccerClothes, BaseballShose, SoccerShose
 * */
/**AbstractFactory 重點
 * 會有五參與者(AbstractFactory, ConcreteFactory, AbstractProduct, ConcreteProduct, Client)。
 * AbstractFactory Pattern中的Factory可以產生一系列產品(如：足球、足球鞋、足球衣)。
 * 假設是一個運動產品的工廠，那就會有一個[運動產品的AbstractFactory]父類，然後由各個[ConcreteFactory]去繼承
 * 並規劃實際賣甚麼運動商品(如：足球類Factory、棒球類Factory)。
 * 因要create一系列產品，那AbstractFactory(父類)會先定義abstract方法(public abstract *** create***();)讓子
 * 類繼承後去實作。
 * 而繼承AbstractFactory的ConcreteFactory，則依據他是甚麼樣產品的Factory去實作方法(如足球工廠則，public Soccer createSoccer(){...})
 * */