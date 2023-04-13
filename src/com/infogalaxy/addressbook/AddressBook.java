package com.infogalaxy.addressbook;

import java.util.Scanner;
/**
 * 
 * @author DELL
 * Address Book class for Handling All Contact Management Task
 */
public class AddressBook {

	Contacts contacts = new Contacts();
	
	Scanner sc = new Scanner(System.in);
		
	public void addContact() {
		System.out.println("Enter the First Name:");
		contacts.setFirstName(sc.next());
		System.out.println("Enter the Last Name:");
		contacts.setLastName(sc.next());
		System.out.println("Enter the Address:");
		contacts.setAddress(sc.next());
		System.out.println("Enter the City:");
		contacts.setCity(sc.next());
		System.out.println("Enter the State:");
		contacts.setState(sc.next());
		System.out.println("Enter the Zipcode:");
		contacts.setZip(sc.next());
		System.out.println("Enter the Phone Number:");
		contacts.setPhoneNumber(sc.next());
		System.out.println("Enter the EMail ID:");
		contacts.setEmail(sc.next());
	}
	public void showContact() {
		if( contacts == null) {
			System.out.println("Contact Object is Not Available");
		} else {
			System.out.println("First Name:"+contacts.getFirstName());
			System.out.println("Last Name:"+contacts.getLastName());
			System.out.println("Address:"+contacts.getAddress());
			System.out.println("City:"+contacts.getCity());
			System.out.println("State:"+contacts.getState());
			System.out.println("Zipcode:"+contacts.getZip());
			System.out.println("Phone Number:"+contacts.getPhoneNumber());
			System.out.println("EMail ID:"+contacts.getEmail());
		}
	}
	public void updateContact() {
		if( contacts == null ) {
			System.out.println("Contact Object is Not Available");
		} else {
			System.out.println("Enter the First Name to Update Contact:");
			String fname = sc.next();
			if(fname.equals(contacts.getFirstName())) {
				System.out.println("Contact available");
				System.out.println("Enter the Last Name:");
				contacts.setLastName(sc.next());
				System.out.println("Enter the Address:");
				contacts.setAddress(sc.next());
				System.out.println("Enter the City:");
				contacts.setCity(sc.next());
				System.out.println("Enter the State:");
				contacts.setState(sc.next());
				System.out.println("Enter the Zipcode:");
				contacts.setZip(sc.next());
				System.out.println("Enter the Phone Number:");
				contacts.setPhoneNumber(sc.next());
				System.out.println("Enter the EMail ID:");
				contacts.setEmail(sc.next());
				
			} else {
				System.out.println("Contact is Not Available");
			}
		}
	}
	public void deleteContact() {
		System.out.println("Enter the First Name to Delete the Contact:");
		String fname = sc.next();
		if(fname.equals(contacts.getFirstName())) {
			System.out.println("Contact is Available");
			contacts = null;
			System.out.println("Contact is Deleted.");
		} else {
			System.out.println("Contact is Not Available");
		}
	}
}
