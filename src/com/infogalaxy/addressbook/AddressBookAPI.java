package com.infogalaxy.addressbook;

import java.util.Scanner;

public class AddressBookAPI {

	Scanner sc = new Scanner(System.in);
	int choice;
	
	public void contactOperation(AddressBook myAddressBook) {
		do
		{
			System.out.println("***CONTACT MENU***");
			System.out.println("1. ADD CONTACT \n2. SHOW CONTACT \n3. UPDATE CONTACT \n4. DELETE CONTACT");
			System.out.println("Enter the CHOICE:");
			choice = sc.nextInt();
			switch(choice) {
			case 1:
				myAddressBook.addContact();
				break;
			case 2:
				myAddressBook.showContact();
				break;
			case 3:
				//updateContact();
				break;
			case 4:
				//deleteContact();
				break;
			default:
				System.out.println("Invalid Choice");
					break;
			}
		}while(choice<5);
	}
	
}
