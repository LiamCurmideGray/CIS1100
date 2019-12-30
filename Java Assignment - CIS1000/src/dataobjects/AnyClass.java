/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataobjects;

/**
 *
 * @author liamc
 */
public class AnyClass {
    
    int seqNo;
    
    public AnyClass() {
       
    }
    
    public AnyClass(int seqNo) {
        this.seqNo = seqNo;
    }
    
    public int getSeqNo(){
        return seqNo;
    }
    
    public void setSeqNo(){
        this.seqNo = seqNo;
    }
       
    public String getData(){
        return "Sequence Numberrrr " + seqNo;
    }
    
    public String getKey(){
        return String.valueOf(seqNo);
    }
    
    public void edit(){
        
    }
}
