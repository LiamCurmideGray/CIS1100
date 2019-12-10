package linearstructure;

import dataobjects.*;
import linearnodes.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author liamc
 */

//Part 4
public class CQueue {
    
    public Node front, rear;
    boolean isFull;
    
    //Part 4a
    public CQueue() {
        for (int i = 0; i < 20; i++) {
            Node newNode = new Node(null,null);
            
            if (front == null) {
                front = newNode;
                rear = newNode;
            }
            else {
                rear.next = newNode;
                rear = newNode;
            }
            
            rear.next = null;
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
        }

        else
            return false;
    }

    //Part 4c
    public AnyClass serve() {
        if (isFull || rear.next != front) {
            AnyClass objectToServe = front.obj;
            front = front.next;
            isFull = false;

            return objectToServe;
        }
        else {
            return null;
        }
    }

    //Part 4d
    public void listAll(Node obj) {
        Node currentNode = front;

        while (currentNode != null) {
            obj.show();
            currentNode = currentNode.next;
        }
    }

    //Part 4e
    public AnyClass editObject(String key)
    {
        if (isFull || rear.next != front)
        {
            Node temp = front;

            do
            {
                temp.show();
                temp = temp.next;
            } while (temp != rear.next);
        }
        return null;//This needs amendment
    }
}
