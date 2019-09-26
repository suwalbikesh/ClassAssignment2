package com.bikeshsuwal.classassignment.Percentage;

public class Percentage {
    private String name;
    private int first, second, third;

    public int TotalPercentage(){
        return (first+second+third)/3;
    }

    public String Name(){
        return name;
    }

    public Percentage(String name, int first, int second, int third) {
        this.name = name;
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFirst() {
        return first;
    }

    public void setFirst(int first) {
        this.first = first;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public int getThird() {
        return third;
    }

    public void setThird(int third) {
        this.third = third;
    }
}
