package com.example.proje.Class;

import java.util.ArrayList;

public class Lesson {

    private String Lesson_Name;

    public Lesson(){}

    public Lesson(String ders_adı) {
        this.Lesson_Name = ders_adı;
    }
    public String getDers_adı() {
        return Lesson_Name;
    }

    public void setDers_adı(String ders_adı) {
        this.Lesson_Name = ders_adı;
    }

    static public ArrayList<Lesson> getData(){

        ArrayList<Lesson> LessonList=new ArrayList<>();

        String[] Lessons={"Mobil Programlama","İnternet Programcılığı","Görsel Programlama","Robotik Kodlama","Dijital Pazarlama","Veri Tabanı","Grafik Animasyon","Mobil Programlama II"};

        for(int i=0;i<Lessons.length;i++){

            Lesson d=new Lesson();
            d.setDers_adı(Lessons[i]);

            LessonList.add(d);

        }
        return LessonList;
    }


}
