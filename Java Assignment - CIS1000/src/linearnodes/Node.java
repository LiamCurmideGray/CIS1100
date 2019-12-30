/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linearnodes;
import dataobjects.*;

/**
 *
 * @author liamc
 */

//Part 3
public class Node {
    
    public Node next;
    public AnyClass obj;
    
    
    public Node(AnyClass obj){
        this.obj = obj;
        next = null;
    }
    
    public void show() {
        System.out.println(obj.getData());
    }
}
