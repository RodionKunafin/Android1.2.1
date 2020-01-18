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
                conclusion.setText("Подписка на рассылку успешно оформлена для пользователя"
                        +name.getText()+ "на электронный адрес"+mail.getText());

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

     /*TextView conclusion =  findViewById(R.id.conclusion);
     TextView name =  findViewById(R.id.name);
     TextView mail =  findViewById(R.id.mail);
    public void onClickButtonOk (View view){
        TextView btnOk = findViewById(R.id.btnOk);
        btnOk.setOnClickListener(new View.OnClickListener() {
            @SuppressLint( "SetTextI18n" )
            @Override
            public void onClick(View view) {
                conclusion.setText("Подписка на рассылку успешно оформлена для пользователя"
                        +name+ "на электронный адрес"+mail);

            }
        });

    }*/
    /*public void onClickButtonRemove (View view){
        TextView btnRemove = findViewById(R.id.btnRemove);
        btnRemove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mail.setText(null);
                name.setText(null);
                conclusion.setText(null);


            }
        });
    }*/

});

}}