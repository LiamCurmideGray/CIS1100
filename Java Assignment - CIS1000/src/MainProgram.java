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

public class MainProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int choice;

        CQueue circQ = new CQueue();

        do {
            System.out.println("Populating the Queue");
            System.out.println("Select 1 for Employee");
            System.out.println("Select 2 for PartTimer");
            System.out.print("Enter choice here: ");
            choice = s.nextInt();
            System.out.println("");
            AnyClass newObject;

            switch (choice) {
                case 1:
                    System.out.print("Enter Sequence Number: ");
                    int seqNo = s.nextInt();
                    System.out.print("Enter Surname: ");
                    String surname = s.next();
                    System.out.print("Enter payment: ");
                    double pay = s.nextDouble();
                    newObject = new Employee(seqNo, surname, pay);
                    break;
                case 2:
                    System.out.print("Enter Sequence Number: ");
                    seqNo = s.nextInt();
                    System.out.print("Enter Surname: ");
                    surname = s.next();
                    System.out.print("Enter payment: ");
                    pay = s.nextDouble();
                    System.out.print("Enter hours worked: ");
                    int hoursWorked = s.nextInt();

                    newObject = new PartTimer(seqNo, surname, pay, hoursWorked);
                    break;
                default:
                    newObject = null;
                    break;
            }
            System.out.println("");
            if (circQ.put(newObject)) {
                System.out.println("New node has been added to the queue");
            } else {
                System.out.println("Queue is full");
            }
            System.out.println("");
        } while (choice < 1 || choice > 2 || circQ.isFull != true);

        System.out.println("");
        System.out.println(">>>Traversal of Queue<<<");
        System.out.println("");
        circQ.listAll();
    }

}
