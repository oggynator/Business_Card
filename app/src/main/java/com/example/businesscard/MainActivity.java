package com.example.businesscard;

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
    public void openAbout(View view){
        Intent intent = new Intent(this, aboutActivity.class);
        startActivity(intent);
    }

    public void openBuy(View view){
        Intent intent =new Intent(this, productActivity.class);
        startActivity(intent);
    }

    public void openHistory(View view){
        Intent intent =new Intent(this, HistoryActivity.class);
        startActivity(intent);
    }



}
