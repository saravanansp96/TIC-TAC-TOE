package com.example.saravanan.tictactoe;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class Game extends AppCompatActivity implements View.OnClickListener {
    public TextView player1,player2,tv1,tv2,tv3,tv4,tv5,tv6,tv7,tv8,tv9,Re,tap;
    public RelativeLayout relativeLayout;
    int i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game2);

        relativeLayout=(RelativeLayout)findViewById(R.id.RelativeLay);

        player1=(TextView)findViewById(R.id.pl1);
        player2=(TextView)findViewById(R.id.pl2);
        tv1=(TextView)findViewById(R.id.textView1);
        tv2=(TextView)findViewById(R.id.textView2);
        tv3=(TextView)findViewById(R.id.textView3);
        tv4=(TextView)findViewById(R.id.textView4);
        tv5=(TextView)findViewById(R.id.textView5);
        tv6=(TextView)findViewById(R.id.textView6);
        tv7=(TextView)findViewById(R.id.textView7);
        tv8=(TextView)findViewById(R.id.textView8);
        tv9=(TextView)findViewById(R.id.textView9);
        Re =(TextView)findViewById(R.id.tvResult);
        tap=(TextView)findViewById(R.id.tvtap);

        i=0;
        player1.setBackgroundColor(getResources().getColor(R.color.colorAccent));


        tv1.setOnClickListener(this);
        tv2.setOnClickListener(this);
        tv3.setOnClickListener(this);
        tv4.setOnClickListener(this);
        tv5.setOnClickListener(this);
        tv6.setOnClickListener(this);
        tv7.setOnClickListener(this);
        tv8.setOnClickListener(this);
        tv9.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        String val=null;
        String result;

        if (i % 2 != 0) {
            player1.setBackgroundColor(getResources().getColor(R.color.colorAccent));
            player2.setBackgroundColor(getResources().getColor(R.color.input_register_bg));
        } else {
            player1.setBackgroundColor(getResources().getColor(R.color.input_register_bg));
            player2.setBackgroundColor(getResources().getColor(R.color.colorAccent));
        }
        if (v.getId() == R.id.textView1)
        {
            tv1.setClickable(false);
            //val="tv1";
            if(i%2==0)
            {
                tv1.setTextColor(getResources().getColor(android.R.color.holo_red_dark));
                tv1.setText("X");
                //val=val+tv1.getText();
            }
            else
            {
                tv1.setTextColor(getResources().getColor(android.R.color.holo_blue_dark));
                tv1.setText("O");
                //val=val+tv1.getText();
            }
        }
        if (v.getId() == R.id.textView2)
        {
            tv2.setClickable(false);
            //val="tv2";
            if(i%2==0)
            {
                tv2.setTextColor(getResources().getColor(android.R.color.holo_red_dark));
                tv2.setText("X");
                //val=val+tv2.getText();
            }
            else
            {
                tv2.setTextColor(getResources().getColor(android.R.color.holo_blue_dark));
                tv2.setText("O");
                //val=val+tv2.getText();
            }
        }
        if (v.getId() == R.id.textView3)
        {
            tv3.setClickable(false);
            //val="tv3";
            if(i%2==0)
            {
                tv3.setTextColor(getResources().getColor(android.R.color.holo_red_dark));
                tv3.setText("X");
                //val=val+tv3.getText();
            }
            else
            {
                tv3.setTextColor(getResources().getColor(android.R.color.holo_blue_dark));
                tv3.setText("O");
                //val=val+tv3.getText();
            }
        }
        if (v.getId() == R.id.textView4)
        {
            tv4.setClickable(false);
            //val="tv4";
            if(i%2==0)
            {
                tv4.setTextColor(getResources().getColor(android.R.color.holo_red_dark));
                tv4.setText("X");
                //val=val+tv4.getText();
            }
            else
            {
                tv4.setTextColor(getResources().getColor(android.R.color.holo_blue_dark));
                tv4.setText("O");
                //val=val+tv4.getText();
            }
        }
        if (v.getId() == R.id.textView5)
        {
            tv5.setClickable(false);
            //val="tv5";
            if(i%2==0)
            {
                tv5.setTextColor(getResources().getColor(android.R.color.holo_red_dark));
                tv5.setText("X");
                //val=val+tv5.getText();
            }
            else
            {
                tv5.setTextColor(getResources().getColor(android.R.color.holo_blue_dark));
                tv5.setText("O");
                //val=val+tv5.getText();
            }
        }
        if (v.getId() == R.id.textView6)
        {
            tv6.setClickable(false);
            //val="tv6";
            if(i%2==0)
            {
                tv6.setTextColor(getResources().getColor(android.R.color.holo_red_dark));
                tv6.setText("X");
                //val=val+tv6.getText();
            }
            else
            {
                tv6.setTextColor(getResources().getColor(android.R.color.holo_blue_dark));
                tv6.setText("O");
                //val=val+tv6.getText();
            }
        }
        if (v.getId() == R.id.textView7)
        {
            tv7.setClickable(false);
            //val="tv7";
            if(i%2==0)
            {
                tv7.setTextColor(getResources().getColor(android.R.color.holo_red_dark));
                tv7.setText("X");
                //val=val+tv7.getText();
            }
            else
            {
                tv7.setTextColor(getResources().getColor(android.R.color.holo_blue_dark));
                tv7.setText("O");
                //val=val+tv7.getText();
            }
        }
        if (v.getId() == R.id.textView8)
        {
            tv8.setClickable(false);
            //val="tv8";
            if(i%2==0)
            {
                tv8.setTextColor(getResources().getColor(android.R.color.holo_red_dark));
                tv8.setText("X");
                //val=val+tv8.getText();
            }
            else
            {
                tv8.setTextColor(getResources().getColor(android.R.color.holo_blue_dark));
                tv8.setText("O");
                //val=val+tv8.getText();
            }
        }
        if (v.getId() == R.id.textView9)
        {
            tv9.setClickable(false);
            //val="tv9";
            if(i%2==0) {
                tv9.setTextColor(getResources().getColor(android.R.color.holo_red_dark));
                tv9.setText("X");
                //val=val+tv9.getText();
            }
            else
            {
                tv9.setTextColor(getResources().getColor(android.R.color.holo_blue_dark));
                tv9.setText("O");
                //val=val+tv9.getText();
            }
        }
        //Toast.makeText(getApplicationContext(),i+val, Toast.LENGTH_SHORT).show();

        if(tv1.getText().toString().equals(""))
            val="0";
        else
            val=tv1.getText().toString();


        if(tv2.getText().toString().equals(""))
            val+="0";
        else
            val+=tv2.getText().toString();


        if(tv3.getText().toString().equals(""))
            val+="0";
        else
            val+=tv3.getText().toString();


        if(tv4.getText().toString().equals(""))
            val+="0";
        else
            val+=tv4.getText().toString();


        if(tv5.getText().toString().equals(""))
            val+="0";
        else
            val+=tv5.getText().toString();


        if(tv6.getText().toString().equals(""))
            val+="0";
        else
            val+=tv6.getText().toString();


        if(tv7.getText().toString().equals(""))
            val+="0";
        else
            val+=tv7.getText().toString();

        if(tv8.getText().toString().equals(""))
            val+="0";
        else
            val+=tv8.getText().toString();


        if(tv9.getText().toString().equals(""))
            val+="0";
        else
            val+=tv9.getText().toString();

        result=chk(val,i);
        if(result.equals("win"))
        {
            String message;
            if(i%2==0)
            message="PLAYER 1 WINS!";
            else
                message="PLAYER 2 WINS!";

            tv1.setClickable(false);
            tv2.setClickable(false);
            tv3.setClickable(false);
            tv4.setClickable(false);
            tv5.setClickable(false);
            tv6.setClickable(false);
            tv7.setClickable(false);
            tv8.setClickable(false);
            tv9.setClickable(false);

            player1.setBackgroundColor(getResources().getColor(R.color.input_register_bg));
            player2.setBackgroundColor(getResources().getColor(R.color.input_register_bg));
            Re.setBackgroundColor(getResources().getColor(R.color.colorAccent));
            Re.setText(message);
            tap.setVisibility(View.VISIBLE);

            relativeLayout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent=new Intent(Game.this,Game.class);
                    startActivity(intent);
                }
            });


        }
        if(result.equals("draw"))
        {
            String message;
            message = "MATCH DRAW!";

            tv1.setClickable(false);
            tv2.setClickable(false);
            tv3.setClickable(false);
            tv4.setClickable(false);
            tv5.setClickable(false);
            tv6.setClickable(false);
            tv7.setClickable(false);
            tv8.setClickable(false);
            tv9.setClickable(false);

            player1.setBackgroundColor(getResources().getColor(R.color.input_register_bg));
            player2.setBackgroundColor(getResources().getColor(R.color.input_register_bg));
            Re.setBackgroundColor(getResources().getColor(R.color.colorAccent));
            Re.setText(message);
            tap.setVisibility(View.VISIBLE);

            relativeLayout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent=new Intent(Game.this,Game.class);
                    startActivity(intent);
                }
            });


        }
        i++;
    }

public String chk (String val,int d)
{
    for(int i=0;i<7;)
    {
        if((val.charAt(i)!='0')&&(val.charAt(i)==val.charAt(i+1))&&(val.charAt(i)==val.charAt(i+2)))
            return ("win");
        i+=3;
    }
    for(int i=0;i<3;i++) {
        if ((val.charAt(i) != '0') && (val.charAt(i) == val.charAt(i + 3)) && (val.charAt(i) == val.charAt(i + 6)))
            return ("win");
    }
    if((val.charAt(0)!='0')&&(val.charAt(0)==val.charAt(4))&&(val.charAt(0)==val.charAt(8)))
        return ("win");
    if((val.charAt(2)!='0')&&(val.charAt(2)==val.charAt(4))&&(val.charAt(2)==val.charAt(6)))
        return ("win");

    if(val.contains("0"))
        return("play");

    else
        return("draw");
}

    }

