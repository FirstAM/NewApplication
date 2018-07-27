package com.example.avmin.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static java.lang.Integer.parseInt;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener {

    TextView res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button goback = (Button) findViewById(R.id.goBack);
        goback.setOnClickListener(this);

        // принимает значения из первого окна PutExtra Метод для прием мало вероятно

        Bundle arguments = getIntent().getExtras();

        Intent intent = getIntent();
        assert arguments != null;
        int value1 = arguments.getInt("Num1");
        int value2 = arguments.getInt("Num2");
        res = (TextView) findViewById(R.id.textView);


        int result = value1 + value2;

        res.setText(String.valueOf(result));


    }

    // переход обратно на первое окно
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

