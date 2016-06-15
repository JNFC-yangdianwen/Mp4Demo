package com.example.yangdianwen.mp3demo;
import android.content.Intent;
import  android.media.MediaPlayer;
import android.net.Uri;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //1.使用系统自带的播放器
//        Uri uri = Uri.parse(Environment.getExternalStorageDirectory().getPath()+"/Test_Movie.m4v");
//        //调用系统自带的播放器
//        Intent intent = new Intent(Intent.ACTION_VIEW);
//        Log.v("URI:::::::::", uri.toString());
//        intent.setDataAndType(uri, "video/mp4");
//        startActivity(intent);


        //2.使用videoview 和 mediactroller

        Uri uri = Uri.parse(Environment.getExternalStorageDirectory().getPath()+"/Test_Movie.m4v");
        VideoView videoView = (VideoView)this.findViewById(R.id.video_view);
        videoView.setMediaController(new MediaController(this));
        videoView.setVideoURI(uri);
        videoView.start();
        videoView.requestFocus();
        //3使用mediaplayer和sufaceview

    }
}
