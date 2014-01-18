package com.springinaction;

import java.util.List;

/**
 * Created by vlad on 1/17/14.
 */
public class Territory {
    List<City> cities;
    List<String> citiesNames;

    public List<String> getCitiesNames() {
        return citiesNames;
    }

    public void setCitiesNames(List<String> citiesNames) {
        this.citiesNames = citiesNames;
    }

    public List<City> getCities() {
        return cities;
    }

    public void setCities(List<City> cities) {
        this.cities = cities;
    }
}
