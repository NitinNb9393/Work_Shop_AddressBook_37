package com.bridgelabz.Work_Shop_AddressBook_37;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
    static Scanner scanner = new Scanner(System.in);
    ArrayList<Contact> contactlist = new ArrayList<>();

    public void addNewContact() {
        Contact contact = new Contact();

        System.out.println("Enter First name:");
        contact.setFirstname(scanner.next());

        System.out.println("Enter Last Name:");
        contact.setLastname(scanner.next());

        System.out.println("Enter Address:");
        contact.setAddress(scanner.next());

        System.out.println("Enter City:");
        contact.setCity(scanner.next());

        System.out.println("Enter State:");
        contact.setState(scanner.next());

        System.out.println("Enter Zip:");
        contact.setZipcode(scanner.nextInt());

        System.out.println("Enter Phone:");
        contact.setPhonenumber(scanner.next());

        System.out.println("Enter Email:");
        contact.setEmailid(scanner.next());

        contactlist.add(contact);
        System.out.println("Contact Added Successfully");
    }

    public void editContact() {
        String enteredFirstName;
        System.out.println("Enter First name of contact to edit it ");
        enteredFirstName = scanner.next();
        for (int i = 0; i < contactlist.size(); i++) {
            if (contactlist.get(i).getFirstname().equals(enteredFirstName)) {
                System.out.println("Enter the field to edit:\n1.First Name\n2.Last Name\n3.Address\n4.city\n5.State\n6.Zip\n7.Phone\n8.Email");
                int userInput = scanner.nextInt();
                switch (userInput) {
                    case 1:
                        System.out.println("Enter new first name");
                        contactlist.get(i).setFirstname(scanner.next());
                        break;
                    case 2:
                        System.out.println("Enter new last name");
                        contactlist.get(i).setLastname(scanner.next());
                        break;
                    case 3:
                        System.out.println("Enter new Address");
                        contactlist.get(i).setAddress(scanner.next());
                        break;
                    case 4:
                        System.out.println("Enter new city");
                        contactlist.get(i).setCity(scanner.next());
                        break;
                    case 5:
                        System.out.println("Enter new state");
                        contactlist.get(i).setState(scanner.next());
                        break;
                    case 6:
                        System.out.println("Enter new zip");
                        contactlist.get(i).setZipcode(scanner.nextInt());
                        break;
                    case 7:
                        System.out.println("Enter new phone number");
                        contactlist.get(i).setPhonenumber(scanner.next());
                        break;
                    case 8:
                        System.out.println("Enter new email");
                        contactlist.get(i).setEmailid(scanner.next());
                        break;
                    default:
                        System.out.println("Invalid Entry");

                }
            }
        }
        System.out.println("Contact Edited Successfully");
    }

    public void deleteContact(String name) {
        for (int i = 0; i < contactlist.size(); i++) {
            if (contactlist.get(i).getFirstname().equals(name)) {
                Contact contact = contactlist.get(i);
                contactlist.remove(contact);
            }
        }
        System.out.println("Contact Deleted Successfully");
    }

    public void displayList() {
        for (Contact iterator : contactlist) System.out.println(iterator);
    }

}