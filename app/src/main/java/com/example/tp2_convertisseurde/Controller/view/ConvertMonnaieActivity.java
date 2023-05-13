package com.example.tp2_convertisseurde.Controller.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.tp2_convertisseurde.Controller.controller.MonnaieController;
import com.example.tp2_convertisseurde.R;


public class ConvertMonnaieActivity extends AppCompatActivity  {
    private EditText txtTND;
    private Button btnConvert;
    private TextView lbEUR,lbUSD,lbGBP;
    MonnaieController controller= MonnaieController.getInsatance();
    private void init(){
        txtTND=findViewById(R.id.txtTND);//findViewById retourne un view donc il faut la convertir(cast) en edit text
        btnConvert=findViewById(R.id.buttomCONV);//pas utiliser dans cas listener implicite(utiliser pour explicite)
        lbEUR= findViewById(R.id.txtEUR);
        lbUSD= findViewById(R.id.txtUSD);
        lbGBP= findViewById(R.id.txtGBP);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();//liaison entre les instance des java et les composants de xml: alors chaque changement de content va etre envoyer au context et vise versa
        btnConvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                convert();
            }
        });
    }
    public void convert()
    {

        Double dinar = null;
        try
        {
            //Récupération du texte du montant en TND avec getText()
            dinar = Double.parseDouble(txtTND.getText().toString());
        }
        catch (Exception e){ } // Pour ne pas se planter

        //user action + update du model
        controller.createModel(dinar);

        //Mise à jour des TextView lbEUR, lbUSD, lbGBP
        lbEUR.setText(Double.toString(controller.getEuro()));
        lbUSD.setText(Double.toString(controller.getUsd()));
        lbGBP.setText(Double.toString(controller.getGbp()));// notify view
    }
}