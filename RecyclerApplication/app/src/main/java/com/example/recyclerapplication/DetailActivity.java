package com.example.recyclerapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
    //public static final String ARG_ITEM_ID = "item_id";
    //private DummyContent.DummyItem item;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Bundle arguments = getIntent().getExtras();
        String name = arguments.get("ARG_ITEM_ID").toString();

        TextView textView = findViewById(R.id.details);
        textView.setText(name);


        //получаем интент и ID выбранного элемента
       // Intent intent = getIntent();
       // int itemId = Integer.valueOf(intent.getStringExtra(ARG_ITEM_ID))-1;

        //Получаем название и детальное описание элемента
        //String id = DummyContent.ITEMS.get(itemId).id;
        //String content = DummyContent.ITEMS.get(itemId).content;
       // String details = DummyContent.ITEMS.get(itemId).details;
        //TextView tv = findViewById(R.id.details);
       // tv.setText(details);

    }
}