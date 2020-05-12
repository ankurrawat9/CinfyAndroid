package com.example.cinfysystems;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.razorpay.Checkout;
import com.razorpay.PaymentResultListener;

import org.json.JSONException;
import org.json.JSONObject;

public class PayAmount extends AppCompatActivity implements PaymentResultListener {
Button b1;
EditText e1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pay_amount);







        b1 = findViewById(R.id.button1);
        e1 = findViewById(R.id.editText1);



        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {






                startPayment();
            }
        });
















    }

    private void startPayment(){
        int amt=Integer.parseInt(e1.getText().toString());

        Checkout checkout =new Checkout();
        checkout.setImage(R.mipmap.ic_launcher);

        final Activity activity=this;

        try{
            JSONObject options =new JSONObject();
            options.put("Description","Order #12345");
            options.put("Currency","INR");
            options.put("amount",amt*100);
            checkout.open(activity,options);




        } catch (JSONException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void onPaymentSuccess(String s) {

        Toast.makeText(this, "Successful payment", Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onPaymentError(int i, String s) {


        Toast.makeText(this, "Unsuccessful payment", Toast.LENGTH_SHORT).show();

    }
}
