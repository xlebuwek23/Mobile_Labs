package com.example.labs.Work14;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.labs.R;

public class Work14Activity extends AppCompatActivity {

    private ImageView connectionImage;
    private Button checkConnectionButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_work14);

        connectionImage = findViewById(R.id.connection_image);
        checkConnectionButton = findViewById(R.id.check_connection_button);

        connectionImage.setImageResource(R.drawable.ic_default_image);

        checkConnectionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Work14Activity.this, "Проверка подключения", Toast.LENGTH_SHORT).show();

                if (isConnectedToInternet()) {
                    connectionImage.setImageResource(R.drawable.ic_connected); // Изображение для подключения
                } else {
                    connectionImage.setImageResource(R.drawable.ic_no_connection); // Изображение для отсутствия подключения
                }
            }
        });
    }

    // Метод проверки подключения
    private boolean isConnectedToInternet() {
        ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        if (connectivityManager != null) {
            NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
            return networkInfo != null && networkInfo.isConnected();
        }
        return false;
    }
}
