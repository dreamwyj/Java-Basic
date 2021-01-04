package Chapter2;

public class HelloWorld {
	public native void displayHelloWorld();
	public HelloWorld() {
		System.loadLibrary("hello");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new HelloWorld().displayHelloWorld();

	}

}
