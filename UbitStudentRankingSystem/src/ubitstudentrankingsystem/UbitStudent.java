/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ubitstudentrankingsystem;

/**
 *
 * @author Anum
 */
public class UbitStudent {
    private String name;
    private int semesterNO;
    private float gpa;
    private float cgpa;
    private int NoOfAwards;
    public UbitStudent(){
    this.name=name;
    this.semesterNO=semesterNO;
    this.gpa=gpa;
    this.cgpa=cgpa;
    this.NoOfAwards=NoOfAwards;
}

    UbitStudent(String name, int semesterNO, float gpa, float cgpa, int NoOfAwards) {
       this.name=name;
    this.semesterNO=semesterNO;
    this.gpa=gpa;
    this.cgpa=cgpa;
    this.NoOfAwards=NoOfAwards;
}
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getSemesterNO(){
        return semesterNO;
    }
    public void setSemesterNO(int SemesterNO){
        this.semesterNO=semesterNO;
    }
    public float getGpa(){
        return gpa;
    }
    public void setGpa(float gpa){
        this.gpa=gpa;
    }
    public float getCgpa(){
        return cgpa;
    }
    public void setcgpa(float cgpa){
        this.cgpa=cgpa;
    }
    public int getNoOfAwards(){
        return NoOfAwards;
    }
    public void setNoOfAwards(int getNoOfAwards){
        this.NoOfAwards=NoOfAwards;
    }
    @Override
    public String toString(){
        return "Student info:"+" "+this.name+" "+this.semesterNO+" "+this.gpa+" "+this.cgpa+" "+this.NoOfAwards;
    }

    
    
}

