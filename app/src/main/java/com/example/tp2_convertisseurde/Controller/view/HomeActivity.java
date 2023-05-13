package com.example.tp2_convertisseurde.Controller.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.tp2_convertisseurde.R;

public class HomeActivity extends AppCompatActivity implements  View.OnClickListener   {
    private ImageView convertDevise, convertTemp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        init();
        ecouteClick();
    }
    void init(){
        convertDevise = (ImageView) findViewById(R.id.ImgDev);
        convertTemp = (ImageView) findViewById(R.id.ImgTemp);

    }
    private void ecouteClick(){
        convertDevise.setOnClickListener((View.OnClickListener)this );
        convertTemp.setOnClickListener((View.OnClickListener)this );
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.ImgDev :
                navigateToActivity(ConvertMonnaieActivity.class);
                break;
            case R.id.ImgTemp:
                navigateToActivity(ConvertTempActivity.class);
                break;
            default:break;
        }
    }
    private void navigateToActivity(Class nextActivity) {
        Intent intent = new Intent(HomeActivity.this, nextActivity);
        startActivity(intent);
    }
}