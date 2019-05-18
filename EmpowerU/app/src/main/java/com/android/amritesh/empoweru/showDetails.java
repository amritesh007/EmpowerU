package com.android.amritesh.empoweru;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class showDetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_details);
        TextView name, email, address, number;
        name=(TextView)findViewById(R.id.showName);
        name.setText(variableClass.name);
        email=(TextView)findViewById(R.id.showEmail);
        email.setText(variableClass.email);
        address=(TextView)findViewById(R.id.showAddress);
        address.setText(variableClass.address);
        number=(TextView)findViewById(R.id.showNumber);
        number.setText(variableClass.number);
    }

}
