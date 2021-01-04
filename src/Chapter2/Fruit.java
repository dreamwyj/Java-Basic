package Chapter2;

public class Fruit {
	// 成员变量
	private boolean seedes;
	private boolean seasonal;
	private float price;
	//成员方法
	public void setPrioperties(boolean seed,boolean season,float cost)
	{
		seedes=seed;
		seasonal=season;
		price=cost;
		
	}
	public void printProperties() {
		System.out.print("seedes");
		if(seedes)
			System.out.println("Fruit is seedes.");
		else
			System.out.println("Fruit is seedless.");
		if(seasonal)
			System.out.println("Fruit is seasonal.");
		else
			System.out.println("Fruit is not seasonal.");
		
			System.out.println("Price is "+price);
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean myseed=true,myseason=true;
		float mycost=25.86F;
		Fruit MyFruit=new Fruit();
		MyFruit.setPrioperties(myseed,myseason,mycost);
		MyFruit.printProperties();
		
		
		

	}

}
