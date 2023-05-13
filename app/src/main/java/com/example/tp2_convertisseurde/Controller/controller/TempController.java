package com.example.tp2_convertisseurde.Controller.controller;

import com.example.tp2_convertisseurde.Controller.model.Temp;

public final class TempController {
    private static Temp temp;
    private static TempController instance = null;

    private TempController(){
        super();
    }

    //pour verifier q'une seul instance doit etre presente (unique)
    public final static TempController getInstance(){
        if (TempController.instance==null)
            TempController.instance = new TempController();
        return TempController.instance;
    }
    public void creatModel(double celsius){
        temp = new Temp(celsius);
    }

    // Renvoie la valeur de la température en Fahrenheit du classe temp au intterface client
    public double getFahrenheit(){
        return temp.getFahrenheit();
    }
}
