package Chapter1;
/*
 * 晴天卖花20 雨天卖花12 共卖花112 平均每天卖出14f
 */
public class GirlFlower {
	static final int FINE=20;
	static final int RAIN=12;
	static final int FLOWER=112;
	static final int AVERAGE=14;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fine_days=0,rain_days=0;
		for(int fine_loop=0;fine_loop<=FLOWER/FINE;fine_loop++)
			for(int rain_loop=0;rain_loop<=FLOWER/RAIN;rain_loop++)
			{
				int flower=fine_loop*FINE+rain_loop*RAIN;
				if(flower==FLOWER)
				{
					fine_days=fine_loop;
					rain_days=rain_loop;
					int days=fine_days+rain_days;
					if(FLOWER/days==AVERAGE)
						System.out.println("fine_days= "+fine_days+" rain_days= "+rain_days);
				
				}
			}

	}

}
