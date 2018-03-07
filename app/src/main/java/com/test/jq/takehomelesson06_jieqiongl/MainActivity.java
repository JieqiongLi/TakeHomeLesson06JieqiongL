package com.test.jq.takehomelesson06_jieqiongl;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText amountEdit;
    private EditText taxPercentageEdit;
    private EditText tipPercentageEdit;
    private double amount;
    private double taxPercentage;
    private double tipPercentage;
    private double totalPrice;
    private Receipt receipt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        amountEdit = (EditText) findViewById(R.id.amount_edit);
        taxPercentageEdit = (EditText) findViewById(R.id.tax_percentage_edit);
        tipPercentageEdit = (EditText) findViewById(R.id.tip_percentage_edit);
        Button submitButton = (Button) findViewById(R.id.submit_button);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                amount = Double.parseDouble(amountEdit.getText().toString());
                taxPercentage = Double.parseDouble(taxPercentageEdit.getText().toString());
                tipPercentage = Double.parseDouble(tipPercentageEdit.getText().toString());
                totalPrice = amount + amount * taxPercentage + amount * tipPercentage;

                receipt = new Receipt(amount, taxPercentage, tipPercentage, totalPrice);
                Intent intent = new Intent(v.getContext(), SummaryActivity.class);
                intent.putExtra(Keys.RECEIPT_KEY, receipt);
                startActivity(intent);
            }
        });
    }
}
