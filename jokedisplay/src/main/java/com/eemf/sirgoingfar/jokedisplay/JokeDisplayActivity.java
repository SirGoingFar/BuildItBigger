package com.eemf.sirgoingfar.jokedisplay;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokeDisplayActivity extends AppCompatActivity {

    public static final String JOKE_BODY = "joke_body";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke_display);

        TextView jokeBody = (TextView) findViewById(R.id.tv_joke_container);

        Intent intent = getIntent();
        if(intent != null && intent.hasExtra(JOKE_BODY)){
            jokeBody.setText(intent.getStringExtra(JOKE_BODY));
        }
    }
}
