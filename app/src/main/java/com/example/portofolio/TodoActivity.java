package com.example.portofolio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class TodoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_todo);
        Button btnToast = (Button) findViewById(R.id.btnToast);
        btnToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TodoActivity.this, HomeActivity.class);
                startActivity(intent);
                Toast.makeText(TodoActivity.this,"Berhasil Disimpan",Toast.LENGTH_LONG).show();
            }
        });
    }





}