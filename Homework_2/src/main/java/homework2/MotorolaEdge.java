package homework2;

import java.util.ArrayList;

public class MotorolaEdge extends Motorola{

    private int numberOfGB;

    public MotorolaEdge(String name, String color, int numberOfGB) {
        super(name, color);
        this.numberOfGB = numberOfGB;
    }

    public MotorolaEdge(String name, ArrayList<Contact> contacts, String color, int numberOfGB) {
        super(name, contacts, color);
        this.numberOfGB = numberOfGB;
    }

    public int getNumberOfGB() {
        return numberOfGB;
    }

    public void setNumberOfGB(int numberOfGB) {
        this.numberOfGB = numberOfGB;
    }



}
