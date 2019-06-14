//package com.example.gatherapp;
//
//import android.content.Intent;
//import android.os.Bundle;
//import android.support.v7.app.AppCompatActivity;
//import android.view.View;
//import android.widget.Button;
//
//
//public class MainActivity extends AppCompatActivity {
//    private Button MapBtn;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//        MapBtn = (Button) findViewById(R.id.MapBtn);
//
//        MapBtn.setOnClickListener(new View.OnClickListener() {
//                                      @Override
//                                      public void onClick(View v) {
//                                          System.out.println("first statement");
//                                          Intent intent = new Intent(MainActivity.this, Main2Activity.class);
//                                          startActivity(intent);
//
//                                      }
//                                  }
//        );
//
//
//    }
//}





package com.example.gatherapp;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FloatingActionButton addEventBtn = (FloatingActionButton) findViewById(R.id.addEventBtn);
        addEventBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), EventForm.class);
                startActivity(startIntent);
            }
        });

        FloatingActionButton searchEventBtn = (FloatingActionButton) findViewById(R.id.searchEventBtn);
        searchEventBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent start2Intent = new Intent(getApplicationContext(), Main2Activity.class);
                startActivity(start2Intent);
            }
        });

    }
}