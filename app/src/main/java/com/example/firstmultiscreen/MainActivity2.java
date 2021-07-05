package com.example.firstmultiscreen;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity2 extends AppCompatActivity {

    private final String [] questions= {"Java is a person?", "Java was introduced by Varad Tari?", "Java was created using python?", "Java has abstract class?", "Java supports interfaces?"};
    private final boolean[] answers={false,false,false,true,true};
    private int index=0;
    private int score;
    Button yes;
    Button no;
    TextView Question;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        yes = findViewById(R.id.yes);
        no = findViewById(R.id.no);
        Question = findViewById(R.id.Question);
        Question.setText(questions[index]);
        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (index + 1 <= questions.length) {
                    if (answers[index]) {
                        score++;
                    }
                    index++;
                    if (index + 1 <= questions.length) {
                        Question.setText(questions[index]);
                    } else {
                        Toast.makeText(MainActivity2.this, "Your score is " + score + "/" + questions.length, Toast.LENGTH_SHORT).show();
                    }

                }

            }
        });

        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (index + 1 <= questions.length) {
                    if (!answers[index]) {
                        score++;
                    }
                    index++;
                    if (index + 1 <= questions.length) {
                        Question.setText(questions[index]);
                    } else {
                        Toast.makeText(MainActivity2.this, "Your score is " + score + "/" + questions.length, Toast.LENGTH_SHORT).show();
                    }

                }

            }
        });
   }}
