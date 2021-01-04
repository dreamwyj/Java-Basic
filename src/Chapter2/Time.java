package Chapter2;
import java.util.Calendar;
public class Time {

	private Calendar t;
	private int y,m,d,hh,mm,ss;
	Time(){
		t=Calendar.getInstance();
		//获取当前日期和时间
		y=t.get(t.YEAR);
		m=t.get(t.MONTH)+1;
		d=t.get(t.DATE);
		hh=t.get(t.HOUR_OF_DAY);
		mm=t.get(t.MINUTE);
		ss=t.get(t.SECOND);
	}
	public String getDate() {
		return y+"年"+m+"月"+d+"日";
	}
	public String getTime() {
		String s=hh+"时"+mm+"分"+ss+"秒";
		return s;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Time time=new Time();
		System.out.println("当前日期："+time.getDate());
		System.out.println("当前时间："+time.getTime());
		

	}

}
