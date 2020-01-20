package com.example.android121;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView conclusion =  findViewById(R.id.conclusion);
        final TextView name =  findViewById(R.id.name);
        final TextView mail =  findViewById(R.id.mail);
        TextView btnOk = findViewById(R.id.btnOk);

        btnOk.setOnClickListener(new View.OnClickListener() {
            @SuppressLint( "SetTextI18n" )
            @Override
            public void onClick(View view) {
                String conclusionString = getString(R.string.conclusion_format, name.getText(), mail.getText());
                conclusion.setText(conclusionString);

            }
        });
        TextView btnRemove = findViewById(R.id.btnRemove);
        btnRemove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mail.setText(null);
                name.setText(null);
                conclusion.setText(null);

    }

});

}}