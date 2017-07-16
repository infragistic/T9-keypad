package com.keypad.gautam.keypad;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public Button b1,b2,b3,b4,b5,b6,b7,b8,b9, b10;
    public EditText e1;
    public Long tsLong;
    public int ID = 10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = (Button) findViewById(R.id.button5);
        b2 = (Button) findViewById(R.id.button4);
        b3 = (Button) findViewById(R.id.button6);
        b4 = (Button) findViewById(R.id.button2);
        b5 = (Button) findViewById(R.id.button);
        b6 = (Button) findViewById(R.id.button3);
        b7 = (Button) findViewById(R.id.button10);
        b8 = (Button) findViewById(R.id.button11);
        b9 = (Button) findViewById(R.id.button12);
        b10 = (Button) findViewById(R.id.button13);
        e1 = (EditText) findViewById(R.id.editText);

        e1.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                return true;
            }
        });


        tsLong = System.currentTimeMillis()/1000;
        String ts = tsLong.toString();

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Long tstemp = (System.currentTimeMillis()/1000) - tsLong;
                tsLong = System.currentTimeMillis()/1000;
                e1.append("1");
            }
        });

        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(e1.getText().toString().length() != 0) {
                    String text = e1.getText().toString();
                    e1.setText(text.substring(0, text.length() - 1));
                }
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String arr = "abc";
                Long tstemp = (System.currentTimeMillis()/1000) - tsLong;
                tsLong = System.currentTimeMillis()/1000;
                if(ID == 2 && tstemp < 1 && e1.getText().toString().length() >0){
                    String et = e1.getText().toString();
                    char last = et.charAt(et.length()-1);
                    char next;
                    if(last == arr.charAt(0)){
                        next = arr.charAt(1);
                    }
                    else if(last == arr.charAt(1)){
                        next = arr.charAt(2);
                    }
                    else{
                        next = arr.charAt(0);
                    }
                    et = et.substring(0, et.length()-1) + next;
                    e1.setText(et);
                    ID = 2;
                }
                else{
                    e1.append("a");
                    tsLong = System.currentTimeMillis()/1000;
                    ID = 2;
                }
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String arr = "def";
                Long tstemp = (System.currentTimeMillis()/1000) - tsLong;
                tsLong = System.currentTimeMillis()/1000;
                if(ID == 3 && tstemp < 1 && e1.getText().toString().length() >0){
                    String et = e1.getText().toString();
                    char last = et.charAt(et.length()-1);
                    char next;
                    if(last == arr.charAt(0)){
                        next = arr.charAt(1);
                    }
                    else if(last == arr.charAt(1)){
                        next = arr.charAt(2);
                    }
                    else{
                        next = arr.charAt(0);
                    }
                    et = et.substring(0, et.length()-1) + next;
                    e1.setText(et);
                    ID = 3;
                }
                else{
                    e1.append("d");
                    tsLong = System.currentTimeMillis()/1000;
                    ID = 3;
                }
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String arr = "ghi";
                Long tstemp = (System.currentTimeMillis()/1000) - tsLong;
                tsLong = System.currentTimeMillis()/1000;
                if(ID == 4 && tstemp < 1 && e1.getText().toString().length() >0){
                    String et = e1.getText().toString();
                    char last = et.charAt(et.length()-1);
                    char next;
                    if(last == arr.charAt(0)){
                        next = arr.charAt(1);
                    }
                    else if(last == arr.charAt(1)){
                        next = arr.charAt(2);
                    }
                    else{
                        next = arr.charAt(0);
                    }
                    et = et.substring(0, et.length()-1) + next;
                    e1.setText(et);
                    ID = 4;
                }
                else{
                    e1.append("g");
                    tsLong = System.currentTimeMillis()/1000;
                    ID = 4;
                }
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String arr = "jkl";
                Long tstemp = (System.currentTimeMillis()/1000) - tsLong;
                tsLong = System.currentTimeMillis()/1000;
                if(ID == 5 && tstemp < 1 && e1.getText().toString().length() >0){
                    String et = e1.getText().toString();
                    char last = et.charAt(et.length()-1);
                    char next;
                    if(last == arr.charAt(0)){
                        next = arr.charAt(1);
                    }
                    else if(last == arr.charAt(1)){
                        next = arr.charAt(2);
                    }
                    else{
                        next = arr.charAt(0);
                    }
                    et = et.substring(0, et.length()-1) + next;
                    e1.setText(et);
                    ID = 5;
                }
                else{
                    e1.append("j");
                    tsLong = System.currentTimeMillis()/1000;
                    ID = 5;
                }
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String arr = "mno";
                Long tstemp = (System.currentTimeMillis()/1000) - tsLong;
                tsLong = System.currentTimeMillis()/1000;
                if(ID == 6 && tstemp < 1 && e1.getText().toString().length() >0){
                    String et = e1.getText().toString();
                    char last = et.charAt(et.length()-1);
                    char next;
                    if(last == arr.charAt(0)){
                        next = arr.charAt(1);
                    }
                    else if(last == arr.charAt(1)){
                        next = arr.charAt(2);
                    }
                    else{
                        next = arr.charAt(0);
                    }
                    et = et.substring(0, et.length()-1) + next;
                    e1.setText(et);
                    ID = 6;
                }
                else{
                    e1.append("m");
                    tsLong = System.currentTimeMillis()/1000;
                    ID = 6;
                }
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String arr = "pqrs";
                Long tstemp = (System.currentTimeMillis()/1000) - tsLong;
                tsLong = System.currentTimeMillis()/1000;
                if(ID == 7 && tstemp < 1 && e1.getText().toString().length() >0){
                    String et = e1.getText().toString();
                    char last = et.charAt(et.length()-1);
                    char next;
                    if(last == arr.charAt(0)){
                        next = arr.charAt(1);
                    }
                    else if(last == arr.charAt(1)){
                        next = arr.charAt(2);
                    }
                    else if(last == arr.charAt(2)){
                        next = arr.charAt(3);
                    }
                    else{
                        next = arr.charAt(0);
                    }
                    et = et.substring(0, et.length()-1) + next;
                    e1.setText(et);
                    ID = 7;
                }
                else{
                    e1.append("p");
                    tsLong = System.currentTimeMillis()/1000;
                    ID = 7;
                }
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String arr = "tuv";
                Long tstemp = (System.currentTimeMillis()/1000) - tsLong;
                tsLong = System.currentTimeMillis()/1000;
                if(ID == 8 && tstemp < 1 && e1.getText().toString().length() >0){
                    String et = e1.getText().toString();
                    char last = et.charAt(et.length()-1);
                    char next;
                    if(last == arr.charAt(0)){
                        next = arr.charAt(1);
                    }
                    else if(last == arr.charAt(1)){
                        next = arr.charAt(2);
                    }
                    else{
                        next = arr.charAt(0);
                    }
                    et = et.substring(0, et.length()-1) + next;
                    e1.setText(et);
                    ID = 8;
                }
                else{
                    e1.append("t");
                    tsLong = System.currentTimeMillis()/1000;
                    ID = 8;
                }
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String arr = "wxyz";
                Long tstemp = (System.currentTimeMillis()/1000) - tsLong;
                tsLong = System.currentTimeMillis()/1000;
                if(ID == 9 && tstemp < 1 && e1.getText().toString().length() >0){
                    String et = e1.getText().toString();
                    char last = et.charAt(et.length()-1);
                    char next;
                    if(last == arr.charAt(0)){
                        next = arr.charAt(1);
                    }
                    else if(last == arr.charAt(1)){
                        next = arr.charAt(2);
                    }
                    else if(last == arr.charAt(2)){
                        next = arr.charAt(3);
                    }
                    else{
                        next = arr.charAt(0);
                    }
                    et = et.substring(0, et.length()-1) + next;
                    e1.setText(et);
                    ID = 9;
                }
                else{
                    e1.append("w");
                    tsLong = System.currentTimeMillis()/1000;
                    ID = 9;
                }
            }
        });



        b1.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                e1.append("1");
                return true;
            }
        });


        b2.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                e1.append("2");
                return true;
            }
        });

        b3.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                e1.append("3");
                return true;
            }
        });

        b4.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                e1.append("4");
                return true;
            }
        });

        b5.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                e1.append("5");
                return true;
            }
        });

        b6.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                e1.append("6");
                return true;
            }
        });

        b7.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                e1.append("7");
                return true;
            }
        });

        b8.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                e1.append("8");
                return true;
            }
        });

        b9.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                e1.append("9");
                return true;
            }
        });

        b10.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                e1.setText("");
                return true;
            }
        });

    }


}
