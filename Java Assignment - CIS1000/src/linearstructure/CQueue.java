package linearstructure;

import dataobjects.*;
import linearnodes.*;

//Part 4
public class CQueue {

    public Node front, rear;
    public boolean isFull;

    //Part 4a
    public CQueue(int nodes) {
        for (int i = 0; i < nodes; i++) {
            Node newNode = new Node(null);

            if (front == null) {
                front = newNode;
                rear = newNode;
            } else {
                rear.next = newNode;
                rear = newNode;
            }

            rear.next = front;
            isFull = false;
        }
    }

    //Part 4b
    public boolean put(AnyClass newObj) {
        if (!isFull) {
            rear = rear.next;
            rear.obj = newObj;

            if (rear.next == front) {
                isFull = true;
            }

            return true;
        } else {
            return false;
        }
    }

    //Part 4c
    public AnyClass serve() {
        if (isFull || rear.next != front) {
            AnyClass objectToServe = front.obj;
            front = front.next;
            isFull = false;

            return objectToServe;
        } else {
            return null;
        }
    }

    //Part 4d
    public void listAll() {

        if (isFull || rear.next != front) {
            Node currentNode = front;

            do {
                currentNode.show();
                System.out.println("");
                currentNode = currentNode.next;
            } while (currentNode != rear.next);
        }
    }

    //Part 4e
    public AnyClass editObject(String key) {
        if (isFull || rear.next != front) {
            Node temp = front;

            do {
                Employee ff = (Employee) temp.obj;
                String foo = ff.getKey() + ff.getSeqNo();

                if (foo.equals(key)) {
                    System.out.println("Object Found!");
                    return temp.obj;
                }

                temp = temp.next;
            } while (temp != rear.next);
        }
        System.out.println("Object not found!");
        return null;
    }

    //Part 4f
    public void changePayOfAll(int percent) {
        if (isFull || rear.next != front) {
            Node temp = front;

            do {
                Employee employee = (Employee) temp.obj;
                employee.setPay((employee.getPay() * percent / 100) + employee.getPay());
                temp = temp.next;
            } while (temp != rear.next);
        }
    }
}
