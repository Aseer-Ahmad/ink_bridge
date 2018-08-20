package com.example.newu.exa_ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by nEW u on 15/04/2018.
 */

public class LogIn extends AppCompatActivity {

    Button btn;
    EditText name;
    EditText pass;
    TextView register;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        btn=findViewById(R.id.button_log);
        name=findViewById(R.id.editText_name);
        pass=findViewById(R.id.editText_pass);
        register=findViewById(R.id.textView_register);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    startActivity(new Intent(LogIn.this, MainActivity.class));
            }
        });

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
