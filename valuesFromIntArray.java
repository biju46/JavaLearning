package objectarray;

public class valuesFromIntArray {

	public static void main(String[] args) {

		int[] studentid = { 12, 13, 14, 15, 56, 76 };
		for (int i = 0; i < studentid.length; i++) {
			System.out.println(studentid[i]);
		}
		for (Object id : studentid) {// we can use int as well
			System.out.println(id);
		}

		for (int i : studentid) {
			System.out.println(i);
		}
	}

}
