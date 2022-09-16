package com.example.bosonit71.Model;

public class Persona {



    String name;
    int age;
    String population;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPopulation() {
        return population;
    }

    public void setPopulation(String population) {
        this.population = population;
    }

    public Persona(String name, int age, String population) {
        this.name = name;
        this.age = age;
        this.population = population;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", population='" + population + '\'' +
                '}';
    }
}
