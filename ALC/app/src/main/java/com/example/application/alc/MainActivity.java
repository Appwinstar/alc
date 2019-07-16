package com.example.application.alc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button button2;
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button2 = (Button) findViewById(R.id.button2);
        button = (Button) findViewById(R.id.button);

        button2.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View v) {
                                           openActivityC();
                                       }


                                   }
        );


        button.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View v) {
                                          openActivityB();
                                      }


                                  }
        );





    }
    public void openActivityC(){
        Intent intent = new Intent(this, ActivityC.class);
        startActivity(intent);
    }

    public void openActivityB(){
        Intent intent = new Intent(this, ActivityB.class);
        startActivity(intent);
    }





}


