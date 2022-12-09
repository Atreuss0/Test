package com.example.proje.Class;

import com.example.proje.R;

import java.util.ArrayList;

public class Student {


    public Student(String studentName, String studentNo, int img_Student) {
        StudentName = studentName;
        StudentNo = studentNo;
        this.img_Student = img_Student;
    }

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String studentName) {
        StudentName = studentName;
    }

    public String getStudentNo() {
        return StudentNo;
    }

    public void setStudentNo(String studentNo) {
        StudentNo = studentNo;
    }

    public int getImg_Student() {
        return img_Student;
    }

    public void setImg_Student(int img_Student) {
        this.img_Student = img_Student;
    }

    private String StudentName,StudentNo;
         private int img_Student;


        public Student(){}


        static public ArrayList<Student> getData(){

            ArrayList<Student> StudentList=new ArrayList<>();
            String[] Student={"Muhammet","Samet","Oğuzhan","Cemal","Cemal","Cemal","Cemal","Cemal","Cemal"};
            String[] No={"203027017","203027018","203027019","2030270120","2030270120","2030270120","2030270120","2030270120","2030270120"};
            int[] Image={R.drawable.d,R.drawable.d,R.drawable.d,R.drawable.d,R.drawable.d,R.drawable.d,R.drawable.d,R.drawable.d,R.drawable.d};

            for(int i=0;i<Student.length;i++){

                com.example.proje.Class.Student o =new Student();
                o.setStudentName(Student[i]);
                o.setStudentNo(No[i]);
                o.setImg_Student(Image[i]);

                StudentList.add(o);
            }


            return StudentList;

        }







}
