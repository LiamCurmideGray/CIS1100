package linearnodes;

import dataobjects.*;

//Part 3
public class Node {

    public Node next;
    public AnyClass obj;

    public Node(AnyClass obj) {
        this.obj = obj;
        next = null;
    }

    public void show() {
        System.out.println(obj.getData());
    }
}
