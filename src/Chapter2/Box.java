package Chapter2;

public class Box {
	private int width;
	private int length;
	private int height;
	Box(int width,int length,int height)
	{
		this.width=width;
		this.length=length;
		this.height=height;
		
	}
	void showBox() {
		System.out.println("width="+width+" length="+length+" height="+height);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box box=new Box(7,8,9);
		box.showBox();
		

	}

}
