package com.example.mp5media;
//
//import android.support.v7.app.AppCompatActivity;
//import android.os.Bundle;
//import android.view.View;
//import android.widget.Button;
//import android.widget.ImageButton;
//import android.widget.ImageView;
//import android.widget.RadioButton;
//import android.widget.RadioGroup;
//import android.widget.TextView;
//import android.widget.Toast;
//
//public class MainActivity extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        final Button button1 = (Button) findViewById(R.id.button1);
////        final Toast toast = Toast.makeText(getApplicationContext(), "Radhey Radhey!", Toast.LENGTH_LONG);
//
//        final ImageView imageView = findViewById(R.id.imageView);
//
//        button1.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View v) {
//                final Toast toast = Toast.makeText(getApplicationContext(), "Radhey Radhey 1!", Toast.LENGTH_LONG);
//                toast.show();
//                imageView.setImageResource(R.drawable.pic);
//
//            }});
//
//        onRadioButtonClicked();
//    }
//
//    public void onRadioButtonClicked(){
//        // Is the button now checked?
//
//        RadioGroup myRadioGroup = (RadioGroup) findViewById(R.id.radiogroup);
//
//        int buttonSelectedID = myRadioGroup.getCheckedRadioButtonId();
////        RadioButton myRadioButton = (RadioButton) findViewById(buttonSelectedID);
//
//        TextView textView = (TextView) findViewById(R.id.textView);
//        textView.setText(buttonSelectedID);
//
//        if(buttonSelectedID == R.id.radiobutton1)
//        {
//            final Toast toast = Toast.makeText(getApplicationContext(), "Radhey Radhey 2!", Toast.LENGTH_LONG);
//            toast.show();
////            imageView.setImageResource(R.drawable.pic);
//        }
//        else
//        {
//            final Toast toast = Toast.makeText(getApplicationContext(), "Try again!", Toast.LENGTH_LONG);
//            toast.show();
//        }
//
//    }
//
//}


//Radio Buttons
//import android.support.v7.app.AppCompatActivity;
//import android.os.Bundle;
//import android.view.View;
//import android.widget.ImageView;
//
//public class MainActivity extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//    }
//
//    public void radioclick(View view) {
//        ImageView imvu = (ImageView) findViewById(R.id.my_pic);
//        int id = view.getId();
//        if(id==R.id.rad_doggie){imvu.setImageResource(R.drawable.dog);}
//        else if(id==R.id.rad_horse) {imvu.setImageResource(R.drawable.horse);};
//
//    }
//}

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mp1;
    MediaPlayer mp2;
    MediaPlayer mp3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        ArrayList<MediaPlayer> mediaPlayers = new ArrayList<MediaPlayer>();
        mp1 = MediaPlayer.create(this,R.raw.jashne_baharaa_song);
        mp2 = MediaPlayer.create(this,R.raw.tum_hi_ho);
        mp3 = MediaPlayer.create(this,R.raw.anoushka_shankar);

//        mediaPlayers.add(mp1);
//        mediaPlayers.add(mp2);
//        mediaPlayers.add(mp3);

//        Button buttonPlay1 = findViewById(R.id.buttonPlay1);
//        Button buttonPlay2 = findViewById(R.id.buttonPlay2);
//        Button buttonPlay3 = findViewById(R.id.buttonPlay3);
//
//        Button buttonPause1 = findViewById(R.id.buttonPause1);
//        Button buttonPause2 = findViewById(R.id.buttonPause2);
//        Button buttonPause3 = findViewById(R.id.buttonPause3);
    }



    public void startPlay1(View view) {
        mp1.start();
    }

    public void pausePlay1(View view) {
        mp1.pause();
    }

    public void startPlay2(View view) {
        mp2.start();
    }

    public void pausePlay2(View view) {
        mp2.pause();
    }

    public void startPlay3(View view) {
        mp3.start();
    }

    public void pausePlay3(View view) {
        mp3.pause();
    }
}