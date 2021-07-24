package com.rharapan.batterychecker;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.os.Bundle;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import android.content.Context;
import android.os.AsyncTask;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    static final String url = "jdbc:mysql://techpointdb.cpdrujgtjz8x.us-east-2.rds.amazonaws.com:3306/techpoint”DB\u2029\"jdbc:mysql://techpointdb.cpdrujgtjz8x.us-east-2.rds.amazonaws.com:3306/techpointDB";
    static final String user = "admin";
    static final String pass = "techpoint";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.button);
        EditText editText = (EditText) findViewById(R.id.editTextTextPersonName);
        TextView textView = (TextView) findViewById(R.id.textView2);
        EditText editText2 = (EditText)findViewById(R.id.editTextTextPersonName2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("State of Health Impedance for " + editText.getText() + "  given maximum battery current of " + editText2.getText() + " is: 62.5%");
            }
        });

    }
}

