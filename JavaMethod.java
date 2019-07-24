package JavaPackage;

public class JavaMethod {

	int accnum;
	String usname;
	double bala;

	JavaMethod(int accountnum, String username, double balance) {

		this.accnum = accountnum;
		this.usname = username;
		this.bala = balance;

	}

	void printInfo() {
		System.out.println("Account number " + accnum + " name" + usname + "$" + bala);

	}

	public static void main(String[] args) {

		JavaMethod biju = new JavaMethod(1045, " biju ", 108.90);
		JavaMethod rajendra = new JavaMethod(2222, " rajendra ", 455.98);
		JavaMethod samir = new JavaMethod(3423, " samir ", 543.88);

		samir.printInfo();
		biju.printInfo();
		rajendra.printInfo();

	}

}
