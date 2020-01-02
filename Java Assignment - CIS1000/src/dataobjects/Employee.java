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
public class Employee extends AnyClass {
    
    
    String surname;
    double pay;
    
    
    public Employee(){
        
    }
    
    public Employee(int seqNo, String surname, double pay){
        
        super(seqNo);
        this.surname = surname;
        this.pay = pay;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getSeqNo() {
        return seqNo;
    }
    
//    public String getSeqNo(){
//        return String.valueOf(seqNo);
//    }

    public void setSeqNo(int seqNo) {
        this.seqNo = seqNo;
    }
    
    public void setPay(double pay){
        this.pay = pay;
        
    }
    
    public double getPay(){
        return pay;
    }
    
    
   public String getData(){
         return "Sequence Number: " + seqNo +"\nSurname: " + surname +
                 "\nPay: " + pay;
   }
    
    public String getKey(){
        return surname;
    }
    
    
    public void edit(double pay) {
        this.pay = pay;
    }
}
