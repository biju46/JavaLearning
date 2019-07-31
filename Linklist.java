package linklistdemo;

import java.util.LinkedList;

public class LinkListMethod {

	public static void main(String[] args) {

		LinkedList myList = new LinkedList();
		myList.add("javaclass");
		myList.add(122121);
		myList.add(true);
		myList.add(948989898L);
		myList.add(5.5);
		myList.add(3.87887f);

		System.out.println(myList);

		int sizeNum = myList.size();
		System.out.println(sizeNum);
		
		System.out.println(myList.size());

	}

}
