/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package non_linearstructures;

/**
 *
 * @author liamc
 */

import dataobjects.*;
import binarynodes.*;


    public class BinSearchTree {
        
        public BNode root;
        
        public BinSearchTree(){
            
            root = null;
        }
    
    
    
    public void insert(AnyClass newObj){
            BNode newNode = new BNode(newObj);
            
            if(root == null) {
                root = newNode;
            }
            else if(newNode == null){
            }
    }
    
    public AnyClass search(String key){
        
        return null;
    }
    
    public void listInOrder(){
        
    }
    
    public void populateFromQueue(/*CQueue que*/){
        
    }
}
