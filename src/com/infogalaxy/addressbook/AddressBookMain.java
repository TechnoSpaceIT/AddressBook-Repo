package com.infogalaxy.addressbook;

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
		
		AddressBook addressBook = new AddressBook();
		addressBook.addContact();
		addressBook.showContact();
	}

}
