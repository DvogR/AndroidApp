package com.example.test.test;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.annotation.IdRes;
import android.support.annotation.NonNull;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button button2;
    private EditText edit1;
    private TextView text1;
    private String password = "1111";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        button2 = (Button) findViewById(R.id.button2);
        edit1 = (EditText) findViewById(R.id.editText3);
        button2.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        Intent intent = new Intent(this, Title.class);

        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setTitle("ERROR!")
                .setMessage("Неверный пароль!")
                .setCancelable(true)
                .setPositiveButton("OK",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                // нажато "OK"
                                dialog.cancel();
                            }
                        });
        AlertDialog alert = builder.create();
            if (edit1.getText().toString().equals(password))
            {
                startActivity(intent);
            }
            else {
                alert.show();
            }
        /**/



    }


}
