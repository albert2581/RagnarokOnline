package com.test.tw.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


/**
 * Created by 信宇 on 2017/11/21.
 */

public class searchMonster extends AppCompatActivity {
    private Button search;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.search_monster);
        buttonSet();
        buttonOnClick();
    }
    private void buttonSet(){
        search =(Button)findViewById(R.id.search);
    }
    private void buttonOnClick(){
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(searchMonster.this,monsterList.class);
                startActivity(intent);
                searchMonster.this.finish();
            }
        });
    }
}
