package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b=(Button)findViewById(R.id.but);
    }
    public void ww(View view){
        Toast toast = Toast.makeText(this, "aooo",
                //make test ==new
                Toast.LENGTH_SHORT);
        toast.show();
    }

}
