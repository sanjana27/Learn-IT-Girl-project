package com.example.hello.loginregister;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        final EditText etname=(EditText) findViewById(R.id.etname);
        final EditText etusername=(EditText) findViewById(R.id.etusername);
        final EditText etpassword=(EditText) findViewById(R.id.etpassword);
        final EditText etage=(EditText) findViewById(R.id.etage);
        final Button registerbutton= (Button) findViewById(R.id.registerbutton);

    }
}
