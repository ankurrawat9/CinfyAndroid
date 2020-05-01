package com.example.cinfysystems;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText phoneno,password;
    Button loginbtn,signupbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);















        phoneno = findViewById( R.id.phone );
        password = findViewById( R.id.pass );



        loginbtn = findViewById( R.id.loginbutton );
        signupbtn = findViewById( R.id.loginbutton3 );

        signupbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);


            }
        });



        loginbtn.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String phonenum= phoneno.getText().toString().trim();

                if(phonenum.isEmpty()) {
                    phoneno.setError( "Field can't be empty" );
                }
                if (phonenum.length()>10)  {
                    Toast.makeText(MainActivity.this,"your contact is invalid",Toast.LENGTH_SHORT).show();
                }
                String passwrd= password.getText().toString().trim();
                if (passwrd.isEmpty()) {
                    password.setError( "Field cannot be Empty" );

                }

                if (phonenum.equals("9826758769") && passwrd.equals("ankur1")){

                    Intent i=new Intent(getApplicationContext(),UserHome.class);
                    startActivity(i);

                }
            }
        });
    }}

