package com.example.proje.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Button;

import com.example.proje.Class.Lesson;
import com.example.proje.Adapter.Lesson_Adapter;
import com.example.proje.R;

public class LessonActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private Lesson_Adapter adapter;

    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson);


        recyclerView=(RecyclerView)findViewById(R.id.rc_lesson);
        adapter=new Lesson_Adapter(Lesson.getData(),this);

        recyclerView.setHasFixedSize(true);
        LinearLayoutManager manager= new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(manager);
        recyclerView.setAdapter(adapter);



    }
}