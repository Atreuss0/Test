package com.example.proje.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.proje.R;
import com.example.proje.Class.Student;

import java.util.ArrayList;

public class Student_Adapter extends RecyclerView.Adapter<Student_Adapter.ogrenci_Holder> {

    private ArrayList<Student> StudentList;
    private Context context;

    public Student_Adapter(ArrayList<Student> StudentList, Context context) {
        this.StudentList = StudentList;
        this.context = context;
    }


    @NonNull
    @Override
    public ogrenci_Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v= LayoutInflater.from(context).inflate(R.layout.student_item,parent,false);

        return new  ogrenci_Holder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ogrenci_Holder holder, int position) {

        Student ogr=StudentList.get(position);
        holder.setData(ogr);

    }

    @Override
    public int getItemCount() {
        return StudentList.size();
    }

    class ogrenci_Holder extends RecyclerView.ViewHolder{

        TextView StudentName;
        TextView StudentNo;
        ImageView img_student;

        public ogrenci_Holder(@NonNull View itemView) {
            super(itemView);
            StudentName=(TextView) itemView.findViewById(R.id.StudentName);
            StudentNo=(TextView) itemView.findViewById(R.id.StudentNo);
            img_student=(ImageView) itemView.findViewById(R.id.img_student);

        }

        public void setData(Student o){

            this.StudentName.setText(o.getStudentName());
            this.StudentNo.setText(o.getStudentNo());
            this.img_student.setBackgroundResource(o.getImg_Student());




        }
    }
}
