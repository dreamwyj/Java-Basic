package Test;
import Chapter2.Fruit;
/*
 * 学会调用包
 */
public class Fruit1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean myseed=true,myseason=false;
		float mycost=15F;
		Fruit MyFruit=new Fruit();
		MyFruit.setPrioperties(myseed,myseason,mycost);
		MyFruit.printProperties();
		

	}

}
