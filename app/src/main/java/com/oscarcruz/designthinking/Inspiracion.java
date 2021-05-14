package com.oscarcruz.designthinking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Inspiracion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inspiracion);
    }

    public void Empatizar (View v4){
        Intent empatizar = new Intent (Inspiracion.this, Empatizar.class);
        startActivity(empatizar);

    }

    public void Definir (View v5){
        Intent definir = new Intent (Inspiracion.this, Definir.class);
        startActivity(definir);

    }
}