package com.example.saravanan.tictactoe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.GridLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public GridLayout gridLayout;
    public RelativeLayout relativeLayout;
    public TextView tv10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gridLayout= (GridLayout)findViewById(R.id.gridLayout);
        relativeLayout=(RelativeLayout)findViewById(R.id.relative);

        tv10=(TextView)findViewById(R.id.textView10);

        try {
            //set time in mili
            Thread.sleep(300);
            gridLayout.setVisibility(View.VISIBLE);
            Thread.sleep(300);
            tv10.setVisibility(View.VISIBLE);
            relativeLayout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent=new Intent(MainActivity.this,Game.class);
                    startActivity(intent);
                }
            });

        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
