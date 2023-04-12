package com.infogalaxy.addressbook;

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
		
		AddressBook addressBook = new AddressBook();
		
		do
		{
			System.out.println("***ADDRESSBOOK MENU***");
			System.out.println("1. ADD CONTACT \n2. SHOW CONTACT \n3. UPDATE CONTACT \n4. DELETE CONTACT");
			System.out.println("Enter the CHOICE:");
			choice = sc.nextInt();
			switch(choice) {
			case 1:
				addressBook.addContact();
				break;
			case 2:
				addressBook.showContact();
				break;
			case 3:
				addressBook.updateContact();
				break;
			case 4:
				break;
			default:
				System.out.println("Invalid Choice");
					break;
			}
		}while(choice<5);
	}

}
