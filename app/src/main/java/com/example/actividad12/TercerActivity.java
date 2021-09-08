package com.example.actividad12;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class TercerActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tercer);
        showme();
        Context context = getApplicationContext();
        CharSequence text = "BUENAS ESTA ES LA PESTAÑA DEL SALUDO (✿◠‿◠)";
        int duracion = Toast.LENGTH_LONG;
        Toast toast = Toast.makeText(context, text, duracion);
        toast.show();
    }
    private void showme() {
        Intent show = getIntent();
        String r1 = show.getStringExtra(PrimerActivity.name) ;
        TextView recibe = (TextView) findViewById(R.id.receptor1);
        recibe.setText("BIENVENIDO " + r1 + " GRACIAS POR ESCRIBIR SU NOMBRE");
    }
}