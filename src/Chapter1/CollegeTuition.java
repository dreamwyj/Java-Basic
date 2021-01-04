package Chapter1;

public class CollegeTuition {
	static final double GROWTHRATE=1.05;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double tution=400,total=400;
		for(int year=1;year<10;year++)
		{
			tution*=GROWTHRATE;
			
			if(year<4)
			{
				total+=tution;
			}
		}
		System.out.println("The tution is "+tution+"\nThe total is "+total+" from this year to four years later.");

	}

}
