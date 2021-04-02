package com.cdp.lenguajes_programacion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class MainActivity extends AppCompatActivity {
    CheckBox cb1, cb2, cb3, cb4;
    Button btnMostrar, btnLimpiar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cb1 = findViewById(R.id.checkBox);
        cb2 = findViewById(R.id.checkBox2);
        cb3 = findViewById(R.id.checkBox3);
        cb4 = findViewById(R.id.checkBox4);
        btnMostrar = findViewById(R.id.button);
        btnLimpiar = findViewById(R.id.button2);
        btnMostrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               StringBuffer result = new StringBuffer();
               result.append("Mi experiencia:");
               if(cb1.isChecked()){
                   result.append("\n" + cb1.getText().toString());
               }
                if(cb2.isChecked()){
                    result.append("\n" + cb2.getText().toString());
                }
                if(cb3.isChecked()){
                    result.append("\n" + cb3.getText().toString());
                }
                if(cb4.isChecked()){
                    result.append("\n" + cb4.getText().toString());
                }
                if(!cb1.isChecked()&&!cb2.isChecked()&&!cb3.isChecked()&&!cb4.isChecked())
                    result.append("\nNinguna");
                Mensaje.mensaje(MainActivity.this, result.toString());
            }
        });
        btnLimpiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cb1.isChecked())
                    cb1.setChecked(false);
                if(cb2.isChecked())
                    cb2.setChecked(false);
                if(cb3.isChecked())
                    cb3.setChecked(false);
                if(cb4.isChecked())
                    cb4.setChecked(false);
            }
        });
    }
}