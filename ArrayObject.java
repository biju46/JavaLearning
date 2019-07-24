package objectarray;

public class ArrayObject {

	public static void main(String[] args) {
		Object[] array = { 1, 2.3, "4.5", true, 4.543444f };
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		for (Object element : array) { // for loop 2nd method to run the method without any
			System.out.println(element);
		}
		String[] students = { "rajan", "uttar", "sapin", "samir", "biju", "nepal", "nikhil" };
		for (Object name : students) {
			System.out.println(name);
		}
	}
}
 
