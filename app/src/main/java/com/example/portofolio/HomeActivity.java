package com.example.portofolio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        LinearLayout btnProfil = (LinearLayout) findViewById(R.id.btnProfil);
        btnProfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view) {
                Intent intent = new Intent(HomeActivity.this, PortoActivity.class);
                startActivity(intent);
            }
        });

        LinearLayout btnTodo = (LinearLayout) findViewById(R.id.btnTodo);
        btnTodo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view) {
                Intent intent = new Intent(HomeActivity.this, TodoActivity.class);
                startActivity(intent);
            }
        });

    }


}