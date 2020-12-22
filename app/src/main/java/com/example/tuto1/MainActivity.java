package com.example.tuto1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView txt_text;
    private EditText edt_text;
    private Button btnOk;
    private Button btnReset;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt_text = findViewById(R.id.txt_text);
        edt_text = findViewById(R.id.edt_text);
        btnOk = findViewById(R.id.btn_ok);
        btnReset = findViewById(R.id.btn_cancel);

        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = edt_text.getText().toString().trim();
                txt_text.setText(text);
            }
        });
        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt_text.setText("");
                txt_text.setText("");
            }
        });
    }
}