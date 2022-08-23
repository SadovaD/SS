 package com.example.space;


 import android.app.Activity;
 import android.content.Intent;
 import android.os.Bundle;
 import android.view.View;
 import android.view.animation.Animation;
 import android.view.animation.AnimationUtils;
 import android.widget.Button;
 import android.widget.TextView;


 public class Story extends Activity {
     public volatile int l = 0;
     int c = 0;

     Basic_Text text1 = new Basic_Text();

     TextView text, text2, text3, text4, text5, text6, text7, text8,
             text9, text10, text11, text12, text13, text14, text15, text16, text17, text18,
             text19, text20, text21, text22, text23, text24, text25, text26, text27, text28, text29, text30;
     Button button, button2, button3, button4, button5, button6, button7, button8, button9, button10,
             button11, button12, button13, button14, button15, button16, button17;

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
             for (l = 0; l <= 26; l++) {
                     try {
                         Thread.sleep(1000);

                     } catch (InterruptedException e) {
                         break;
                     }
                     //while (l < 10);
                 }
           }
         }


         class InterfaceUpdater implements Runnable {
             @Override
             public void run() {
                 do {
                     update();
                     try {
                         Thread.sleep(17);
                     } catch (InterruptedException e) {
                         break;
                     }
                 } while (l < 27);
             }
         }

         void init() {
             setContentView(R.layout.story);

             text = findViewById(R.id.textView);
             button = findViewById(R.id.button);
             button2 = findViewById(R.id.button2);
             text2 = findViewById(R.id.textView2);
             text3 = findViewById(R.id.textView3);
             text4 = findViewById(R.id.textView4);
             button3 = findViewById(R.id.button3);
             button4 = findViewById(R.id.button4);
             text5 = findViewById(R.id.textView5);
             text6 = findViewById(R.id.textView6);
             button5 = findViewById(R.id.button5);
             button6 = findViewById(R.id.button6);
             text7 = findViewById(R.id.textView7);
             text8 = findViewById(R.id.textView8);
             text9 = findViewById(R.id.textView9);
             text10 = findViewById(R.id.textView10);
             text11 = findViewById(R.id.textView11);
             text12 = findViewById(R.id.textView12);
             text13 = findViewById(R.id.textView13);
             text14 = findViewById(R.id.textView14);
             text15 = findViewById(R.id.textView15);
             button7 = findViewById(R.id.button7);
             button8 = findViewById(R.id.button8);
             text16 = findViewById(R.id.textView16);
             text17 = findViewById(R.id.textView17);
             text18 = findViewById(R.id.textView18);
             button9 = findViewById(R.id.button9);
             button10 = findViewById(R.id.button10);
             text19 = findViewById(R.id.textView19);
             text20 = findViewById(R.id.textView20);
             text21 = findViewById(R.id.textView21);
             text22 = findViewById(R.id.textView22);
             text23 = findViewById(R.id.textView23);
             button11 = findViewById(R.id.button11);
             button12 = findViewById(R.id.button12);
             text24 = findViewById(R.id.textView24);
             text25 = findViewById(R.id.textView25);
             button13 = findViewById(R.id.button13);
             button14 = findViewById(R.id.button14);
             text26 = findViewById(R.id.textView26);
             text27 = findViewById(R.id.textView27);
             text28 = findViewById(R.id.textView28);
             button15 = findViewById(R.id.button15);
             button16 = findViewById(R.id.button16);
             button17 = findViewById(R.id.button17);
             text29 = findViewById(R.id.textView29);
             text30 = findViewById(R.id.textView30);

             text.setText(text1.scenario1[0]);
             text2.setText(text1.scenario2[0]);
             text3.setText(text1.scenario3[0]);
             text4.setText(text1.scenario4[0]);
             text5.setText(text1.scenario5[0]);
             text6.setText(text1.scenario6[0]);
             text7.setText(text1.scenario7[0]);
             text8.setText(text1.scenario8[0]);
             text9.setText(text1.scenario9[0]);
             text10.setText(text1.scenario10[0]);
             text11.setText(text1.scenario11[0]);
             text12.setText(text1.scenario12[0]);
             text13.setText(text1.scenario13[0]);
             text14.setText(text1.scenario14[0]);
             text15.setText(text1.scenario15[0]);
             text16.setText(text1.scenario16[0]);
             text17.setText(text1.scenario17[0]);
             text18.setText(text1.scenario18[0]);
             text19.setText(text1.scenario19[0]);
             text20.setText(text1.scenario20[0]);
             text21.setText(text1.scenario21[0]);
             text22.setText(text1.scenario22[0]);
             text23.setText(text1.scenario23[0]);
             text24.setText(text1.scenario24[0]);
             text25.setText(text1.scenario25[0]);
             text26.setText(text1.scenario26[0]);
             text27.setText(text1.scenario27[0]);
             text28.setText(text1.scenario28[0]);
             text29.setText(text1.scenario29[0]);
             text30.setText(text1.scenario30[0]);

             text.setVisibility(View.INVISIBLE);
             text2.setVisibility(View.INVISIBLE);
             text3.setVisibility(View.INVISIBLE);
             text4.setVisibility(View.INVISIBLE);
             text5.setVisibility(View.INVISIBLE);
             text6.setVisibility(View.INVISIBLE);
             text7.setVisibility(View.INVISIBLE);
             text8.setVisibility(View.INVISIBLE);
             text9.setVisibility(View.INVISIBLE);
             text10.setVisibility(View.INVISIBLE);
             text11.setVisibility(View.INVISIBLE);
             text12.setVisibility(View.INVISIBLE);
             text13.setVisibility(View.INVISIBLE);
             text14.setVisibility(View.INVISIBLE);
             text15.setVisibility(View.INVISIBLE);
             text16.setVisibility(View.INVISIBLE);
             text17.setVisibility(View.INVISIBLE);
             text18.setVisibility(View.INVISIBLE);
             text19.setVisibility(View.INVISIBLE);
             text20.setVisibility(View.INVISIBLE);
             text21.setVisibility(View.INVISIBLE);
             text22.setVisibility(View.INVISIBLE);
             text23.setVisibility(View.INVISIBLE);
             text24.setVisibility(View.INVISIBLE);
             text25.setVisibility(View.INVISIBLE);
             text26.setVisibility(View.INVISIBLE);
             text27.setVisibility(View.INVISIBLE);
             text28.setVisibility(View.INVISIBLE);
             text29.setVisibility(View.INVISIBLE);
             text30.setVisibility(View.INVISIBLE);

             button.setVisibility(View.INVISIBLE);
             button2.setVisibility(View.INVISIBLE);
             button3.setVisibility(View.INVISIBLE);
             button4.setVisibility(View.INVISIBLE);
             button5.setVisibility(View.INVISIBLE);
             button6.setVisibility(View.INVISIBLE);
             button7.setVisibility(View.INVISIBLE);
             button8.setVisibility(View.INVISIBLE);
             button9.setVisibility(View.INVISIBLE);
             button10.setVisibility(View.INVISIBLE);
             button11.setVisibility(View.INVISIBLE);
             button12.setVisibility(View.INVISIBLE);
             button13.setVisibility(View.INVISIBLE);
             button14.setVisibility(View.INVISIBLE);
             button15.setVisibility(View.INVISIBLE);
             button16.setVisibility(View.INVISIBLE);
             button17.setVisibility(View.INVISIBLE);
         }


         private void update() {
             if (c == l) return;
             c = l;
             runOnUiThread(new Runnable() {
                 @Override
                 public void run() {
                     Animation textAnim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha);
                        Animation butAnim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha);
                        Animation butAnim2 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha);
                     Animation textAnim2 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha2);
                     Animation textAnim3 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha2);
                     Animation textAnim4 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha3);
                        Animation butAnim3 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha3);
                        Animation butAnim4 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha3);
                     Animation textAnim5 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha2);
                     Animation textAnim6 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha4);
                        Animation butAnim5 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha4);
                        Animation butAnim6 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha4);
                     Animation textAnim7 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha2);
                     Animation textAnim8 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha2);
                     Animation textAnim9 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha5);
                     Animation textAnim10 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha6);
                     Animation textAnim11 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha11);
                     Animation textAnim12 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha12);
                     Animation textAnim13 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha13);
                     Animation textAnim14 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha14);
                     Animation textAnim15 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha15);
                        Animation butAnim7 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha3);
                        Animation butAnim8 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha3);
                     Animation textAnim16 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha2);
                     Animation textAnim17 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha2);
                     Animation textAnim18 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha18);
                        Animation butAnim9 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha3);
                        Animation butAnim10 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha3);
                     Animation textAnim19 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha2);
                     Animation textAnim20 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha20);
                     Animation textAnim21 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha21);
                   Animation textAnim22 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha22);
                     Animation textAnim23 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha23);
                        Animation butAnim11 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha3);
                        Animation butAnim12 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha3);
                     Animation textAnim24 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha2);
                     Animation textAnim25 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha25);
                        Animation butAnim13 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha3);
                        Animation butAnim14 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha3);
                     Animation textAnim26 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha2);
                     Animation textAnim27 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha2);
                     Animation textAnim28 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha28);
                        Animation butAnim15 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha3);
                        Animation butAnim16 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha3);
                        Animation butAnim17 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha3);
                     Animation textAnim29 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha2);
                     Animation textAnim30 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha30);


                     switch (l) {
                         case 1:
                             text.setVisibility(View.VISIBLE);
                             text.startAnimation(textAnim);
                             break;
                         case 2:
                             button.setVisibility(View.VISIBLE);
                             button.startAnimation(butAnim);
                             button.setOnClickListener(new View.OnClickListener() {
                                 @Override
                                 public void onClick(View v) {
                                         try {
                                                 text2.setVisibility(View.VISIBLE);
                                                 text2.startAnimation(textAnim2);
                                                 text3.setVisibility(View.GONE);
                                         } catch (Exception e) {
                                         }
                                 }
                             });
                             button2.setVisibility(View.VISIBLE);
                             button2.startAnimation(butAnim2);
                             button2.setOnClickListener(new View.OnClickListener() {
                                 @Override
                                 public void onClick(View v) {
                                         try {
                                             text3.setVisibility(View.VISIBLE);
                                             text3.startAnimation(textAnim3);
                                             text2.setVisibility(View.GONE);
                                         } catch (Exception e) {
                                         }
                                     }
                             });
                             break;
                         case 3:
                             text4.setVisibility(View.VISIBLE);
                             text4.startAnimation(textAnim4);
                             break;
                         case 4:
                             button3.setVisibility(View.VISIBLE);
                             button3.startAnimation(butAnim3);
                             button4.setVisibility(View.VISIBLE);
                             button4.startAnimation(butAnim4);
                             button3.setOnClickListener(new View.OnClickListener() {
                                 @Override
                                 public void onClick(View v) {
                                     try {
                                         text5.setVisibility(View.VISIBLE);
                                         text5.startAnimation(textAnim5);
                                     } catch (Exception e) {
                                     }
                                 }
                             });
                             button4.setOnClickListener(new View.OnClickListener() {
                                 @Override
                                 public void onClick(View v) {
                                     try {
                                         text5.setVisibility(View.GONE);
                                     } catch (Exception e) {
                                     }
                                 }
                             });
                             break;
                         case 5:
                             text6.setVisibility(View.VISIBLE);
                             text6.startAnimation(textAnim6);
                             break;
                         case 6:
                             button5.setVisibility(View.VISIBLE);
                             button5.startAnimation(butAnim5);
                             button6.setVisibility(View.VISIBLE);
                             button6.startAnimation(butAnim6);
                             button5.setOnClickListener(new View.OnClickListener() {
                                 @Override
                                 public void onClick(View v) {
                                     try {
                                         text7.setVisibility(View.VISIBLE);
                                         text7.startAnimation(textAnim7);
                                         text8.setVisibility(View.GONE);
                                     } catch (Exception e) {
                                     }
                                 }
                             });
                             button6.setOnClickListener(new View.OnClickListener() {
                                 @Override
                                 public void onClick(View v) {
                                     try {
                                         text8.setVisibility(View.VISIBLE);
                                         text8.startAnimation(textAnim8);
                                         text7.setVisibility(View.GONE);
                                     } catch (Exception e) {
                                     }
                                 }
                             });
                             break;
                         case 7:
                             text9.setVisibility(View.VISIBLE);
                             text9.startAnimation(textAnim9);
                             break;
                         case 8:
                             text10.setVisibility(View.VISIBLE);
                             text10.startAnimation(textAnim10);
                             break;
                         case 9:
                             text11.setVisibility(View.VISIBLE);
                             text11.startAnimation(textAnim11);
                             break;
                         case 10:
                             text12.setVisibility(View.VISIBLE);
                             text12.startAnimation(textAnim12);
                             break;
                         case 11:
                             text13.setVisibility(View.VISIBLE);
                             text13.startAnimation(textAnim13);
                             break;
                         case 12:
                             text14.setVisibility(View.VISIBLE);
                             text14.startAnimation(textAnim14);
                             break;
                         case 13:
                             text15.setVisibility(View.VISIBLE);
                             text15.startAnimation(textAnim15);
                             break;
                         case 14:
                             button7.setVisibility(View.VISIBLE);
                             button7.startAnimation(butAnim7);
                             button8.setVisibility(View.VISIBLE);
                             button8.startAnimation(butAnim8);
                             button7.setOnClickListener(new View.OnClickListener() {
                                 @Override
                                 public void onClick(View v) {
                                     try {
                                         text16.setVisibility(View.VISIBLE);
                                         text16.startAnimation(textAnim16);
                                         text17.setVisibility(View.GONE);
                                     } catch (Exception e) {
                                     }
                                 }
                             });
                             button8.setOnClickListener(new View.OnClickListener() {
                                 @Override
                                 public void onClick(View v) {
                                     try {
                                         text17.setVisibility(View.VISIBLE);
                                         text17.startAnimation(textAnim17);
                                         text16.setVisibility(View.GONE);
                                     } catch (Exception e) {
                                     }
                                 }
                             });
                             break;
                         case 15:
                             text18.setVisibility(View.VISIBLE);
                             text18.startAnimation(textAnim18);
                             break;
                         case 16:
                             button9.setVisibility(View.VISIBLE);
                             button9.startAnimation(butAnim9);
                             button10.setVisibility(View.VISIBLE);
                             button10.startAnimation(butAnim10);
                             button9.setOnClickListener(new View.OnClickListener() {
                                 @Override
                                 public void onClick(View v) {
                                     try {
                                         text19.setVisibility(View.VISIBLE);
                                         text19.startAnimation(textAnim19);
                                     } catch (Exception e) {
                                     }
                                 }
                             });
                             button10.setOnClickListener(new View.OnClickListener() {
                                 @Override
                                 public void onClick(View v) {
                                     try {
                                         text19.setVisibility(View.GONE);
                                     } catch (Exception e) {
                                     }
                                 }
                             });
                             break;
                         case 17:
                             text20.setVisibility(View.VISIBLE);
                             text20.startAnimation(textAnim20);
                             break;
                         case 18:
                             text21.setVisibility(View.VISIBLE);
                             text21.startAnimation(textAnim21);
                             break;
                         case 19:
                             text22.setVisibility(View.VISIBLE);
                             text22.startAnimation(textAnim22);
                             break;
                         case 20:
                             text23.setVisibility(View.VISIBLE);
                             text23.startAnimation(textAnim23);
                             break;
                         case 21:
                             button11.setVisibility(View.VISIBLE);
                             button11.startAnimation(butAnim11);
                             button12.setVisibility(View.VISIBLE);
                             button12.startAnimation(butAnim12);
                             button11.setOnClickListener(new View.OnClickListener() {
                                 @Override
                                 public void onClick(View v) {
                                     try {
                                         text24.setVisibility(View.GONE);
                                     } catch (Exception e) {
                                     }
                                 }
                             });
                             button12.setOnClickListener(new View.OnClickListener() {
                                 @Override
                                 public void onClick(View v) {
                                     try {
                                         text24.setVisibility(View.VISIBLE);
                                         text24.startAnimation(textAnim24);
                                     } catch (Exception e) {
                                     }
                                 }
                             });
                             break;
                         case 22:
                             text25.setVisibility(View.VISIBLE);
                             text25.startAnimation(textAnim25);
                             break;
                         case 23:
                             button13.setVisibility(View.VISIBLE);
                             button13.startAnimation(butAnim13);
                             button14.setVisibility(View.VISIBLE);
                             button14.startAnimation(butAnim14);
                             button13.setOnClickListener(new View.OnClickListener() {
                                 @Override
                                 public void onClick(View v) {
                                     try {
                                         text26.setVisibility(View.VISIBLE);
                                         text26.startAnimation(textAnim26);
                                         text27.setVisibility(View.GONE);
                                     } catch (Exception e) {
                                     }
                                 }
                             });
                             button14.setOnClickListener(new View.OnClickListener() {
                                 @Override
                                 public void onClick(View v) {
                                     try {
                                         text27.setVisibility(View.VISIBLE);
                                         text27.startAnimation(textAnim27);
                                         text26.setVisibility(View.GONE);
                                     } catch (Exception e) {
                                     }
                                 }
                             });
                             break;
                         case 24:
                             text28.setVisibility(View.VISIBLE);
                             text28.startAnimation(textAnim28);
                             break;
                         case 25:
                             button15.setVisibility(View.VISIBLE);
                             button15.startAnimation(butAnim15);
                             button16.setVisibility(View.VISIBLE);
                             button16.startAnimation(butAnim16);
                             button17.setVisibility(View.VISIBLE);
                             button17.startAnimation(butAnim17);
                             button15.setOnClickListener(new View.OnClickListener() {
                                 @Override
                                 public void onClick(View v) {
                                     try {
                                         text29.setVisibility(View.VISIBLE);
                                         text29.startAnimation(textAnim29);
                                     } catch (Exception e) {
                                     }
                                 }
                             });
                             button16.setOnClickListener(new View.OnClickListener() {
                                 @Override
                                 public void onClick(View v) {
                                     try {
                                         text29.setVisibility(View.VISIBLE);
                                         text29.startAnimation(textAnim29);
                                     } catch (Exception e) {
                                     }
                                 }
                             });
                             button17.setOnClickListener(new View.OnClickListener() {
                                 @Override
                                 public void onClick(View v) {
                                     try {
                                         text29.setVisibility(View.VISIBLE);
                                         text29.startAnimation(textAnim29);
                                     } catch (Exception e) {
                                     }
                                 }
                             });
                             break;
                         case 26:
                             text30.setVisibility(View.VISIBLE);
                             text30.startAnimation(textAnim30);
                             break;
                     }
                 }
             });
         }
     }

