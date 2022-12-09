package com.example.proje.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.proje.Activity.StudentActivity;
import com.example.proje.Class.Lesson;
import com.example.proje.R;

import java.util.ArrayList;

public class Lesson_Adapter extends RecyclerView.Adapter<Lesson_Adapter.ders_Hodler> {
    private ArrayList LessonList;
    private Context context;

    public Lesson_Adapter(ArrayList<Lesson>LessonList, Context context){
        this.LessonList=LessonList;
        this.context=context;

    }


    @NonNull
    @Override
    public ders_Hodler onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(context).inflate(R.layout.lesson_item,parent,false);

        return new ders_Hodler(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ders_Hodler holder, int position) {

        Lesson d= (Lesson) LessonList.get(position);
        holder.setData(d);

    }

    @Override
    public int getItemCount() {
        return LessonList.size();
    }

    class ders_Hodler extends RecyclerView.ViewHolder{

        TextView Lesson;
        Button btn;
        Intent intent ;


        public ders_Hodler(@NonNull View itemView) {
            super(itemView);

            Lesson=(TextView) itemView.findViewById(R.id.StudentName);
            btn=(Button) itemView.findViewById(R.id.btn_attendance);

            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    v.getContext().startActivity(new Intent(v.getContext(), StudentActivity.class));

                }
            });

        }

        public void setData(com.example.proje.Class.Lesson d){
            this.Lesson.setText(d.getDers_adı());

        }
    }


}
