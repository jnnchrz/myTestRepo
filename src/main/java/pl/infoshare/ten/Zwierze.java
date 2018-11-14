package pl.infoshare.ten;

public abstract class Zwierze {

    public short getNumberOfLegs() {
        return 4;
    }

    public boolean hasTail() {
        return true;
    }
     public abstract String voice();
}
