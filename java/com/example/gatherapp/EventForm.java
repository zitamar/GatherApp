package com.example.gatherapp;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class EventForm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_form);

        Typeface font = Typeface.createFromAsset(getAssets(),"fonts/freescpt.ttf");

        TextView eventTitle = (TextView) findViewById(R.id.event_title_text);
        eventTitle.setTypeface(font);
        TextView hostName = (TextView) findViewById(R.id.host_text);
        hostName.setTypeface(font);
        TextView place = (TextView) findViewById(R.id.place_text);
        place.setTypeface(font);
        TextView date = (TextView) findViewById(R.id.dateText);
        date.setTypeface(font);
        TextView hour = (TextView) findViewById(R.id.hourText);
        hour.setTypeface(font);
        TextView notes = (TextView) findViewById(R.id.notes_text);
        notes.setTypeface(font);


        Button submitBtn = (Button) findViewById(R.id.submit_btn);
        submitBtn.setTypeface(font);
        submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent startIntent3 = new Intent(getApplicationContext(), Main3Activity.class);
                startActivity(startIntent3);
            }
        });
    }
}
