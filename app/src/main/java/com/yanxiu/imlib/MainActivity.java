package com.yanxiu.imlib;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.yanxiu.imlib.database.ImDatabase;

public class MainActivity extends AppCompatActivity {

    ImDatabase mImDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mImDatabase=ImDatabase.getDatabase(this);
    }

    private void createTopics(){

    }

    private void createMembers(){

    }

    private void createMsgs(){
        for (int i = 0; i < 10; i++) {

        }


    }


}
