package Chapter2;
import mypackage.*;

import mypackage.entity.*;
/*
 * 1.当两个程序位于同一个包中，可以直接相互引用对方的类
 * 2.如果引用的是对方的非公共类，则需要先创建该公共类的实例对象，
 * 再通过实例对象进行创建那个非公共类的对象，然后进行引用。
 * 例如 在mypakage中，TextBook.java要用Book.java中的非公共类的方法就
 * 3.import语句只能导入外部包中的public类
 * 
 */

public class ImportSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book=new Book();
		book.show();
		//Story story=new Story();
		//story.show();
		TextBook textbook=new TextBook();
		textbook.show();
		Reader reader=new Reader();
		reader.show();

	}

}
