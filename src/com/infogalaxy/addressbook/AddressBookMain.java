package com.infogalaxy.addressbook;

import java.awt.Choice;
import java.util.HashMap;
import java.util.Scanner;

/***
 * 
 * @author DELL
 * AddressBookMain Class is used for performing different 
 * Operations on AddressBook
 */
public class AddressBookMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**
		 * Welcome message for user
		 */
		System.out.println("Welcome to AddressBook Program");
		
		Scanner sc = new Scanner(System.in);
		int choice;
		HashMap<String,AddressBook> addressBookMap = new HashMap<String,AddressBook>();
		do
		{
			System.out.println("******* ADDRESSBOOK MENU **********");
			System.out.println("1.CREATE NEW ADDRESSBOOK \n2. SHOW ADDRESSBOOKS \n3. SELECT ADDRESSBOOK "
					+ "\n4. UPDATE ADDRESSBOOK \n5. DELETE ADDRESSBOOK");
			System.out.println("Enter the Choice:");
			choice = sc.nextInt();
			
			switch(choice) {
			case 1:
					System.out.println("Enter the Address Book Name:");
					String addressBookName = sc.next();					//addressBookName = "Home";
					AddressBook addressBook = new AddressBook();
					addressBookMap.put(addressBookName, addressBook);
				break;
			case 2:
					System.out.println(addressBookMap.keySet());
				break;
			case 3:
					System.out.println("Enter the AddressBook Name in which you want to add contact:");
					String addressBookName2 = sc.next();
					AddressBook myAddressBook = addressBookMap.get(addressBookName2);
					AddressBookAPI addressBookAPI = new AddressBookAPI();
					addressBookAPI.contactOperation(myAddressBook);
				break;
			case 4:
				break;
			case 5:
				break;
			}
		}while(choice<5);
	}

}
