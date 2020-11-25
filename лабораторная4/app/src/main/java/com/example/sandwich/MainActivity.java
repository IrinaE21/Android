package com.example.sandwich;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
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

        //Конвертируем объект в JSON
        Cat murzik = new Cat();
        murzik.name = "Мурзик";
        murzik.age = 9;
        murzik.color = Color.RED;

        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.create();
        Log.i("GSON", gson.toJson(murzik));
        TextView tv_cat = findViewById(R.id.tv_cat);

        //Конвертируем JSON в объект
        String jsonText = "{\"name\":\"Гарри\",\"color\":-16777216,\"age\":18}";
        Cat murziks = gson.fromJson(jsonText, Cat.class);
        Log.i("GSON", "Имя: " + murzik.name + "\nВозраст: " + murzik.age);


        tv_cat.setText(gson.toJson(murzik)+"\n"+"\nИмя: " + murziks.name + "\nВозраст: " + murziks.age+"\n"+"\nИмя: "+murzik.name + "\nВозраст: " + murzik.age + "\n" + "\nЦвет: " );

        View tv_color = findViewById(R.id.tv_color);
        tv_color.setBackgroundColor(murzik.color);
    }
}
