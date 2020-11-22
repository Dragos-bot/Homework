package homework3.model;

public class Address {

    private String street;
    private int number;
    private String city;
    private String region;
    private String zipCode;
    private Country country;

    public Address(String street, int number, String city, String region, String zipCode, Country country) {
        this.street = street;
        this.number = number;
        this.city = city;
        this.region = region;
        this.zipCode = zipCode;
        this.country = country;
    }

    @Override
    public String toString() {
        return "Address{" + "street=" + street + ", number=" + number + ", city=" + city + ", state=" + region + ", zipCode=" + zipCode + " " + country.toString() + "}";
    }
}
