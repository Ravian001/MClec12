package com.example.dbpractice;

public class Student {

private String name;
private String Rollno;

public Student(String fname, String fRollno){

    this.name= fname;
    this.Rollno= fRollno;

}


    public String getName() {
        return name;
    }

    public void setName(String Sname) {
        this.name = Sname;
    }

    public String getRollno() {
        return Rollno;
    }

    public void setRollno(String Srollno) {
        Rollno = Srollno;
    }


    @Override
    public String toString() {
        return "Student [name=" + name + ", rollNo=" + Rollno +  "]";
    }



}
