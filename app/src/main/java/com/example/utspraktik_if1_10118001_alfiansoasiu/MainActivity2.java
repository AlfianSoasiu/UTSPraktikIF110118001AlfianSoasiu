package com.example.utspraktik_if1_10118001_alfiansoasiu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        //GET THE
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        // CAPTURE
        TextView textView = findViewById(R.id.unik);
        textView.setText(message);

        TextView textView2 = findViewById(R.id.unama);
        textView2.setText(message);

        TextView textView3 = findViewById(R.id.udate);
        textView3.setText(message);

    }

}
