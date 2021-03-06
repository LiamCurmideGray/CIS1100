package non_linearstructures;

import dataobjects.*;
import binarynodes.*;
import linearstructure.*;

public class BinSearchTree {

    public BNode root;

    public BinSearchTree() {

        root = null;
    }

    //Part 4a
    public void insertBST(BNode parent, BNode newNode) {
        if (parent == null) {
            root = newNode;

        } else if (newNode.obj.getKey().compareTo(parent.obj.getKey())
                < parent.obj.getKey().compareTo(newNode.obj.getKey())) {
            if (parent.left == null) {
                parent.left = newNode;

            } else {
                insertBST(parent.left, newNode);
            }

        } else {
            if (parent.right == null) {
                parent.right = newNode;
            } else {
                insertBST(parent.right, newNode);
            }

        }

    }

    //Part 4a
    public void insert(AnyClass newObj) {
        BNode newNode = new BNode(newObj);

        insertBST(root, newNode);

    }

    //Part 4b
    public BNode searchKey(BNode parent, String key) {
        if (parent != null) {
            if (parent.obj.getKey().equals(key)) {
                return parent;
            } else if (parent.obj.getKey().compareTo(key) > 0) {
                return searchKey(parent.left, key);
            } else {
                return searchKey(parent.right, key);
            }
        } else {
            return null;
        }

    }

    //Part 4b
    public AnyClass search(String key) {

        BNode findNode = searchKey(root, key);

        if (findNode != null) {
            return findNode.obj;
        } else {
            return null;
        }
    }

    //Part 4c
    public void listInOrder() {
        inorderTraversal(root);
    }

    public void inorderTraversal(BNode parent) {
        if (parent != null) {
            inorderTraversal(parent.left);
            parent.show();
            inorderTraversal(parent.right);
        }
    }

    //Part 4d
    public void populateFromQueue(CQueue que) {
<<<<<<< Updated upstream
=======

>>>>>>> Stashed changes
        insert(que.serve());
    }
}
