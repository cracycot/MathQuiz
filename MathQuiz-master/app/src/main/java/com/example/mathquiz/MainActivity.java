package com.example.mathquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends Activity {
    TextView problem;
    TextView text1;
    TextView text2;
    TextView text3;
    MathGenerator mathGenerator = new MathGenerator();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupUI();
        problem.setText(mathGenerator.getProblem());
        String s = mathGenerator.getProblem();
        problem.setText(s);
        generateAnswers();
    }

    private void setupUI() {
        problem = findViewById(R.id.problem);
        text1 = findViewById(R.id.text1);
        text2 = findViewById(R.id.text2);
        text3 = findViewById(R.id.text3);
    }
    prvate void generateAnswers{
        int position = mathGeneration.getRandom(4, 1);
        if(position == 1){
            text1.setText(mathGenerator.getResult());
            text2.setText(mathGenerator.getResult());
            text3.setText(mathGenerator.getResult());

        }
        else if(position == 2){
            text1.setText(mathGenerator.getResult());
            text2.setText(mathGenerator.getResult());
            text3.setText(mathGenerator.getResult());

        }
        else if(position == 3){
            text1.setText(mathGenerator.getResult());
            text2.setText(mathGenerator.getResult());
            text3.setText(mathGenerator.getResult());

        }
    }
}