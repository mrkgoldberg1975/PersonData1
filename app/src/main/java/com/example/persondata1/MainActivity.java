package com.example.persondata1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvName;
    EditText eTextName;
    EditText eTextYear;
    EditText eTextPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvName=findViewById(R.id.textView2);
        eTextName=findViewById(R.id.editName);
        eTextYear=findViewById(R.id.editYear);
        eTextPassword=findViewById(R.id.editPassword);
    }

}