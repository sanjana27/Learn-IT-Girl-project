package com.example.hello.loginregister;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class UserAreaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_area);
        final TextView etwelcomemsg= (TextView) findViewById(R.id.etwelcomemsg);
        final EditText etusername=(EditText) findViewById(R.id.etusername);
        final EditText etage=(EditText) findViewById(R.id.etage);
    }
}
