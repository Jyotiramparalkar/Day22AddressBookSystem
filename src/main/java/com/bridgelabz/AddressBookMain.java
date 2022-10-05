package com.bridgelabz;

import java.util.Scanner;

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
            }

            System.out.println("Press 0 to exit \nPress 1 to add more contact \nPress 2 to edit contact \nPress 3 to display");
            choice = input.nextInt();
        }

        input.close();
    }
}
