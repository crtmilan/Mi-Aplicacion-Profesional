package com.oscarcruz.designthinking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Implementacion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_implementacion);
    }
    public void Prototipar (View v6){
        Intent prototipar = new Intent (Implementacion.this, Prototipar.class);
        startActivity(prototipar);

    }

    public void Evaluar (View v7){
        Intent evaluar = new Intent (Implementacion.this, Evaluar.class);
        startActivity(evaluar);

    }

}