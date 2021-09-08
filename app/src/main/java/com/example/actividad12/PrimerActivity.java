package com.example.actividad12;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class PrimerActivity extends AppCompatActivity {

    public static String name = "name";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
}
    public void transforma(View view){
        Intent SegundoAct = new Intent(PrimerActivity.this,SegundaActivity.class);
        SegundoAct.putExtra("dato01","RODRIGO");
        startActivity(SegundoAct);
    }
    public void transforma3(View view){
        Intent tercer = new Intent(PrimerActivity.this,TercerActivity.class);
        EditText name = (EditText) findViewById(R.id.name);
        tercer.putExtra("name", name.getText().toString());
        startActivity(tercer);
    }
}