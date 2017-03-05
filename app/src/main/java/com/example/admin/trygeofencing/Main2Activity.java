package com.example.admin.trygeofencing;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    private static String mess;
    private TextView msg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        msg = (TextView)findViewById(R.id.msg);
        msg.setText(mess);
    }

    public static Intent makeNotificationIntent(Context applicationContext, String s) {
        Intent i = new Intent(applicationContext, Main2Activity.class);
        mess=s;
        return i;
    }
}
