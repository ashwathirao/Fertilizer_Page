package com.example.fertilizer_page;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.TextureView;
import android.widget.TextView;

public class Result extends AppCompatActivity {

    TextView tv,tv1,tv2,tv3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        tv=(TextView) findViewById(R.id.display_crop);
        tv1=(TextView) findViewById(R.id.display_N);
        tv2=(TextView) findViewById(R.id.display_P);
        tv3=(TextView) findViewById(R.id.display_K);

        tv.setText(getIntent().getStringExtra("Name"));
        tv1.setText(String.valueOf(getIntent().getIntExtra("value1",0)));
        tv2.setText(String.valueOf(getIntent().getIntExtra("value2",0)));
        tv3.setText(String.valueOf(getIntent().getIntExtra("value3",0)));
    }
}
