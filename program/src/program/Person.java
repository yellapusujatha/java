import.java.util

public class Person {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter id");
		int id=scan nextint();
		System.out.println("Enter name");
		scan.nextLine();
		String name=scan.nextLine();
		System.out.println("Enter gender");
		String gender=scan.next();
		System.out.println("Enter email");
		String email=scan.next();
		System.out.println("Enter phone number");
		long phone=scan.nextLong();
	    Person p=new Person(id,name,gender,email,phone);
		System.out.println(p.id+""+phone.name+""+p.email+""+p.phone);
	}
}

}
