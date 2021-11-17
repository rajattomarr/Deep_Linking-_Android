package com.example.android.deep_linking_url;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button zee5,sony,voot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        zee5 = findViewById(R.id.zee5);
        sony = findViewById(R.id.sony);
        voot = findViewById(R.id.voot);

        zee5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Uri uri = getIntent().getData();
//                if(uri!= null){
//                    String path = uri.toString();
//                }

                Context context = getApplicationContext();

                String packageName = "com.graymatrix.did";
                String contentCode = "";

                Intent intent = null;

                intent = context.getPackageManager().getLaunchIntentForPackage(packageName);


                if (intent == null) {
                    intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse("market://details?id=" + packageName));
//                    intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                } else {
                    intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(contentCode));
//                    intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                }
                try {
                    context.startActivity(intent);
                } catch (ActivityNotFoundException e) {
                    Toast.makeText(context, "Google Playstore app not available", Toast.LENGTH_LONG).show();
                    e.printStackTrace();
                }


            }
        });

        voot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {




                Context context = getApplicationContext();

                String packageName = "com.tv.v18.viola";
                String contentCode = "";

                Intent intent = null;

                intent = context.getPackageManager().getLaunchIntentForPackage(packageName);


                if (intent == null) {
                    intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse("market://details?id=" + packageName));
                    intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                } else {
                    intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(contentCode));
                    intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                }
                try {
                    context.startActivity(intent);
                } catch (ActivityNotFoundException e) {
                    Toast.makeText(context, "Google Playstore app not available", Toast.LENGTH_LONG).show();
                    e.printStackTrace();
                }




            }
        });




        sony.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                Context context = getApplicationContext();

                String packageName = "com.sonyliv";
                String contentCode = "";

                Intent intent = null;

                intent = context.getPackageManager().getLaunchIntentForPackage(packageName);


                if (intent == null) {
                    intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse("market://details?id=" + packageName));
                    intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                } else {
                    intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(contentCode));
                    intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                }
                try {
                    context.startActivity(intent);
                } catch (ActivityNotFoundException e) {
                    Toast.makeText(context, "Google Playstore app not available", Toast.LENGTH_LONG).show();
                    e.printStackTrace();
                }

            }
        });


    }

}