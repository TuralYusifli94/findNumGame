package com.demo.findnumgame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText number;
    private TextView answer;
    private Button click;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number = findViewById(R.id.number);
        answer = findViewById(R.id.answer);
        click = findViewById(R.id.click);

        answer.setText("");
        int min = 100;
        int max = 200;
        int b = (int)(Math.random()*(max-min+1)+min);
        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int a ;

                if (!number.getText().toString().equals("")){
                    a = Integer.parseInt(number.getText().toString());

                }else {
                    a = 0;
                }
                if (a>b){
                    answer.setText("more");
                }else if (a<b){
                    answer.setText("less");
                }else {
                    answer.setText("correct");

                }


            }
        });
    }
}