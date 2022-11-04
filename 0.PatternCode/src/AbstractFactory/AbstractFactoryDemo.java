package AbstractFactory;

import AbstractFactory.ConcreteFactory.BaseballVender;
import AbstractFactory.ConcreteFactory.SoccerVender;

public class AbstractFactoryDemo { /* �N��Client������ */

	public static void main(String[] args) {
		AbstractSportVender asv = new SoccerVender(); /* New�XSoccer���u�t�A�ûs�y�X���y�������~ */
		Ball ball = asv.createBall();
		ball.play();
		Clothes clothes = asv.createClothes();
		clothes.wear();
		Shose shose = asv.createShose();
		shose.go();
		System.out.println("============================");
		asv = new BaseballVender(); /* New�XBaseball���u�t�A�ûs�y�X�βy�������~ �q�`�|�ϥΥt�@�Ӥu�t(Class)�t�d*/
		ball = asv.createBall();
		ball.play();
		clothes = asv.createClothes();
		clothes.wear();
		shose = asv.createShose();
		shose.go();
	}

}

/** �ѻP��
 * AbstractFactory -- AbstractSportVender
 * ConcreteFactory -- BaseballVender, SoccerVender
 * AbstractProduct -- Ball, Clothes, Shose
 * ConcreteProduct -- Baseball, Soccer, BaseballClothes, SoccerClothes, BaseballShose, SoccerShose
 * */
/**AbstractFactory ���I
 * �|�����ѻP��(AbstractFactory, ConcreteFactory, AbstractProduct, ConcreteProduct, Client)�C
 * AbstractFactory Pattern����Factory�i�H���ͤ@�t�C���~(�p�G���y�B���y�c�B���y��)�C
 * ���]�O�@�ӹB�ʲ��~���u�t�A���N�|���@��[�B�ʲ��~��AbstractFactory]�����A�M��ѦU��[ConcreteFactory]�h�~��
 * �óW����ڽ�ƻ�B�ʰӫ~(�p�G���y��Factory�B�βy��Factory)�C
 * �]�ncreate�@�t�C���~�A��AbstractFactory(����)�|���w�qabstract��k(public abstract *** create***();)���l
 * ���~�ӫ�h��@�C
 * ���~��AbstractFactory��ConcreteFactory�A�h�̾ڥL�O�ƻ�˲��~��Factory�h��@��k(�p���y�u�t�h�Apublic Soccer createSoccer(){...})
 * */