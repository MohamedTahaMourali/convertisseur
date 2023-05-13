package com.example.tp2_convertisseurde.Controller.view;

import static java.lang.Double.parseDouble;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.tp2_convertisseurde.Controller.controller.TempController;
import com.example.tp2_convertisseurde.R;

public class ConvertTempActivity extends AppCompatActivity {
    TextView celTextView;
    Button convertButton;
    TextView ferEditText;
    TempController tmpController = TempController.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_convert_temp);
        init();
        convertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tmpController.creatModel(parseDouble(celTextView.getText().toString()));
                ferEditText.setText(Double.toString(tmpController.getFahrenheit()));
            }
        });
    }
    public void init(){
        celTextView = findViewById(R.id.txtCel);
        convertButton = findViewById(R.id.buttomCONVTEMP);
        ferEditText = findViewById(R.id.txtFer);

    }
}