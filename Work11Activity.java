package com.example.labs.Work11;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraManager;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.labs.R;

public class Work11Activity extends AppCompatActivity {

    private boolean isFlashOn = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_work11);

        Button flashlightButton = findViewById(R.id.flashlight_button);
        flashlightButton.setOnClickListener(v -> toggleFlashlight());

        WebView webView = findViewById(R.id.webview);
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://www.google.com");
    }

    private void toggleFlashlight() {
        CameraManager cameraManager = (CameraManager) getSystemService(Context.CAMERA_SERVICE);
        try {
            if (cameraManager != null) {
                String cameraId = cameraManager.getCameraIdList()[0];
                isFlashOn = !isFlashOn;
                cameraManager.setTorchMode(cameraId, isFlashOn);
                String message = isFlashOn ? "Фонарик включен" : "Фонарик выключен";
                Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
            }
        } catch (CameraAccessException e) {
            e.printStackTrace();
            Toast.makeText(this, "Ошибка доступа к фонарику", Toast.LENGTH_SHORT).show();
        }
    }
}

