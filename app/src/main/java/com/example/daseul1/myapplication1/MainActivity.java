package com.example.daseul1.myapplication1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edit1, edit2;

    Button button, button2, button3, button4, button5;

    TextView textResult;

    int num1, num2;

    Integer Result;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        setTitle("계산기");




        edit1 = (EditText) findViewById(R.id.editText);

        edit2 = (EditText) findViewById(R.id.editText2);

        button = (Button) findViewById(R.id.button);

        button2 = (Button) findViewById(R.id.button2);

        button3 = (Button) findViewById(R.id.button3);

        button4 = (Button) findViewById(R.id.button4);

        button5 = (Button) findViewById(R.id.button5);

        textResult = (TextView) findViewById(R.id.textView2);



        View.OnClickListener clisten = new View.OnClickListener() {

            public void onClick(View v) {

                num1 = Integer.parseInt(edit1.getText().toString());

                num2 = Integer.parseInt(edit2.getText().toString());

                switch(v.getId()){

                    case R.id.button :

                        Result = num1 + num2;

                        break;



                    case R.id.button2 :

                        Result = num1 - num2;

                        break;



                    case R.id.button3 :

                        Result = num1 * num2;

                        break;



                    case R.id.button4 :

                        Result = num1 / num2;

                        break;

                    case R.id.button5 :

                        Result = num1 % num2;

                        break;

                }



                textResult.setText("계산결과 : "+Result);

            }

        };

        button.setOnClickListener(clisten);

        button2.setOnClickListener(clisten);

        button3.setOnClickListener(clisten);

        button4.setOnClickListener(clisten);

    }


}
