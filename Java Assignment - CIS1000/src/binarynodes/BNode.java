package binarynodes;

import dataobjects.AnyClass;

<<<<<<< Updated upstream
//Part 3
=======
>>>>>>> Stashed changes
public class BNode {

    public BNode left;
    public BNode right;
    public AnyClass obj;

    public BNode(AnyClass obj) {
        this.obj = obj;
        left = null;
        right = null;
    }

    public void show() {
        System.out.println(obj.getData());
        System.out.println("");
    }
<<<<<<< Updated upstream

=======
>>>>>>> Stashed changes
}
