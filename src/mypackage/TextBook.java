package mypackage;

import mypackage.Book.Story;
/*
 * 引用Book.java的非公共类Story中的方法show()
 */
public class TextBook {
	public void show()
	{
		Book book=new Book();
		Story story=book.new Story();
		story.show();
		System.out.println("TextBook类所在的文件是TextBook.java,包是mypackage!");
		
		
	}

}
