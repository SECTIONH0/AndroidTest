package com.example.secti.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button PB;
    Button MB;
    TextView resultT;
    EditText inputT1;
    EditText inputT2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PB = (Button)findViewById(R.id.button);
        MB = (Button)findViewById(R.id.button2);
        resultT = (TextView) findViewById(R.id.textView);
        inputT1 = (EditText)findViewById(R.id.editText2);
        inputT2 = (EditText)findViewById(R.id.editText3);

        resultT.setText("0");



            PB.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    try {
                        int i = Integer.parseInt(inputT1.getText().toString()) + Integer.parseInt(inputT2.getText().toString());

                        resultT.setText(i + "");
                    }
                    catch(Exception e)
                    {
                        e.printStackTrace();
                        resultT.setText("Error");
                    }
                }
            });

            MB.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    try {
                        int i = Integer.parseInt(inputT1.getText().toString()) - Integer.parseInt(inputT2.getText().toString());

                        resultT.setText(i + "");
                    } catch (Exception e) {
                        e.printStackTrace();
                        resultT.setText("Error");
                    }
                }
            });

    }
}
