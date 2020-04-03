package com.example.practiceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ProgressBar progressBar1 = findViewById(R.id.pb_1);
        final ProgressBar progressBar2 = findViewById(R.id.pb_2);
        TextView plus = findViewById(R.id.tv_plus);
        TextView minus = findViewById(R.id.tv_minus);
        final TextView text = findViewById(R.id.tv_text);
        TextView iplus = findViewById(R.id.tv_inner_plus);
        TextView iminus = findViewById(R.id.tv_inner_minus);
        final TextView itext = findViewById(R.id.tv_inner_text);
        progressBar1.setMax(8);
        progressBar1.setProgress(4);
        progressBar2.setMax(5);
        progressBar2.setProgress(1);
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!text.getText().toString().equals("8"))
                    text.setText(Integer.parseInt(text.getText().toString()) + 1 + "");
                progressBar1.setMax(8);
                progressBar1.setProgress(Integer.parseInt(text.getText().toString()));
            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!text.getText().toString().equals("0"))
                    text.setText(Integer.parseInt(text.getText().toString()) - 1 + "");
                progressBar1.setProgress(Integer.parseInt(text.getText().toString()));
            }
        });
        iplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!itext.getText().toString().equals("5"))
                    itext.setText(Integer.parseInt(itext.getText().toString()) + 1 + "");
                progressBar2.setProgress(Integer.parseInt(itext.getText().toString()));
            }
        });
        iminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!itext.getText().toString().equals("0"))
                    itext.setText(Integer.parseInt(itext.getText().toString()) - 1 + "");
                progressBar2.setProgress(Integer.parseInt(itext.getText().toString()));
            }
        });
    }
}
