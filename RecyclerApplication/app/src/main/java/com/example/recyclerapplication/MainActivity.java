package com.example.recyclerapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         //добавляем RecyclerView
        RecyclerView recyclerView = findViewById(R.id.list);

        //добавляем менеджер слоев, связываем с RecyclerView
        LinearLayoutManager mLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(mLayoutManager);

        //добавляем адаптор списка
        RViewAdapter movieAdapter = new RViewAdapter(DummyContent.ITEMS);
        recyclerView.setAdapter(movieAdapter);
    }
}