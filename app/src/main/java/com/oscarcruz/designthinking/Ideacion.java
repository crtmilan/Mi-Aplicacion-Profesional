package com.oscarcruz.designthinking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Ideacion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ideacion);

    }

    public void Idear (View v6){
        Intent idear = new Intent (Ideacion.this, Idear.class);
        startActivity(idear);

    }
}