package com.example.samplerecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView rv_main = findViewById(R.id.rv_main);
        List<user> users = new ArrayList<>();
        for (int i = 0; i < 200; i++) {
            user usertest = new user();
            usertest.name = "name : " + i;
            usertest.family = "family : " + i;
            users.add(usertest);

        }
        AdapterUser adapterUser = new AdapterUser(users);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        rv_main.setLayoutManager(linearLayoutManager);
        rv_main.setAdapter(adapterUser);

    }

}