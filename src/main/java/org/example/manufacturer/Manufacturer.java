package org.example.manufacturer;

import java.time.Year;
import java.util.Objects;

//Exercise 12
public class Manufacturer {

    private String name;
    private Year yearOfEstablishment;
    private String country;

    public Manufacturer(String name, Year yearOfEstablishment, String country) {
        this.name = name;
        this.yearOfEstablishment = yearOfEstablishment;
        this.country = country;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Manufacturer that = (Manufacturer) o;
        return Objects.equals(name, that.name) && Objects.equals(yearOfEstablishment, that.yearOfEstablishment) && Objects.equals(country, that.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, yearOfEstablishment, country);
    }

}
