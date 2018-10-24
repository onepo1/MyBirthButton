package com.example.edu.mybirthbutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=(TextView)findViewById(R.id.txtview);
    }
    public void onclicked(View view){
        int id = view.getId();
        String text = ((Button)view).getText().toString();
        textView.setText(text);
    }
}
