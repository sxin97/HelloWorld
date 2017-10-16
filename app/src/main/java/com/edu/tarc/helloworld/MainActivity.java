package com.edu.tarc.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //Global area
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //R = resources class
        //Display this UI
        setContentView(R.layout.activity_main);
    }
    //View class - refers to any UI component
    public void displayName(View v){
        // Define a variable of type TextView
        TextView textViewName;
        EditText editTextName;
        EditText editTextAge;


        //Link UI to variable
        textViewName = (TextView)findViewById(R.id.textView);
        editTextName = (EditText)findViewById(R.id.editTextName);
        editTextAge = (EditText)findViewById(R.id.editTextAge);
        int age = Integer.parseInt(editTextAge.getText().toString());


        textViewName.setText(getString(R.string.greeting)+ " " + editTextName.getText()+","+getString(R.string.ageText1)+ (age+1) +getString(R.string.ageText2));
    }

}
