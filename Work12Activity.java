package com.example.labs.Work12;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.labs.R;

import java.util.List;

public class Work12Activity extends AppCompatActivity {

    private DatabaseHelper databaseHelper;
    private RecyclerView recyclerView;
    private ItemAdapter itemAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_work12);

        databaseHelper = new DatabaseHelper(this);
        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        Button loadDbButton = findViewById(R.id.load_db_button);

        loadDbButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                List<Item> items = databaseHelper.getAllItems();
                itemAdapter = new ItemAdapter(items);
                recyclerView.setAdapter(itemAdapter);
            }
        });

        databaseHelper.insertItem("The Legend of Zelda", "Nintendo");
        databaseHelper.insertItem("Cyberpunk 2077", "CD Projekt Red");
        databaseHelper.insertItem("Minecraft", "Mojang");
    }
}
