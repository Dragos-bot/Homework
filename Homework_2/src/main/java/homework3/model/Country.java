package homework3.model;

public class Country {

    private String name;
    private String budget;
    private long population;

    public Country(String name, String budget, long population) {
        this.name = name;
        this.budget = budget;
        this.population = population;
    }

    @Override
    public String toString() {
        return "Country{" + "name='" + name + '\'' + ", budget='" + budget + '\'' + ", population=" + population + '}';
    }
}
