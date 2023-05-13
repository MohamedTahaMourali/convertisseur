package com.example.tp2_convertisseurde.Controller.model;

public class Temp {
    private double fahrenheit,celsius ;

    public Temp(double celsius) {
        this.celsius = celsius ;
        convert();
    }
    public double getFahrenheit() {
        return fahrenheit;
    }
    private void convert(){
        fahrenheit = ((celsius * 9)/5) + 32 ;
    }
}
