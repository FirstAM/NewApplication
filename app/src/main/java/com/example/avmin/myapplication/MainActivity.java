package com.example.avmin.myapplication;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn;
    Button calc;

    EditText value1;
    EditText value2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

// находим элементы экрана
        btn = (Button) findViewById(R.id.button1);
        calc = (Button) findViewById(R.id.button2);

        value1 = (EditText) findViewById(R.id.editText1);
        value2 = (EditText) findViewById(R.id.editText2);



// Обработчик для кнопок
        btn.setOnClickListener(this);
        calc.setOnClickListener(this);

     }


     @SuppressLint("SetTextI18n")
     @Override
      public void onClick(View v) {
         float num1 = 0;
         float num2 = 0;
         float result = 0;

           num1 = Float.parseFloat(value1.getText().toString());
           num2 = Float.parseFloat(value2.getText().toString());


           switch (v.getId()){
                case R.id.button2:
                Intent intent = new Intent(this, Main2Activity.class);

                intent.putExtra("Num1", num1);
                intent.putExtra("Num2", num2);
                startActivity(intent);

                case R.id.button1:


                }

         //res.setText(num1 + " + " + num2 + " = " + result );

           }


      }

