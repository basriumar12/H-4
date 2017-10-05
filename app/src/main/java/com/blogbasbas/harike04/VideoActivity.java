package com.blogbasbas.harike04;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.MediaController;
import android.widget.VideoView;

public class VideoActivity extends AppCompatActivity {

    VideoView v;
    MediaController m;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);

        v = (VideoView) findViewById(R.id.videoView);

        //hilangkan coment untuk coba video oonline
        //videoView.setVideoURI(Uri.parse("http://idn.id/semarang/tes/tatacara.mp4"));

        //ambil video yang di simpan di raw
        v.setVideoURI(Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.video));
        m = new MediaController(this);
        m.setAnchorView(v);
        v.setMediaController(m);
        v.requestFocus();
        v.start();
    }
}