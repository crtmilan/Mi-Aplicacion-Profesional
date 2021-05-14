package com.oscarcruz.designthinking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Principal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
    }
    public void Inspiracion (View v1){
        Intent inspiracion = new Intent (Principal.this, Inspiracion.class);
        startActivity(inspiracion);

    }

    public void Ideacion (View v2){
        Intent ideacion = new Intent (Principal.this, Ideacion.class);
        startActivity(ideacion);

    }
    public void Implementacion (View v3){
        Intent implementacion = new Intent (Principal.this, Implementacion.class);
        startActivity(implementacion);

    }

    }