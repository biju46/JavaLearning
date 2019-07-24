package objectarray;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {

	public static void main(String[] args) {
		Map<Integer, String> myPhoneBook = new HashMap<Integer, String>();
		// ctrl+shift+O shortcut for package import
		myPhoneBook.put(23237, "uttar");
		myPhoneBook.put(9998, "rajan");
		myPhoneBook.put(67676, "biju");
		myPhoneBook.put(90909, "sapin");
		myPhoneBook.put(43433, "ankit");
		System.out.println(myPhoneBook);
		System.out.println(myPhoneBook.size());
		System.out.println(myPhoneBook.isEmpty());
		System.out.println(myPhoneBook.entrySet());
		System.out.println(myPhoneBook.containsValue("biju"));
		System.out.println(myPhoneBook.containsKey(4));

	}
}
