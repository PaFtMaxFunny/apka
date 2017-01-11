package com.example.student.apka;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class CokolwiekActivity extends Activity implements View.OnClickListener {
    Button but1;
    TextView text1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cokolwiek);
        but1=(Button)findViewById(R.id.przycisk1);
        text1=(TextView)findViewById(R.id.tekst);
    }



    @Override
    public void onClick(View v) {
       text1.setText("cokolwiek");
    }
}
