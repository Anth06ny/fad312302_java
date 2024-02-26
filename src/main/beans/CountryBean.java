package main.beans;

public class CountryBean {

    //Attributs
    private String name;
    private double population;
    private long area;

    public CountryBean() {
        this( "SansNom");

    }

    public CountryBean(String name) {
        this(name, 1000, 10_000);
    }

    public CountryBean(String name, double population, long area) {
        this.name = name;
        this.population = population;
        this.area = area;
    }

    //Accesseurs

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public double getPopulation() {
        return population;
    }

    public void setPopulation(double population) {
        this.population = population;
    }

    public long getArea() {
        return area;
    }

    public void setArea(long area) {
        this.area = area;
    }
}
