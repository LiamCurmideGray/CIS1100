package dataobjects;

<<<<<<< Updated upstream
//Part 2
=======
>>>>>>> Stashed changes
public class PartTimer extends Employee {

    int hours;

    public PartTimer() {

    }

    public PartTimer(int seqNo, String surname, double pay, int hours) {

        super(seqNo, surname, pay);
        this.hours = hours;

    }

    public int getHours() {
        return hours;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    public int getSeqNo() {
        return seqNo;
    }

    public void setSeqNo(int seqNo) {
        this.seqNo = seqNo;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public String getData() {
        return "Sequence Number: " + seqNo + "\nSurname: " + surname
                + "\nPay: " + pay + "\nHours Worked: " + hours;
    }
}
