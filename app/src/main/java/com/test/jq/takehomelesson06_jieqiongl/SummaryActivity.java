package com.test.jq.takehomelesson06_jieqiongl;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SummaryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary);
        TextView display = findViewById(R.id.summary_text);

        Intent myIntent = getIntent();
        Receipt myReceipt = (Receipt) myIntent.getSerializableExtra(Keys.RECEIPT_KEY);
        display.setText(myReceipt.toString());
    }
}
