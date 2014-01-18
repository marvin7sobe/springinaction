package com.springinaction.corebyxml;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Human {
    private int age;
    private String name;
    private Human wifeOrHusbent;
    private List<Human> relatives;
    private Properties cars;
    private Map<String,Human> collegues;
    private Set<String> favouriteWords;
    private boolean hasDog;
    private String cityName;
    private String twitter;

    public Human() {
    }

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String getPersonalId(){
        return name +"-"+ age;
    }

    public String getTwitter() {
        return twitter;
    }

    public void setTwitter(String twitter) {
        this.twitter = twitter;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Human> getRelatives() {
        return relatives;
    }

    public void setRelatives(List<Human> relatives) {
        this.relatives = relatives;
    }

    public Human getWifeOrHusbent() {
        return wifeOrHusbent;
    }

    public void setWifeOrHusbent(Human wifeOrHusbent) {
        this.wifeOrHusbent = wifeOrHusbent;
    }

    public Properties getCars() {
        return cars;
    }

    public void setCars(Properties cars) {
        this.cars = cars;
    }

    public Map<String, Human> getCollegues() {
        return collegues;
    }

    public void setCollegues(Map<String, Human> collegues) {
        this.collegues = collegues;
    }

    public Set<String> getFavouriteWords() {
        return favouriteWords;
    }

    public void setFavouriteWords(Set<String> favouriteWords) {
        this.favouriteWords = favouriteWords;
    }

    public boolean isHasDog() {
        return hasDog;
    }

    public void setHasDog(boolean hasDog) {
        this.hasDog = hasDog;
    }
}
