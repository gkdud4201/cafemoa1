package com.example.cafemoa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SignupActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        TextView registerText =(TextView) findViewById(R.id.registerText);
        EditText nameText =(EditText)findViewById(R.id.nameText);
        EditText emailText =(EditText)findViewById(R.id.emailText);
        EditText phoneText =(EditText)findViewById(R.id.phoneText);
        EditText passwordText =(EditText)findViewById(R.id.passwordText);
        Button signupButton=(Button)findViewById(R.id.signupButton);

        signupButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent = new Intent(SignupActivity.this, LoginActivity.class);
                SignupActivity.this.startActivity(intent);

            }
        });

    }
}


