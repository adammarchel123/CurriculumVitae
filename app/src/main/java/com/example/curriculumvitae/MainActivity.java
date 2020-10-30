package com.example.curriculumvitae;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btnHubungi;
    private WebView wvCV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnHubungi = findViewById(R.id.btn_hubungi);
        wvCV = findViewById(R.id.wv_cv);

        final String telepon ="tel:081299319920";

        btnHubungi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent call = new Intent(Intent.ACTION_DIAL, Uri.parse(telepon));
                startActivity(call);
            }
        });

        String urlFile = "file:///android_res/raw/index.html";
        wvCV.loadUrl(urlFile);
    }
}