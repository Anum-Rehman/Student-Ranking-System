/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ubitstudentrankingsystem;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Anum
 */
public class UbitStudentList {
    public UbitStudent[] sList;
    public int ObjectCounter;
    public UbitStudentList(){
        this.ObjectCounter=0;
    }
    public void intialize(int num)
    {
        sList=new UbitStudent[num];
    }
       
    public void addubitStudent(String name,int semesterNO,float gpa,float Cgpa,int NoOfAwards){
        //if (this.ObjectCounter==sList.length)
          //  increaseSize();
        sList [this.ObjectCounter]=new UbitStudent (name,semesterNO,gpa,Cgpa,NoOfAwards);
        this.ObjectCounter++;
    }
    private void increaseSize(){
        UbitStudent[] tempReference=new UbitStudent[this.sList.length*2];
        for (int s=0;s<this.ObjectCounter;s++){
            tempReference [ObjectCounter]=sList[s];
        }
        this.sList=tempReference;
    }
    @Override
    public String toString()
    {
        String fullInfo = "";
        String result = "\n---------------------------------------\n";
        result += "Number of Students:" +sList.length +"\n";
        result += "       Student List         \n"; 
        
        for (int i=0;i<this.ObjectCounter;i++)
            result += sList[i].toString()  +"\n";
        return result;
        
    }
    public UbitStudentList sort(UbitStudent[] sList,String usercriteria){
        UbitStudent[] tempoutput =new UbitStudent[sList.length];
        switch (usercriteria){
            
                   case "gpa":
                   {
                     float[] gpaArray=new float [ObjectCounter];
                   for (int i=0; i<ObjectCounter;i++){
                       gpaArray[i]=sList[i].getGpa();
                   }
                   Arrays.sort(gpaArray);
                   for (int i=0;i<ObjectCounter;i++){
                       int Idx=this.Rank(gpaArray[i]);
                       tempoutput[i]=new UbitStudent (sList[Idx].getName(),sList[Idx].getSemesterNO(),sList[Idx].getGpa(),sList[Idx].getCgpa(),sList[Idx].getNoOfAwards());
                   }
                          break;  
                   }
                   case "cgpa":
                   {
                     float[] cgpaArray=new float [ObjectCounter];
                   for (int i=0; i<ObjectCounter;i++){
                       cgpaArray[i]=sList[i].getCgpa();
                   }
                   Arrays.sort(cgpaArray);
                   for (int i=0;i<ObjectCounter;i++){
                       int Idx=this.Ranks(cgpaArray[i]);
                       tempoutput[i]=new UbitStudent (sList[Idx].getName(),sList[Idx].getSemesterNO(),sList[Idx].getGpa(),sList[Idx].getCgpa(),sList[Idx].getNoOfAwards());
                   }
                          break;  
                   }
                   case "NoOfAwards":
                   {
                     int[] noofawardsArray=new int [ObjectCounter];
                   for (int i=0; i<ObjectCounter;i++){
                       noofawardsArray[i]=sList[i].getNoOfAwards();
                   }
                   Arrays.sort(noofawardsArray);
                   for (int i=0;i<ObjectCounter;i++){
                       int Idx=this.Rank(noofawardsArray[i]);
                       tempoutput[i]=new UbitStudent (sList[Idx].getName(),sList[Idx].getSemesterNO(),sList[Idx].getGpa(),sList[Idx].getCgpa(),sList[Idx].getNoOfAwards());
                   }
                          break;  
                   }
            }
            UbitStudentList outL =new UbitStudentList();
            outL.sList=tempoutput;
            outL.ObjectCounter=tempoutput.length;
            return outL;
    }
    
            public UbitStudent search(UbitStudent[] sList,String userchoice){
                UbitStudent[] tempoutput =new UbitStudent[sList.length];
            switch (userchoice){
                case "Name,Gpa":{
                    System.out.println("Enter the name & gpa of the Student you want to search");
                    System.out.println("Student Name");
                    Scanner sc=new Scanner(System.in);
                    String line=sc.nextLine();
                    System.out.println("Student gpa");
                    float a=sc.nextFloat();
                    int ind = this.findUbitStudent(line,a);
                if (ind == -1)
                {
                    System.out.println("Student not found");   
                }
                
                else
                    //for (int i=ind+1; i<ObjectCounter; i++)
                {
                    UbitStudent TempStudent = new UbitStudent(this.sList[ind].getName(),
                                                              this.sList[ind].getSemesterNO(),
                                                              this.sList[ind].getGpa(),
                                                              this.sList[ind].getCgpa(),
                                                              this.sList[ind].getNoOfAwards());
                    return TempStudent;
                }
                break; 
            }
            case "Name,Cgpa": { 
                System.out.println("Enter the name & cgpa of the Student you want to search");
                    System.out.println("Student Name");
                    Scanner sc=new Scanner(System.in);
                    String line=sc.nextLine();
                    System.out.println("Student Cgpa");
                    float a=sc.nextFloat();
                    int ind = this.findUbitStudents(line,a);
                if (ind == -1)
                {
                    System.out.println("Student not found");   
                }
                
                else
                    //for (int i=ind+1; i<ObjectCounter; i++)
                {
                    UbitStudent TempStudent = new UbitStudent(this.sList[ind].getName(),
                                                              this.sList[ind].getSemesterNO(),
                                                              this.sList[ind].getGpa(),
                                                              this.sList[ind].getCgpa(),
                                                              this.sList[ind].getNoOfAwards());
                    return TempStudent;
                }
                break;
            }
            case "Name,Gpa,Cgpa": { 
                System.out.println("Enter the name & cgpa of the Student you want to search");
                    System.out.println("Student Name");
                    Scanner sc=new Scanner(System.in);
                    String line=sc.nextLine();
                    System.out.println("Student gpa");
                    float a=sc.nextFloat();
                    System.out.println("Student cgpa");
                    float b=sc.nextFloat();
                    int ind = this.findUbitStudent(line,a,b);
                if (ind == -1)
                {
                    System.out.println("Student not found");   
                }
                
                else
                    //for (int i=ind+1; i<ObjectCounter; i++)
                {
                    UbitStudent TempStudent = new UbitStudent(this.sList[ind].getName(),
                                                              this.sList[ind].getSemesterNO(),
                                                              this.sList[ind].getGpa(),
                                                              this.sList[ind].getCgpa(),
                                                              this.sList[ind].getNoOfAwards());
                    return TempStudent;
                }
                break;
            }
            }
            return null;
            }
                   private int Rank(float gpa){
                   int i=0;
                   for (i=0;i<ObjectCounter;i++)
                       if (sList[i].getGpa()==(gpa))
                       return i; 
                   return -1;
        }
                   private int Ranks(float cgpa){
                   int i=0;
                   for (i=0;i<ObjectCounter;i++)
                       if (sList[i].getCgpa()==(cgpa))
                       return i; 
                   return -1;
        }
                   private int Rank(int noofawards){
                   int i=0;
                   for (i=0;i<ObjectCounter;i++)
                       if (sList[i].getNoOfAwards()==(noofawards))
                       return i; 
                   return -1;
        }
                   public int findUbitStudent(String name,float gpa){
                       for (int i=0;i<ObjectCounter;i++){
                           if (sList[i].getName().equals(name)&& sList[i].getGpa()==gpa)
                            return i;   
                       }
                       return -1;
                   }
    public int findUbitStudents(String name,float cgpa){
                       for (int i=0;i<ObjectCounter;i++){
                           if (sList[i].getName().equals(name)&& sList[i].getCgpa()==cgpa)
                            return i;   
                       }
                       return -1;
                   }
          
    public int findUbitStudent(String name,float gpa, float cgpa){
                       for (int i=0;i<ObjectCounter;i++){
                           if (sList[i].getName().equals(name) && sList[i].getGpa()==gpa && sList[i].getCgpa()==cgpa)
                            return i;   
                       }
                       return -1;
                   }
          
    
}

