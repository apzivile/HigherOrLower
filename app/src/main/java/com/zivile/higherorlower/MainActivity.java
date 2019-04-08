package com.zivile.higherorlower;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int randomNum;

    public void makeToast(String string) {
        Toast.makeText(this, string, Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Random r = new Random();
        randomNum = r.nextInt(20) + 1;
    }

    public void clickFunction(View view) {


        EditText inputText = findViewById(R.id.inputText);
        int input = Integer.parseInt(inputText.getText().toString());
//        Log.i("Test", inputText.getText().toString());

        if (input < randomNum) {
            makeToast("Higher!");
        } else if (input > randomNum) {
            makeToast("Lower!");
        } else {
            makeToast("Correct! Try again.");
            Random b = new Random();
            randomNum = b.nextInt(20) + 1;
        }
    }
}
