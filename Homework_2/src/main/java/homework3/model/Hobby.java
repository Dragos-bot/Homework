package homework3.model;

import java.util.ArrayList;
import java.util.List;

public class Hobby {

    private String name;
    private int period;
    private List<Address> addresses;

    public Hobby(String name, int period) {
        this.name = name;
        this.period = period;
        this.addresses = new ArrayList<>();
    }

    @Override
    public String toString() {
        String hobbyToString;
        hobbyToString = "Hobby{" + "name='" + name + '\'' + ", period=" + period + ", on the addresses  = \n";

        for (Address address : this.addresses) {
            hobbyToString = hobbyToString + address.toString() + "\n";
        }
        hobbyToString = hobbyToString + '}';
        return hobbyToString;
    }

    public void addAddress(Address address) {

        addresses.add(address);
    }
}
