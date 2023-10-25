package com.example.imagebutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ImageView image;
    ImageButton imagebtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        image=(ImageView)findViewById(R.id.imageItem);
        imagebtn=(ImageButton)findViewById(R.id.imageBtnItem);

    }

    public void ClickIt(View view)
    {
              if(R.id.imageItem==view.getId())
              {
                  Toast.makeText(MainActivity.this,"Its Image ",Toast.LENGTH_SHORT).show();
              }
        if(R.id.imageBtnItem==view.getId())
        {
            Toast.makeText(MainActivity.this,"Its Image button",Toast.LENGTH_SHORT).show();
        }
    }
}