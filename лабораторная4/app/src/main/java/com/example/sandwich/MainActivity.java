package com.example.sandwich;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        String jsonText = "{\"name\":\"Гарри\",\"color\":-16777216,\"age\":18}";

        //Конвертируем объект в JSON
        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.create();
        Cat murzik = gson.fromJson(jsonText, Cat.class);
        Log.i("GSON", "Имя: " + murzik.name + "\nВозраст: " + murzik.age);

        TextView tv_cat = findViewById(R.id.tv_cat);
        tv_cat.setText("Имя: " + murzik.name + "\nВозраст: " + murzik.age + "\nЦвет: ");

        View tv_color = findViewById(R.id.tv_color);
        tv_color.setBackgroundColor(murzik.color);
    }
}