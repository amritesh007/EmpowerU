package com.android.amritesh.empoweru;

import android.content.Intent;
import android.provider.MediaStore;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class getDetails extends AppCompatActivity {

    EditText firstName, lastName, et_email, et_number, et_address;
    String name, address, email, number;
    Button submit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_details);
        firstName=(EditText)findViewById(R.id.firstName);
        lastName=(EditText)findViewById(R.id.lastName);
        et_email=(EditText)findViewById(R.id.email);
       et_number=(EditText)findViewById(R.id.contactNumber);
        et_address=(EditText)findViewById(R.id.address);
        submit=(Button)findViewById(R.id.btnsbmt);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                variableClass.name=firstName.getText().toString()+" "+lastName.getText().toString();
                variableClass.address = et_address.getText().toString();
                variableClass.email=et_email.getText().toString();
                variableClass.number=et_number.getText().toString();
                Intent i = new Intent(getDetails.this, showDetails.class);
                startActivity(i);
            }
        });



    }
}