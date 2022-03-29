package com.example.exercise1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class activityhasil1 extends AppCompatActivity {
    TextView Task, jenistask, waktutask;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);

        Task = findViewById(R.id.hat);
        jenistask = findViewById(R.id.hajt);
        waktutask = findViewById(R.id.tak);

        Bundle bundle = getIntent().getExtras();
        String namatask = bundle.getString("c");
        String jtask = bundle.getString("d");
        String wtask = bundle.getString("e");

        Task.setText(namatask);
        jenistask.setText(jtask);
        waktutask.setText(wtask);

    }


}
