package com.example.avmin.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener {

    TextView res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button goback = (Button) findViewById(R.id.goBack);
        goback.setOnClickListener(this);

        Intent intent = getIntent();
        Float value1 = intent.getFloatExtra("num1");
        Float value2 = intent.getFloatExtra("num2");
        res = (TextView) findViewById(R.id.textView);;

        value1 = num1;
        value2 = num2;



        result = value1 + value2;


        res.setText(res);



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

