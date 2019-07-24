package arraymap;

import java.util.HashMap;
import java.util.Map;

public class MapList {

	public static void main(String[] args) {

		Map<String, Integer> listOfPhone = new HashMap<String, Integer>();
		listOfPhone.put("Nepal", 98983);
		listOfPhone.put("Nikhil", 76588);
		listOfPhone.put("Rajendra", 87874);
		listOfPhone.put("Samir", 45657);
		listOfPhone.put("Sapin", 23344);
		listOfPhone.put("Uttar", 23234);

		for (int i = 0; i < listOfPhone.size(); i++) {
		System.out.println(listOfPhone);
		System.out.println(listOfPhone.equals(listOfPhone));
		System.out.println(listOfPhone.toString().toUpperCase());
		System.out.println(listOfPhone.toString().toLowerCase());
		System.out.println(listOfPhone.hashCode());
		System.out.println();listOfPhone.clear();
		}

	}

}
