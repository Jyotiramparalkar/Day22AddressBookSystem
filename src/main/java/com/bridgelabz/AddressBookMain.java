package com.bridgelabz;

import java.util.Scanner;
// adding UC-6 refactor contact in address book System
public class AddressBookMain
{


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        AddressBookSystem addressBook1 = new AddressBookSystem();
        int choice =1;

        while (choice!=0){
            switch (choice){
                case 0:
                    return;
                case 1:
                    addressBook1.addToAddressBook();
                    break;
                case 2:
                    addressBook1.editPersonName();
                    break;
                case 3:
                    addressBook1.displayAddressBook();
                    break;
                case 4 :
                    addressBook1.deleteContact();
                    break;
            }

            System.out.println("Press 0 to exit \nPress 1 to add more contact \nPress 2 to edit contact \nPress 3 to display \n 4 to delete ");
            choice = input.nextInt();
        }

        input.close();
    }
}
