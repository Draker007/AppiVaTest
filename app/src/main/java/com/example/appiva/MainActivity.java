package com.example.appiva;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class MainActivity extends AppCompatActivity {
RecyclerView recyclerView;
private List<list> items;
TextView date1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView)findViewById(R.id.ListRecycler);
        items = new ArrayList<>();
        items.add(new list("All Tasks","6"));
        items.add(new list("Personal","5"));
        items.add(new list("Work","1"));

        date1 = findViewById(R.id.date2);
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat mdformat = new SimpleDateFormat(" dd ");
        String strDate = mdformat.format(calendar.getTime());
        date1.setText(strDate);


        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
        recyclerView.setAdapter(new adapter(MainActivity.this,items));
    }
}
