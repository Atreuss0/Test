package com.example.proje.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.proje.R;
import com.example.proje.Class.Student;
import com.example.proje.Adapter.Student_Adapter;

public class StudentActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private Student_Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student);

        recyclerView=(RecyclerView)findViewById(R.id.rc_student);
        adapter=new Student_Adapter(Student.getData(),this);

        recyclerView.setHasFixedSize(true);
        LinearLayoutManager manager= new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(manager);
        recyclerView.setAdapter(adapter);
    }
}