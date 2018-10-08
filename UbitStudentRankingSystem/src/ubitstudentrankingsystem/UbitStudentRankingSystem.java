/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ubitstudentrankingsystem;

import java.util.Scanner;

/**
 *
 * @author Anum
 */
public class UbitStudentRankingSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        UbitStudentList stdnt=new UbitStudentList();
        try (Scanner sc=new Scanner (System.in)){
        final int mainmenuselection=askuserforchoice(sc,"1-Input,2-Rank Student,3-Search Student",3);
        switch (mainmenuselection){
    case 1:{
        System.out.println("How many students data you want to enter??");
        int num=sc.nextInt();
        stdnt.intialize(num);
        String line =sc.nextLine();
        for (int i=0;i<num;i++){
        System.out.println("Enter Student Info:\t name\t Semester No\t gpa\t cgpa \t No.of Awards");
        line =sc.nextLine();
        String [] split=line.split(" ");
       stdnt.addubitStudent(split[0],Integer.parseInt(split[1]),Float.parseFloat(split[2]),Float.parseFloat(split[3]),Integer.parseInt(split[4]));
       
    
        }
        System.out.println("Input successful and shown below");
        System.out.println(stdnt);
        break;
    }
    case 2:{
        System.out.println("How many students data you want to sort??");
        int num=sc.nextInt();
        stdnt.intialize(num);
        String line =sc.nextLine();
        for (int i=0;i<num;i++){
        System.out.println("Enter Student Info:\t name\t Semester No\t gpa\t cgpa \t No.of Awards");
        line =sc.nextLine();
        String [] split=line.split(" ");
        stdnt.addubitStudent(split[0],Integer.parseInt(split[1]),Float.parseFloat(split[2]), (float) Double.parseDouble(split[3]),Integer.parseInt(split[4]));
        }
        System.out.println("Input successful and shown below");
        System.out.println(stdnt);
        
        System.out.println ("Enter Criteria for sorting:\t gpa \t cgpa \t NoOfAwards");
        line =sc.nextLine();
           String[] split=line.split(" ");
           UbitStudentList c=stdnt.sort(stdnt.sList, split[0]);
           System.out.println(c);
           break;       
        }
    case 3:
    {
        System.out.println("How many students data you want to Enter??");
        int num=sc.nextInt();
        stdnt.intialize(num);
        String line =sc.nextLine();
        for (int i=0;i<num;i++){
        System.out.println("Enter Student Info:\t name\t Semester No\t gpa\t cgpa \t No.of Awards");
        line =sc.nextLine();
        String [] split=line.split(" ");
        stdnt.addubitStudent(split[0],Integer.parseInt(split[1]),Float.parseFloat(split[2]), (float) Double.parseDouble(split[3]),Integer.parseInt(split[4]));
        }
        System.out.println("Input successful and shown below");
        System.out.println(stdnt); 
        System.out.println ("Enter Criteria for searching:\t Name,Gpa \t Name,Cgpa \t Name,Gpa,Cgpa");
        line =sc.nextLine();
           UbitStudent c=stdnt.search(stdnt.sList, line);
           System.out.println(c);
           break;        
           
    }
    
        }}}



public static int askuserforchoice (Scanner sc,String prompt,int maxvalue){
System.out.println("Please select menu item");
System.out.println(prompt);
int value=sc.nextInt();
while (value<1|| value>maxvalue){
System.out.println ("invalid menu item, please try again");
value=sc.nextInt();}

return value;
}
}

       
    
    


