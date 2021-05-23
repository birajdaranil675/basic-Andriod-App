package com.example.myapp3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText num1, num2;
    Button sum, sub, mul, div, openContextActivity;
    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);

        sum = findViewById(R.id.sum);
        sub = findViewById(R.id.sub);
        mul = findViewById(R.id.mul);
        div = findViewById(R.id.div);

        textView = findViewById(R.id.txt_result);

        openContextActivity = findViewById(R.id.openContextActivity);
        openContextActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ContextMenuActivity.class);
                startActivity(intent);
            }
        });

        sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String NUM1 = num1.getText().toString();
                String NUM2 = num2.getText().toString();

                int a = Integer.parseInt(NUM1);
                int b = Integer.parseInt(NUM2);
                int total = a + b;

                Toast.makeText(MainActivity.this, Integer.toString(total), Toast.LENGTH_LONG).show();
                textView.setText(Integer.toString(total));
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String NUM1 = num1.getText().toString();
                String NUM2 = num2.getText().toString();

                int a = Integer.parseInt(NUM1);
                int b = Integer.parseInt(NUM2);
                int total = a - b;

                Toast.makeText(MainActivity.this, Integer.toString(total), Toast.LENGTH_LONG).show();
                textView.setText(Integer.toString(total));
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String NUM1 = num1.getText().toString();
                String NUM2 = num2.getText().toString();

                int a = Integer.parseInt(NUM1);
                int b = Integer.parseInt(NUM2);
                int total = a * b;

                Toast.makeText(MainActivity.this, Integer.toString(total), Toast.LENGTH_LONG).show();
                textView.setText(Integer.toString(total));
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String NUM1 = num1.getText().toString();
                String NUM2 = num2.getText().toString();

                int a = Integer.parseInt(NUM1);
                int b = Integer.parseInt(NUM2);
                int total = a / b;

                Toast.makeText(MainActivity.this, Integer.toString(total), Toast.LENGTH_LONG).show();
                textView.setText(Integer.toString(total));
            }
        });
    }
}