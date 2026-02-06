package com.example.studentplanner;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class NotesActivity extends AppCompatActivity {

    EditText etNotes;
    Button btnSaveNote;
    TextView tvNotes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notes);

        // Connecting XML components with Java
        etNotes = findViewById(R.id.etNotes);
        btnSaveNote = findViewById(R.id.btnSaveNote);
        tvNotes = findViewById(R.id.tvNotes);

        // Save Note button logic
        btnSaveNote.setOnClickListener(view -> {
            String note = etNotes.getText().toString();

            if (note.isEmpty()) {
                tvNotes.setText("Please write a note first");
            } else {
                tvNotes.setText("Saved Note:\n" + note);
            }
        });
    }
}