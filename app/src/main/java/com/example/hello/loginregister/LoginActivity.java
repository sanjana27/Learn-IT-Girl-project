package com.example.hello.loginregister;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        final EditText etusername=(EditText) findViewById(R.id.etusername);
        final EditText etpassword=(EditText) findViewById(R.id.etpassword);
        final Button loginbutton=(Button) findViewById(R.id.loginbutton);
        final TextView registerlink= (TextView) findViewById(R.id.tvregisterhere);


        registerlink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registerintent=new Intent(LoginActivity.this,RegisterActivity.class);
                LoginActivity.this.startActivity(registerintent);
            }
        });

    }
}
