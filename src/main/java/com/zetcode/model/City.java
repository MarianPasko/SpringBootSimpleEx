package com.zetcode.model;

import java.util.StringJoiner;

public class City {

    private long id;
    private String name;
    private int population;

    public City() {}

    public City(long id, String name, int population) {
        this.id = id;
        this.name = name;
        this.population = population;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", City.class.getSimpleName() + "[", "]")
                .add("id=" + id)
                .add("name='" + name + "'")
                .add("population=" + population)
                .toString();
    }
}
