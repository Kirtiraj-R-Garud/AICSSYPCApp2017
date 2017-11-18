package com.example.shria.aicssyc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class secondPageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Intent intent = getIntent();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_page);
    }
    public void sendToAboutPage(View view)
    {
        Intent intent = new Intent(this,AboutPageActivity.class);
        startActivity(intent);
    }
    public void sendToHighlightsPage(View view)
    {
        Intent i = new Intent(this,HighlightPageActivity.class);
        startActivity(i);
    }
    public void sendToGoogleMaps(View view)
    {
        Intent intent = new Intent(this,)
    }
}
