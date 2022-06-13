package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private String input1 = "0";
    private String input2 = "0";
    private String curr1 = "$ ";
    private String curr2 = "đ ";
    private int selectInput = 1;

    String[] kindOfCurrency = {"United States - Dollar", "European - Euro", "Japanese - Yen", "British - Pound",
                               "China - Chinese Yuan", "Korea - Won", "Russian - Ruble", "Vietnam - Dong"};
    double[] exchangeRate = {23200.00, 24205.95, 172.86, 28218.51, 3426.28, 17.95, 400.73, 1.00};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button btnInput1 = findViewById(R.id.input1);
        Button btnInput2 = findViewById(R.id.input2);

        findViewById(R.id.input1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectInput = 1;

                Button b2 = findViewById(R.id.input2);
                Button b1 = findViewById(R.id.input1);
                b2.setTypeface(b1.getTypeface());
                b1.setTypeface(b1.getTypeface(), Typeface.BOLD_ITALIC);

            }
        });

        findViewById(R.id.input2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectInput = 2;
                Button b1 = findViewById(R.id.input1);
                Button b2 = findViewById(R.id.input2);
                b1.setTypeface(b2.getTypeface());
                b2.setTypeface(b2.getTypeface(), Typeface.BOLD_ITALIC);
            }
        });



        findViewById(R.id.CE_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input1 = "0";
                input2 = "0";
                btnInput1.setText(curr1 + input1);
                btnInput2.setText(curr2 + input2);
            }
        });

        findViewById(R.id.BS_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        findViewById(R.id.zero_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Integer tmp = 0;
                Button btnInput1 = findViewById(R.id.input1);
                Button btnInput2 = findViewById(R.id.input2);
                if(selectInput == 1){
                    if(input1.equals("0")){
                        btnInput1.setText(curr1 + tmp.toString());
                    } else btnInput1.setText(curr1 + input1 + tmp.toString());
                    input1 = btnInput1.getText().toString().substring(2);
                } else{
                    if(input2.equals("0")){
                        btnInput2.setText(curr2 + tmp.toString());
                    } else btnInput2.setText(curr2 + input2 + tmp.toString());
                    input2 = btnInput2.getText().toString().substring(2);
                }
            }
        });

        findViewById(R.id.one_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Integer tmp = 1;
                Button btnInput1 = findViewById(R.id.input1);
                Button btnInput2 = findViewById(R.id.input2);
                if(selectInput == 1){
                    if(input1.equals("0")){
                        btnInput1.setText(curr1 + tmp.toString());
                    } else btnInput1.setText(curr1 + input1 + tmp.toString());
                    input1 = btnInput1.getText().toString().substring(2);
                } else{
                    if(input2.equals("0")){
                        btnInput2.setText(curr2 + tmp.toString());
                    } else btnInput2.setText(curr2 + input2 + tmp.toString());
                    input2 = btnInput2.getText().toString().substring(2);
                }
            }
        });

        findViewById(R.id.two_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Integer tmp = 2;
                Button btnInput1 = findViewById(R.id.input1);
                Button btnInput2 = findViewById(R.id.input2);
                if(selectInput == 1){
                    if(input1.equals("0")){
                        btnInput1.setText(curr1 + tmp.toString());
                    } else btnInput1.setText(curr1 + input1 + tmp.toString());
                    input1 = btnInput1.getText().toString().substring(2);
                } else{
                    if(input2.equals("0")){
                        btnInput2.setText(curr2 + tmp.toString());
                    } else btnInput2.setText(curr2 + input2 + tmp.toString());
                    input2 = btnInput2.getText().toString().substring(2);
                }
            }
        });

        findViewById(R.id.three_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Integer tmp = 3;
                Button btnInput1 = findViewById(R.id.input1);
                Button btnInput2 = findViewById(R.id.input2);
                if(selectInput == 1){
                    if(input1.equals("0")){
                        btnInput1.setText(curr1 + tmp.toString());
                    } else btnInput1.setText(curr1 + input1 + tmp.toString());
                    input1 = btnInput1.getText().toString().substring(2);
                } else{
                    if(input2.equals("0")){
                        btnInput2.setText(curr2 + tmp.toString());
                    } else btnInput2.setText(curr2 + input2 + tmp.toString());
                    input2 = btnInput2.getText().toString().substring(2);
                }
            }
        });

        findViewById(R.id.four_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Integer tmp = 4;
                Button btnInput1 = findViewById(R.id.input1);
                Button btnInput2 = findViewById(R.id.input2);
                if(selectInput == 1){
                    if(input1.equals("0")){
                        btnInput1.setText(curr1 + tmp.toString());
                    } else btnInput1.setText(curr1 + input1 + tmp.toString());
                    input1 = btnInput1.getText().toString().substring(2);
                } else{
                    if(input2.equals("0")){
                        btnInput2.setText(curr2 + tmp.toString());
                    } else btnInput2.setText(curr2 + input2 + tmp.toString());
                    input2 = btnInput2.getText().toString().substring(2);
                }
            }
        });

        findViewById(R.id.five_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Integer tmp = 5;
                Button btnInput1 = findViewById(R.id.input1);
                Button btnInput2 = findViewById(R.id.input2);
                if(selectInput == 1){
                    if(input1.equals("0")){
                        btnInput1.setText(curr1 + tmp.toString());
                    } else btnInput1.setText(curr1 + input1 + tmp.toString());
                    input1 = btnInput1.getText().toString().substring(2);
                } else{
                    if(input2.equals("0")){
                        btnInput2.setText(curr2 + tmp.toString());
                    } else btnInput2.setText(curr2 + input2 + tmp.toString());
                    input2 = btnInput2.getText().toString().substring(2);
                }
            }
        });

        findViewById(R.id.six_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Integer tmp = 6;
                Button btnInput1 = findViewById(R.id.input1);
                Button btnInput2 = findViewById(R.id.input2);
                if(selectInput == 1){
                    if(input1.equals("0")){
                        btnInput1.setText(curr1 + tmp.toString());
                    } else btnInput1.setText(curr1 + input1 + tmp.toString());
                    input1 = btnInput1.getText().toString().substring(2);
                } else{
                    if(input2.equals("0")){
                        btnInput2.setText(curr2 + tmp.toString());
                    } else btnInput2.setText(curr2 + input2 + tmp.toString());
                    input2 = btnInput2.getText().toString().substring(2);
                }
            }
        });

        findViewById(R.id.seven_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Integer tmp = 7;
                Button btnInput1 = findViewById(R.id.input1);
                Button btnInput2 = findViewById(R.id.input2);
                if(selectInput == 1){
                    if(input1.equals("0")){
                        btnInput1.setText(curr1 + tmp.toString());
                    } else btnInput1.setText(curr1 + input1 + tmp.toString());
                    input1 = btnInput1.getText().toString().substring(2);
                } else{
                    if(input2.equals("0")){
                        btnInput2.setText(curr2 + tmp.toString());
                    } else btnInput2.setText(curr2 + input2 + tmp.toString());
                    input2 = btnInput2.getText().toString().substring(2);
                }
            }
        });

        findViewById(R.id.eight_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Integer tmp = 8;
                Button btnInput1 = findViewById(R.id.input1);
                Button btnInput2 = findViewById(R.id.input2);
                if(selectInput == 1){
                    if(input1.equals("0")){
                        btnInput1.setText(curr1 + tmp.toString());
                    } else btnInput1.setText(curr1 + input1 + tmp.toString());
                    input1 = btnInput1.getText().toString().substring(2);
                } else{
                    if(input2.equals("0")){
                        btnInput2.setText(curr2 + tmp.toString());
                    } else btnInput2.setText(curr2 + input2 + tmp.toString());
                    input2 = btnInput2.getText().toString().substring(2);
                }
            }
        });

        findViewById(R.id.nine_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Integer tmp = 9;
                Button btnInput1 = findViewById(R.id.input1);
                Button btnInput2 = findViewById(R.id.input2);
                if(selectInput == 1){
                    if(input1.equals("0")){
                        btnInput1.setText(curr1 + tmp.toString());
                    } else btnInput1.setText(curr1 + input1 + tmp.toString());
                    input1 = btnInput1.getText().toString().substring(2);
                } else{
                    if(input2.equals("0")){
                        btnInput2.setText(curr2 + tmp.toString());
                    } else btnInput2.setText(curr2 + input2 + tmp.toString());
                    input2 = btnInput2.getText().toString().substring(2);
                }
            }
        });

        findViewById(R.id.dot_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, kindOfCurrency);
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, kindOfCurrency);

        Spinner currency1 = (Spinner) findViewById(R.id.currency1);
        Spinner currency2 = (Spinner) findViewById(R.id.currency2);

        currency1.setAdapter(adapter1);
        currency2.setAdapter(adapter2);

        currency1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        currency2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


    }

}