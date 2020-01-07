/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author liamc
 */
import linearstructure.*;
import dataobjects.*;
import java.util.Scanner;
import non_linearstructures.BinSearchTree;

public class MainProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int choice;

        System.out.println("CIS1000 Assignment by - Liam Curmi de Gray & Stefano Schembri");
        System.out.println("");
        System.out.println("Construction of Empty CQueue & Binary Tree");
        CQueue circQ = new CQueue();
        BinSearchTree bst = new BinSearchTree();

        do {

            System.out.println("");
            System.out.println("---> Main Menu <---");
            System.out.println("1) Populate Queue");
            System.out.println("2) List all objects in Circular Queue");
            System.out.println("3) Update an Employee's payment");
            System.out.println("4) Update all Employee's payment by 10%");
            System.out.println("5) Populate BST by all Circular Queue objects");

            if (bst.root != null) {
                System.out.println("6) Search for object in BST");
                System.out.println("7) Output all objects in BST");
            }

            System.out.println("8) Exit Program");
            System.out.print("Enter your choice with the corresponding number: ");
            choice = s.nextInt();
            System.out.println("");

            switch (choice) {
                case 1:

                    do {
                        System.out.println("Populating the Queue");
                        System.out.println("1) for Employee");
                        System.out.println("2) for PartTimer");
                        System.out.print("Enter choice here: ");
                        choice = s.nextInt();

                        System.out.println("");
                        AnyClass newObject = null;

                        if (choice == 1 || choice == 2) {

                            System.out.print("Enter Sequence Number: ");
                            int seqNo = s.nextInt();
                            System.out.print("Enter Surname: ");
                            String surname = s.next();
                            System.out.print("Enter payment: ");
                            double pay = s.nextDouble();

                            switch (choice) {

                                case 1:
                                    newObject = new Employee(seqNo, surname, pay);
                                    break;

                                case 2:
                                    System.out.print("Enter hours worked: ");
                                    int hoursWorked = s.nextInt();

                                    newObject = new PartTimer(seqNo, surname, pay, hoursWorked);
                                    break;

                            }

                            System.out.println("");
                            if (circQ.put(newObject) && newObject != null) {
                                System.out.println("New node has been added to the queue");
                            } else if (newObject == null) {

                            } else {
                                System.out.println("Queue is full");
                            }
                            System.out.println("");
                        } else {
                            System.out.println("Invalid Choice");
                            System.out.println("");
                        }
                    } while (choice < 1 || choice > 2 || circQ.isFull != true);
                    break;

                case 2:
                    System.out.println("");
                    System.out.println(">>>Traversal of Queue<<<");
                    System.out.println("");
                    circQ.listAll();
                    break;

                case 3:
                    System.out.println("Searching for specific record");
                    System.out.print("Enter Surname: ");
                    String surname = s.next();
                    System.out.print("Enter Sequential Reference: ");
                    String seqNo = s.next();
                    AnyClass temp = circQ.editObject(surname + seqNo);

                    if (temp != null) {
                        System.out.println("");
                        System.out.println("Updating Payment");
                        System.out.print("Insert New Amount: ");
                        double newPay = s.nextDouble();
                        temp.edit(newPay);
                    }
                    System.out.println("");
                    System.out.println("New Updated Queue");
                    circQ.listAll();
                    break;

                case 4:
                    System.out.println("");
                    System.out.println("Updating all Employees Payment by 10%");
                    circQ.changePayOfAll(10);
                    circQ.listAll();
                    break;

                case 5:

                    if (circQ.front.obj == null) {
                        System.out.println("Populate the CQueue first before you populate the BST");
                    } else {
                        System.out.println("");
                        System.out.println("Populating BST by all CQueue");

                        for (int i = 0; i < 3; i++) {
                            bst.populateFromQueue(circQ);
                        }

                    }
                    break;

                case 6:
                    System.out.println("");
                    System.out.print("Search BST via Surname: ");
                    surname = s.next();

                    String sen = bst.search(surname).getData();
                    System.out.println(sen);
                    break;

                case 7:
                    System.out.println("");
                    System.out.println("Outputting all BST in Ascending Order According to Sequential Number");
                    bst.listInOrder();
                    break;

                case 8:
                    System.out.println("Exiting Program...");
                    break;

                default:
                    System.out.println("Invalid choice, try again...");
                    break;

            }

        } while (choice != 8);
    }

}
