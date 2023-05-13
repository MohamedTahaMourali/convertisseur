package com.example.tp2_convertisseurde.Controller.model;

public class Monnaie {
    private Double euro, usd, gbp,dinar;
    public Monnaie(Double dinar){
        this.dinar=dinar;
        convert();
    }
    private void convert() {
        euro =(double) dinar / 3.3360;
        usd = (double)dinar / 3.7830;
        gbp = (double)dinar / 3.1130;
    }
    public Double getEuro() {
        return euro;
    }//notify controller
    public Double getGbp() {
        return gbp;
    }//notify controller
    public Double getUsd() {
        return usd;
    }//notify controller
}