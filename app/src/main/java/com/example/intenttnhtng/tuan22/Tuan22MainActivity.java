package com.example.intenttnhtng.tuan22;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.intenttnhtng.R;

public class Tuan22MainActivity extends AppCompatActivity {
    ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuan22_main);
        lv=findViewById(R.id.tuan22Listview);
        //nguon du lieu
        String[] arr=new String[]{"Mon 1", "tuan 3", "tuan 2","Mon 4", "tuan 5", "tuan 6"};
        ArrayAdapter<String> adapter=new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,arr );
        //hien thi len lv
        lv.setAdapter(adapter);
    }
}