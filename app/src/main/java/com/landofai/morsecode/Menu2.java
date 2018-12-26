package com.landofai.morsecode;

import android.content.Context;
import android.graphics.Color;
import android.media.AudioManager;
import android.media.ToneGenerator;
import android.os.Build;
import android.os.Handler;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import static android.content.ContentValues.TAG;
import static android.content.Context.VIBRATOR_SERVICE;

/**
 * Created by Admin on 23-11-2018.
 */
public class Menu2 extends Fragment{

    private static String[] alpha = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j",
            "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v",
            "w", "x", "y", "z", "1", "2", "3", "4", "5", "6", "7", "8",
            "9", "0","!", ",", "?", ".", "'", " "};
    private static String[] morse = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.",
            "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.",
            "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-",
            "-.--", "--..", ".----", "..---", "...--", "....-", ".....",
            "-....", "--...", "---..", "----.", "-----","-.-.--", "--..--", "..--..", ".-.-.-", ".----.", " \\ "};



    EditText etIn;
    TextView tvOut;
    Button convert;
    EditText mEdit;
    Button playbtn;
    Button rsetbtn;
    Button btnStop;
    String outCoded="";
    CheckBox sound, flash, vibrate;
    boolean toSound, toFlash, toVibrate;
    boolean isplaying=false;
    boolean toContinue=true;

    private AdView mAdView;

    Thread t1;

    //Variable initialization done
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //returning our layout file
        //change R.layout.yourlayoutfilename for each of your fragments
        return inflater.inflate(R.layout.fragment_convert, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //you can set the title for your toolbar here for different fragments different titles

        Log.d(TAG, "onViewCreated: before variables");

        etIn = getView().findViewById(R.id.editText);
        convert = getView().findViewById(R.id.button);
        playbtn = getView().findViewById(R.id.button3);
        rsetbtn = getView().findViewById(R.id.button2);
        rsetbtn.setVisibility(View.INVISIBLE);
        btnStop = getView().findViewById(R.id.button4);

        flash = getView().findViewById(R.id.checkBox);
        flash.setVisibility(View.INVISIBLE);
        sound = getView().findViewById(R.id.checkBox2);
        vibrate = getView(). findViewById(R.id.checkBox3);

        mEdit = getView().findViewById(R.id.editText3);
        mEdit.setEnabled(false);
        mEdit.setTextColor(Color.BLACK);
        mEdit.setTextSize(24);

        Log.d(TAG, "After variable");
        getActivity().setTitle("Convert");


        convert.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                convertTxt();
            }
        });



        playbtn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Log.d("in PLAybtn ONCLICK", "toContinue: "+toContinue);
                Log.d("in PLAybtn ONCLICK", "isplaying "+isplaying);
                if(!isplaying) {
                    Log.d("in PLAybtn ONCLICK", "in if: toContinue: "+toContinue);
                    isplaying=true;
                    play(view);
                }
                else {
                    Log.d("in PLAybtn ONCLICK", "else");
                    return;
                }
            }
        });

        rsetbtn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                resetAll();
            }
        });

        btnStop.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                stop();
            }
        });


        //Disable Elements For First version
        rsetbtn.setEnabled(false);
        rsetbtn.setVisibility(View.INVISIBLE);
        flash.setEnabled(false);
        flash.setVisibility(View.INVISIBLE);


        mAdView = (AdView) getView().findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
    }

    public void resetAll(){
        Log.d("btn press", "Reset pressed, IN resetALL");
        stop();
        convertTxt();
        resetChecks();
        etIn.setText("");
        Log.d("rst btn", "over");
    }

    public void stop(){

        Log.d("in Stop", "Enter");
      //resetChecks();
        toContinue=false;
        Log.d("btn pressed", "Variables set, before t1.stop, isplaying: "+isplaying);
        if(isplaying){
            try{
                t1.stop();

                Log.d("stop presses", "SUccessfully stpopped thread");
            }
            catch (Exception e){
                Log.d("T1excw", "Exception stopping t1");
            }
        }
        isplaying=false;
        Log.d("stop btn pressed", "after t1.stop");
    }

    public void resetChecks(){
        sound.setChecked(false);
        flash.setChecked(false);
        vibrate.setChecked(false);
    }

    public void convertTxt(){
        String engInp = etIn.getText().toString().toLowerCase();
        StringBuilder out= new StringBuilder();

        Log.d(TAG, "convertTxt: Before loop");

        for(int i=0; i<engInp.length(); i++){
            for(int j=0;j<alpha.length; j++){

                if(engInp.charAt(i)==alpha[j].charAt(0)){
                    out.append(morse[j]);
                    out.append(" ");
                }
            }
        }
        outCoded= out.toString();
        Log.d(TAG, "convertTxt: After loop outCoded: "+(outCoded));
        mEdit.setText(out.toString());
    }


    public void play(View v){

        final String finalPlay = outCoded;
        toContinue=true;
        toSound = sound.isChecked();
        toFlash = flash.isChecked();
        toVibrate = vibrate.isChecked();

      //  Vibrator v = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);


        if(!toSound && !toFlash && !toVibrate){
            isplaying=false;
            return;
        }

        t1 = new Thread(new Runnable() {

            @Override
            public void run() {

                ToneGenerator tg = new ToneGenerator(AudioManager.STREAM_ALARM, 100);
                Log.v("Aquired", "Got Tone generator");
                Vibrator v = (Vibrator) getActivity().getSystemService(Context.VIBRATOR_SERVICE);
                Log.v("Aquired", "Got Vibrator");
                Log.d("isplaying:  ", "is"+isplaying);

                for (int i=0;i<finalPlay.length();i++) {
                    toSound = sound.isChecked();
                    toFlash = flash.isChecked();
                    toVibrate = vibrate.isChecked();

                    if(!toSound && !toFlash && !toVibrate){
                        isplaying=false;
                        break;
                    }

                    if(!toContinue) {
                        isplaying=false;
                        break;
                    }

                    if (finalPlay.charAt(i) == '.') {
                        if (toSound) {
                            tg.startTone(ToneGenerator.TONE_DTMF_7, 200);
                        }
                        if(toVibrate){
                            if (Build.VERSION.SDK_INT >= 26) {
                                v.vibrate(VibrationEffect.createOneShot(200, VibrationEffect.DEFAULT_AMPLITUDE));
                            } else {
                                v.vibrate(200);
                            }
                        }


                        try {
                            Thread.sleep(350);
                            tg.stopTone();

                        } catch (InterruptedException ex) {

                        }
                    }
                    if(finalPlay.charAt(i)=='-'){
                        if(toSound){
                            tg.startTone(ToneGenerator.TONE_DTMF_7, 400);
                        }
                        if(toVibrate){
                            if (Build.VERSION.SDK_INT >= 26) {
                                v.vibrate(VibrationEffect.createOneShot(400, VibrationEffect.DEFAULT_AMPLITUDE));
                            } else {
                                v.vibrate(400);
                            }
                        }

                        try{
                            Thread.sleep(450);
                            tg.stopTone();
                        }
                        catch(InterruptedException ex){

                        }
                    }

                    else if(finalPlay.charAt(i)==' '){

                        try{
                            Thread.sleep(300);
                            tg.stopTone();
                        }
                        catch(InterruptedException ex){

                        }
                    }

                }
                isplaying=false;
                Log.d("exit:", "Exiting the for loop");
                tg.release();
            }
        });
        t1.start();
    }
}

