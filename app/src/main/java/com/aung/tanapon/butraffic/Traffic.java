package com.aung.tanapon.butraffic;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class Traffic extends AppCompatActivity {

    //Explicit คือการประกาศตัวแปร
    //การประกาศตัวแปร Private คือใช้แค่ในคลาสใดคลาสหนึ่ง
    private ListView trafficListView;
    private Button aboutMeButton;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_traffic);

        //Bind Widget
        bindWidget(); //การสร้างMethod อัตโนมัติ = ALT+ENTER

        //Button Controller
        buttonController();

    } //อะไรที่รวม Statement ไว้ คือ Method และนี่คือ Main Method

    private void buttonController() {
        aboutMeButton.setOnClickListener(new View.OnClickListener() { //Set ค่าเมื่อมีการคลิกปุ่ม
            @Override
            public void onClick(View v) {

                //Sound Effect
                MediaPlayer buttonPlayer = MediaPlayer.create(getBaseContext(), R.raw.dog);
                buttonPlayer.start();

                //Intent to WebView
                Intent objIntent = new Intent(Intent.ACTION_VIEW);
                objIntent.setData(Uri.parse("https://www.youtube.com/"));
                startActivity(objIntent);

            } //event
        });
    }

    private void bindWidget() {
        trafficListView = (ListView) findViewById(R.id.listView);
        aboutMeButton = (Button) findViewById(R.id.button);
    }

}  //Main Class นี่คือคลาสหลัก
