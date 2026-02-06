package com.example.studentplanner;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class TaskActivity extends AppCompatActivity {

    EditText etTask;
    Button btnAddTask;
    TextView tvTask;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task);

        // Connecting XML views with Java
        etTask = findViewById(R.id.etTask);
        btnAddTask = findViewById(R.id.btnAddTask);
        tvTask = findViewById(R.id.tvTask);

        // Button click event
        btnAddTask.setOnClickListener(view -> {
            String task = etTask.getText().toString();

            if (task.isEmpty()) {
                tvTask.setText("Please enter a task");
            } else {
                tvTask.setText("Task: " + task);
            }
        });
    }
}