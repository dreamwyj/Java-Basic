package Chapter1;
import java.util.Scanner;
/*
 * 游戏生命力购买问题
 * 1.输入金币数量
 * 2.枚举法(鸡兔同笼问题)
 * 3.满足两个条件，生命力最大，一定限额的金币
 * 4.fg,gs的个数不会超过单一的最大值
 * 5.常量命名方式 
 */
public class Game {
	static final int FGVALUE=20;
	static final int GSVALUE=16;
	static final int FGLIFE=30;
	static final int GSLIFE=20;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int goldcoin=100;
		int fg_num=0,gs_num=0;
		int max_life=0;
		System.out.println("Please input your goldcoin: ");
		Scanner in =new Scanner(System.in);
		goldcoin=in.nextInt();
		for(int fg_loop=0;fg_loop<=(goldcoin/FGVALUE);fg_loop++) 
		{
			for(int gs_loop=0;gs_loop<=(goldcoin/GSVALUE);gs_loop++)
			{
				int gold=fg_loop*FGVALUE+gs_loop*GSVALUE;
				int life=fg_loop*FGLIFE+gs_loop*GSLIFE;
				if(max_life<life&&gold<goldcoin)
					{max_life=life;
					fg_num=fg_loop;
					gs_num=gs_loop;
					}
			}

		}
		System.out.println("max_life ="+max_life+" fg_num = "+fg_num+" gs_num="+gs_num);

	}
}
