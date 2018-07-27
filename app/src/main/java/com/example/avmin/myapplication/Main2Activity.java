package com.example.avmin.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button goback = (Button) findViewById(R.id.goBack);
        goback.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
          switch (view.getId()){
              case R.id.goBack:
                  Intent intent = new Intent(this, MainActivity.class);
                  startActivity(intent);
                  break;
          }
    }
}

