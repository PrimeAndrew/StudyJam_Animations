package com.miramicodigo.studyjam_ii_animations;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView iv_1;
    private ImageView iv_2;
    private ImageView aux;

    // OBJETO PARA ANIMACIONES
    private Animation animacion;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        iv_1 = (ImageView) findViewById(R.id.iv_1);
        iv_2 = (ImageView) findViewById(R.id.iv_2);

    }
    public void zoommas (View view){
        animacion = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zoom_in);
        iv_1.startAnimation(animacion);
    }
    public void zoommenos (View view){
        animacion = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zoom_dec);
        iv_1.startAnimation(animacion);
    }
    public void fadein (View view){
        animacion = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in);
        iv_1.startAnimation(animacion);
    }
    public void fadeout (View view){
        animacion = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_out);
        iv_1.startAnimation(animacion);
    }
    public void rotate (View view){
        animacion = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate);

            iv_1.startAnimation(animacion);

    }
    public void move (View view){
        animacion = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.move);
        iv_1.startAnimation(animacion);
    }
    public void slideup (View view){
        animacion = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.slide_up);
        iv_1.startAnimation(animacion);
    }
    public void slidedown (View view){
        animacion = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.slide_down);
        iv_1.startAnimation(animacion);
    }
    public void blink (View view){
        animacion = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.blink);
        iv_1.startAnimation(animacion);
    }
    public void bounce (View view){
        animacion = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.bounce);
        iv_1.startAnimation(animacion);
    }
    public void crossfade (View view){
        Animation animacion1 = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_out);
        Animation animacion2 = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in);
        iv_1.startAnimation(animacion1);
        iv_2.startAnimation(animacion2);
        //aux=iv_2;
        //iv_1=iv_2;
        //iv_2=aux;
    }
    public void sequential (View view){
        animacion = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.sequential);
        iv_1.startAnimation(animacion);
    }
    public void together (View view){
//hacer algo
    }
    public void stop(View view){
        iv_1.clearAnimation();
        iv_2.clearAnimation();
    }





}
