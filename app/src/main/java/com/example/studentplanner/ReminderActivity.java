package com.example.studentplanner;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TimePicker;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ReminderActivity extends AppCompatActivity {

    TimePicker timePicker;
    Button btnSetReminder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reminder);

        // Linking XML components with Java
        timePicker = findViewById(R.id.timePicker);
        btnSetReminder = findViewById(R.id.btnSetReminder);

        // Set Reminder button click
        btnSetReminder.setOnClickListener(view -> {

            int hour = timePicker.getHour();
            int minute = timePicker.getMinute();

            String message = "Reminder set at " + hour + ":" +
                    (minute < 10 ? "0" + minute : minute);

            Toast.makeText(ReminderActivity.this, message, Toast.LENGTH_LONG).show();
        });
    }
}