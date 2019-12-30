package com.example.sampledemo.modules;

public class SampleData {

    private String data;
    private int number;

    public SampleData(String data, int number) {
        this.data = data;
        this.number = number;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
