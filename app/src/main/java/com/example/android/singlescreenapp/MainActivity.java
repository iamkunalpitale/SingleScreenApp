package com.example.android.singlescreenapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView addressTxt, phoneTxt, emailTxt, wesbiteTxt;
    ImageView facebook, instagram;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findid();

    }

    private void findid() {

        addressTxt = (TextView)findViewById(R.id.addressTxt);
        phoneTxt = (TextView)findViewById(R.id.phoneTxt);
        emailTxt = (TextView)findViewById(R.id.emailTxt);
        wesbiteTxt = (TextView)findViewById(R.id.wesbiteTxt);
        facebook = (ImageView)findViewById(R.id.facebook);
        instagram = (ImageView)findViewById(R.id.instagram);

        addressTxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri gmmIntentUri = Uri.parse("geo:37.7749,-122.4194");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                if (mapIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(mapIntent);
                }
            }


        });
        phoneTxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("0731 406 4803"));
                startActivity(intent);
            }
        });
        emailTxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent emailIntent = new Intent(Intent.ACTION_SENDTO);
                emailIntent.setData(Uri.parse("mailto: kunalpitale2608@gmail.com"));
                startActivity(Intent.createChooser(emailIntent, "Send feedback"));
            }
        });
        wesbiteTxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW);
                browserIntent.setData(Uri.parse("https://www.goldsgym.com/"));
                startActivity(browserIntent);
            }

        });
        facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent facebookIntent = new Intent(Intent.ACTION_VIEW);
                facebookIntent.setData(Uri.parse("https://www.facebook.com/goldsgym/?ref=br_rs"));
                startActivity(facebookIntent);
            }
        });
        instagram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent facebookIntent = new Intent(Intent.ACTION_VIEW);
                facebookIntent.setData(Uri.parse("https://www.instagram.com/goldsgym/?hl=en"));
                startActivity(facebookIntent);
            }
        });

    }


}
