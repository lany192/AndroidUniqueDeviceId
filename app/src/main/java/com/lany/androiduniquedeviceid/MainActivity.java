package com.lany.androiduniquedeviceid;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.lany.uniqueid.DeviceUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView showText = (TextView) findViewById(R.id.my_text_view);
        showText.setText("唯一设备号:" + DeviceUtils.getUniqueDeviceId(this));
    }
}
