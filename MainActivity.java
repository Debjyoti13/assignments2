package com.example.un_converter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

   RadioGroup radioGroup;
   RadioButton radiobutton;
   Button button;
   EditText text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.button);
        radioGroup=findViewById(R.id.radioGroup);
        text=findViewById(R.id.editTextTextPersonName);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int radioId=radioGroup.getCheckedRadioButtonId();
                radiobutton=findViewById(radioId);
              String s=radiobutton.getText().toString();
                if(s.equals("GRAMS")){
                          s=text.getText().toString();
                         double i=Double.parseDouble(s);
                         double grams=1000*i;

                         text.setText(""+grams);

                }
                else {
                    s=text.getText().toString();
                    double i=Double.parseDouble(s);
                    double grams=2.205*i;
                text.setText(""+grams);
                }
            }
        });

    }
    public void checkButton(View v){
        int radioId=radioGroup.getCheckedRadioButtonId();
        radiobutton=findViewById(radioId);
        Toast.makeText(this, "Selected"+radiobutton.getText(), Toast.LENGTH_SHORT).show();
    }
}