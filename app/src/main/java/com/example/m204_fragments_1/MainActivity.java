package com.example.m204_fragments_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentA fA = new FragmentA();
        getSupportFragmentManager().beginTransaction()
                .add(R.id.container, fA)
                .commit();

        Button btnOpenB = findViewById(R.id.openFB);

        btnOpenB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {




            }
        });



    }
}