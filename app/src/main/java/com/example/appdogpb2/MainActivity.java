package com.example.appdogpb2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //pasar a otro activity
    public void SegundoView(View view){
        Intent segundo = new Intent(this, RegisterActivity.class);
        startActivity(segundo);
    }
}
