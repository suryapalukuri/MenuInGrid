package com.example.admin.menu;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
public Button b1,b2,b3,b4,b5,b6,b7,b8,b9;
public MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(Button)findViewById(R.id.imag1);
        b2=(Button)findViewById(R.id.imag2);
        b3=(Button)findViewById(R.id.imag3);
        b4=(Button)findViewById(R.id.imag4);
        b5=(Button)findViewById(R.id.imag5);
        b6=(Button)findViewById(R.id.imag6);
        b7=(Button)findViewById(R.id.imag7);
        b8=(Button)findViewById(R.id.imag8);
        b9=(Button)findViewById(R.id.imag9);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(MainActivity.this,LoginActivity.class);
                startActivity(i);
            }
        });
b5.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent i= new Intent(MainActivity.this,Main2Activity.class);
        startActivity(i);

    }
});
    }
}
