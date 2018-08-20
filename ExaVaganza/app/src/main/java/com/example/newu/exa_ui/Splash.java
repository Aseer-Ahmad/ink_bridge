package com.example.newu.exa_ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Splash extends AppCompatActivity {
    private TextView t;
    private ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        t=findViewById(R.id.splashtxt);
        img=findViewById(R.id.splashimg);
        Animation myanim= AnimationUtils.loadAnimation(this,R.anim.mytransition);
        t.startAnimation(myanim);
        img.startAnimation(myanim);

        final Intent i=new Intent(Splash.this, LogIn.class);
        Thread timer=new Thread(){
            public void run(){
                try{
                    sleep(500);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }finally {
                    startActivity(i);
                    finish();
                }

            }
        };
        timer.start();

    }
}
