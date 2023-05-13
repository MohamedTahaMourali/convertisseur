package com.example.tp2_convertisseurde.Controller.controller;

import com.example.tp2_convertisseurde.Controller.model.Monnaie;

public final class MonnaieController {
    private static Monnaie model;
    private static MonnaieController insatance= null;

    //public Controller(){  pas de pattern singleton: pas unique isntance pour controlleur
    private MonnaieController(){  // pattern singleton : unique
        super();//herite de classe object pour ne pas mettre acollade vide
    }//user action

    //pour verifier q'une seul instance doit etre presente (unique)
    public final static MonnaieController getInsatance(){
        if(MonnaieController.insatance == null){
            MonnaieController.insatance=new MonnaieController();
        }
        return MonnaieController.insatance;
    }

    public void createModel(Double dinar){
        model=new Monnaie(dinar);
    }//update model (+user action)
    public double getEuro(){
        return model.getEuro();
    }
    public double getGbp(){
        return model.getGbp();
    }
    public double getUsd(){
        return model.getUsd();
    }
}