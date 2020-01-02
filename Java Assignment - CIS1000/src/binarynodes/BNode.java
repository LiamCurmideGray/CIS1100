/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarynodes;

import dataobjects.AnyClass;

/**
 *
 * @author liamc
 */
public class BNode {
    
    public BNode left;
    public BNode right;
    public AnyClass obj;
    
    
    public BNode(AnyClass obj){
        this.obj = obj;
        left = null;
        right = null;
    }
    
    public void show(){
        System.out.println(obj.getData());
        System.out.println("");
    }
    
//    public void editNode(){
//        obj.edit();
//    }
    
}
