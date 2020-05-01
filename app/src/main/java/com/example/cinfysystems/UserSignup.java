package com.example.cinfysystems;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class UserSignup extends AppCompatActivity {
    Button b1;
    EditText e1, e2, e3, e4, e5, e6, e7, e8, e9, e10;
    String a,b,c,d,e,f,g,h,i,j, h1,h2,h3,h4,h5,h6;
    RadioButton r1;
    RadioGroup radio;
    CheckBox c1,c2,c3,c4,c5,c6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_signup);


        b1 = findViewById(R.id.button1);

        e1 = findViewById(R.id.editText);
        e2 = findViewById(R.id.editText2);
        e3 = findViewById(R.id.editText3);
        e4 = findViewById(R.id.editText4);
        e5 = findViewById(R.id.editText5);
        e6 = findViewById(R.id.editText6);
        e7 = findViewById(R.id.editText7);
        e8 = findViewById(R.id.editText8);
        e9 = findViewById(R.id.editText9);
        e10 = findViewById(R.id.editText10);

        radio=(RadioGroup)findViewById(R.id.radio);


        c1=findViewById(R.id.checkBox);
        c2=findViewById(R.id.checkBox2);
        c3=findViewById(R.id.checkBox3);
        c4=findViewById(R.id.checkBox4);
        c5=findViewById(R.id.checkBox5);
        c6=findViewById(R.id.checkBox6);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a= e9.getText().toString();
                b= e10.getText().toString();
                c= e1.getText().toString();
                d= e2.getText().toString();
                e= e3.getText().toString();
                f= e4.getText().toString();
                g= e5.getText().toString();
                h= e6.getText().toString();
                i= e7.getText().toString();
                j= e8.getText().toString();

                if (a.matches("")  || b .matches("")|| c.matches("")|| d.matches("") || e.matches("") || f.matches("") || g.matches("") || h.matches("") || i.matches("") || j.matches(""))
                {

                    Toast.makeText(UserSignup.this, "kindly fill each field", Toast.LENGTH_SHORT).show();


                }





                e= e3.getText().toString();


                if (e.length()>10 || e.isEmpty()){
                    e3.setError("invalid contact number");
                }



                if(!d.contains("@") && !d.contains(".com")) {
                    e2.setError("invalid email");
                }





                if(b.contentEquals(a) && !b.matches("") && !a.matches("")){

                    Toast.makeText(UserSignup.this, "great! your password is valid", Toast.LENGTH_SHORT).show();

                }


                else
                {

                    e9.setError(" password does not match");
                }






                int selectedId= radio.getCheckedRadioButtonId();
                r1= findViewById(selectedId);


                if (selectedId==-1){

                    Toast.makeText(UserSignup.this, "gender not selected", Toast.LENGTH_SHORT).show();
                }
                else{

                    Toast.makeText(UserSignup. this,"You're gender is "+r1.getText(), Toast.LENGTH_SHORT).show();
                }



                if (c1.isChecked())

                {
                    h1=c1.getText().toString();

                }else {
                    h1="" ;

                }


                if(c2.isChecked())
                {
                    h2=c2.getText().toString();

                }else {
                    h2="";

                }

                if(c3.isChecked())
                {
                    h3=c3.getText().toString();

                }else {
                    h3="";

                }


                if(c4.isChecked())
                {
                    h4=c4.getText().toString();

                }else {
                    h4="";

                }



                if(c5.isChecked())
                {
                    h5=c5.getText().toString();

                }else {
                    h5="";

                }



                if(c6.isChecked())
                {
                    h6=c6.getText().toString();

                }else {
                    h6="";

                }

                Toast.makeText(UserSignup.this, "Your selected hobbies are :"+h1+" "+h2+" "+h3+" "+h4+" "+h5+" "+h6+" ", Toast.LENGTH_SHORT).show();



            }
        });


    }
}
