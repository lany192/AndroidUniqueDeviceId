package com.lany.androiduniquedeviceid;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView showText = (TextView) findViewById(R.id.my_text);
        showText.setText(Utils.getUniqueDeviceId(this));
    }
}
