package com.example.a08_bmi_abnormal_judgment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class testH8 extends AppCompatActivity {

    private EditText height,weight;
    private Button bmi;
    private TextView num;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_h8);
        height = (EditText)findViewById(R.id.height);
        weight = (EditText)findViewById(R.id.weight);
        num = (TextView)findViewById(R.id.num);
    }
    public void bmi(View view) {
        float total = (Float.parseFloat(weight.getEditableText().toString()))/
                (Float.parseFloat(height.getEditableText().toString())*Float.parseFloat(height.getEditableText().toString()));
        Intent intent = new Intent();
        intent.setClass(testH8.this, testH8_2.class);
        intent.putExtra("BMI",Float.toString(total));
        height.setText("");
        weight.setText("");
        startActivity(intent);
    }
}