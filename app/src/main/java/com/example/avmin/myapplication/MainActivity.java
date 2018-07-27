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

    Button calc;

    EditText value1;
    EditText value2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

// находим элементы экрана
        calc = (Button) findViewById(R.id.button2);
        value1 = (EditText) findViewById(R.id.editText1);
        value2 = (EditText) findViewById(R.id.editText2);



// Обработчик для кнопок
        calc.setOnClickListener(this);

     }


     @SuppressLint("SetTextI18n")
     @Override
      public void onClick(View v) {

        int num1 = Integer.parseInt(value1.getText().toString());
        int num2 = Integer.parseInt(value2.getText().toString());

           switch (v.getId()){
                case R.id.button2:
                    // метод  перехода на другое окно
                Intent intent = new Intent(this, Main2Activity.class);

              // отправляет значения из первого окна PutExtra Метод для отправки
                intent.putExtra("Num1", num1);
                intent.putExtra("Num2", num2);

                // намерение перехода на другое окно
                startActivity(intent);

                }



           }


      }

