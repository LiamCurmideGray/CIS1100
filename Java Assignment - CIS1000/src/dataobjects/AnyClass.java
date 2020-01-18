package dataobjects;

//Part 1
public class AnyClass {

    int seqNo;

    public AnyClass() {

    }

    public AnyClass(int seqNo) {
        this.seqNo = seqNo;
    }

    public int getSeqNo() {
        return seqNo;
    }

    public void setSeqNo() {
        this.seqNo = seqNo;
    }

    public String getData() {
        return "Sequence Number " + seqNo;
    }

    public String getKey() {
        return String.valueOf(seqNo);
    }

    public void edit(double pay) {

    }
}
