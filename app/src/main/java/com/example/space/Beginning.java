 package com.example.space;

 import android.app.Activity;
 import android.content.Intent;
 import android.os.Bundle;
 import android.view.View;
 import android.view.animation.Animation;
 import android.view.animation.AnimationUtils;
 import android.widget.Button;
 import android.widget.TextView;

 import java.io.IOException;


 public class Beginning extends Activity {
     public int l = 0;
     int c = 0;

     Background text1 = new Background();

     TextView text, text2, text3, text4, text5, text6, text7, text8;
     Button button;

     @Override
     protected void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);

         init();

         Thread threadInterface = new Thread(new InterfaceUpdater());
         threadInterface.start();

         Thread threadTime = new Thread(new TextProgress());
         threadTime.start();
     }

     class TextProgress implements Runnable {
         @Override
         public void run() {
             for(l = 0; l <= 10; l++){
                 try {
                     Thread.sleep(100);// 1000
                 } catch (InterruptedException e) {
                     break;
                 }
             }

         }
     }

     class InterfaceUpdater implements Runnable {
         @Override
         public void run() {
             do{
                 update();
                 try {
                     Thread.sleep(18);
                 } catch (InterruptedException e) {
                     break;
                 }
             }while (l < 10);
         }
     }

     void init(){
         setContentView(R.layout.beginning);

         text = findViewById(R.id.textView);
         text2 = findViewById(R.id.textView2);
         text3 = findViewById(R.id.textView3);
         text4 = findViewById(R.id.textView4);
         text5 = findViewById(R.id.textView5);
         text6 = findViewById(R.id.textView6);
         text7 = findViewById(R.id.textView7);
         text8 = findViewById(R.id.textView8);
         button = findViewById(R.id.button);

         text.setText(text1.text_s[0]);
         text2.setText(text1.text_s2[0]);
         text3.setText(text1.text_s3[0]);
         text4.setText(text1.text_s4[0]);
         text5.setText(text1.text_s5[0]);
         text6.setText(text1.text_s6[0]);
         text7.setText(text1.text_s7[0]);
         text8.setText(text1.text_s8[0]);

         text.setVisibility(View.INVISIBLE);
         text2.setVisibility(View.INVISIBLE);
         text3.setVisibility(View.INVISIBLE);
         text4.setVisibility(View.INVISIBLE);
         text5.setVisibility(View.INVISIBLE);
         text6.setVisibility(View.INVISIBLE);
         text7.setVisibility(View.INVISIBLE);
         text8.setVisibility(View.INVISIBLE);
         button.setVisibility(View.INVISIBLE);
     }


     private void update() {
         if(c == l) return;
         c = l;
         runOnUiThread(new Runnable() {
             @Override
             public void run() {

                 Animation textAnim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha);
                 /*Animation textAnim2 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha2);
                 Animation textAnim3 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha3);
                 Animation textAnim4 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha4);
                 Animation textAnim5 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha5);
                 Animation textAnim6 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha6);
                 Animation textAnim7 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha7);
                 Animation textAnim8 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha8);
                 Animation butAnim9 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha9);*/

                 switch (l) {
                     case 1:
                         text.setVisibility(View.VISIBLE);
                         text.startAnimation(textAnim);
                         break;
                     case 2:
                         text2.setVisibility(View.VISIBLE);
                         text2.startAnimation(textAnim);
                         break;
                     case 3:
                         text3.setVisibility(View.VISIBLE);
                         text3.startAnimation(textAnim);
                         break;
                     case 4:
                         text4.setVisibility(View.VISIBLE);
                         text4.startAnimation(textAnim);
                         break;
                     case 5:
                         text5.setVisibility(View.VISIBLE);
                         text5.startAnimation(textAnim);
                         break;
                     case 6:
                         text6.setVisibility(View.VISIBLE);
                         text6.startAnimation(textAnim);
                         break;
                     case 7:
                         text7.setVisibility(View.VISIBLE);
                         text7.startAnimation(textAnim);
                         break;
                     case 8:
                         text8.setVisibility(View.VISIBLE);
                         text8.startAnimation(textAnim);
                         break;
                     case 9:
                         button.setVisibility(View.VISIBLE);
                         button.startAnimation(textAnim);
                         button.setOnClickListener(new View.OnClickListener() {
                             @Override
                             public void onClick(View view) {
                                 try {
                                     Intent intent = new Intent(Beginning.this, Story.class);
                                     startActivity(intent);
                                 } catch (Exception e) {
                                     e.printStackTrace();
                                 }

                             }
                         });

                     default:
                         break;
                 }
             }
         });
     }
 }

