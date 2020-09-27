package fin;

import java.util.*;

public class uc4 {

	public static void main(String[] args) {
		// Instantiate AddressBook object
		AddressBook blackbook = new AddressBook();

		Scanner stdin = new Scanner(System.in);
		System.out.println("What is the name of the contact you want to delete?");
		String name = stdin.next();
		blackbook.deleteContact(name);
	}
}


//how to call number for that name