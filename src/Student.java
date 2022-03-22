import java.util.Scanner;

public class Student {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        String stdName;
        int rollNum;
        int sub1;
        int sub2;
        int sub3;
        int sub4;

        System.out.println("enter student name:");
        stdName= input.nextLine();

        System.out.println("your roll number:");
        rollNum= input.nextInt();

        System.out.println("sub1:");
        sub1= input.nextInt();

        System.out.println("sub2:");
        sub2= input.nextInt();

        System.out.println("sub3:");
        sub3= input.nextInt();

        System.out.println("sub4:");
        sub4= input.nextInt();

        if((sub1+ sub2+ sub3+ sub4)/4>60){
            System.out.println("Student name:"+stdName+ " "+"roll number:"+" "+rollNum+" "+"has passed");
        }else{
            System.out.println("fail");
        }
    }


}