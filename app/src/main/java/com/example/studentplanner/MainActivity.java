package com.example.studentplanner;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button btnTasks, btnNotes, btnReminder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Linking buttons with XML
        btnTasks = findViewById(R.id.btnTasks);
        btnNotes = findViewById(R.id.btnNotes);
        btnReminder = findViewById(R.id.btnReminder);

        // Open Task Activity
        btnTasks.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, TaskActivity.class);
            startActivity(intent);
        });

        // Open Notes Activity
        btnNotes.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, NotesActivity.class);
            startActivity(intent);
        });

        // Open Reminder Activity
        btnReminder.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, ReminderActivity.class);
            startActivity(intent);
        });
    }
}