package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookSystem
{
    ArrayList<Contact> contactList = new ArrayList<Contact>();
    //Created an array of size 100 to store contacts
    //Contact[] contactList = new Contact[10];
    static int index=0;
    Scanner input = new Scanner(System.in);

    String firstName1,lastName1, address1, city1, state1, zip1, phoneNo1, email1;

    //add contact to addressbook

    public void addToAddressBook() {
        System.out.println("Enter first name, last name, address, city, state, zip, phone number, email ID sequentially");
        firstName1 = input.nextLine();
        lastName1 = input.nextLine();
        address1 = input.nextLine();
        city1 = input.nextLine();
        state1 = input.nextLine();
        zip1 = input.nextLine();
        phoneNo1 = input.nextLine();
        email1 = input.nextLine();

        Contact personContact =  new Contact(firstName1, lastName1, address1, city1, state1, zip1, phoneNo1, email1);

        contactList.add(personContact);
        index++;
    }

    // Edit person name for the given name

    public void editPersonName() {
        int check=0;
        System.out.println("\nEnter current name of person to edit name");
        String currentName = input.nextLine();
        System.out.println("Enter name to update");
        String nameToUpdate = input.nextLine();

        for(int i=0; i < index; i++) {
            if(contactList.get(i).firstName.equals(currentName)) {
                contactList.get(i).firstName = nameToUpdate;
                check=1;
                System.out.println(check);
                return;
            }
        }

        if(check==0) {
            System.out.println("No record found with given name");
        }
    }

    //Display contact details

    public void displayAddressBook() {
        System.out.println("Displaying all contacts from address book");
        for(int i=0; i < index; i++) {
            contactList.get(i).displayContact();
        }
    }
}
