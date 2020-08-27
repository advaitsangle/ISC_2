import java.util.*;
public class Student{
    static int adno, grade, rollno, total;
    static String name, remark;
    public Student(String name, int adno, int grade, int rollno, int total){
        this.name = name;
        this.adno = adno;
        this.grade = grade;
        this.rollno = rollno;
        this.total = total;
    }
    public Student(){
        this.name = "";
        this.grade = 0;
        this.rollno = 0;
        this.total = 0;
    }
    public static void main(){
        input();
        display(remark(total));
    }
    public static void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name, admission number, grade, roll number, and total marks");
        name = sc.nextLine();
        adno = sc.nextInt();
        grade = sc.nextInt();
        rollno = sc.nextInt();
        total = sc.nextInt();
    }
    public static String remark(int n){
        if(n<40)return "Fail";
        else if(n<50)return "Pass";
        else if(n<60)return "Second class";
        else if(n<70)return "First class";
        else if(n<90)return "Distinction";
        else if(n>90)return "Super";
        else return "N/A";
    }
    public static void display(String a){
        System.out.println("Name: "+ adno);
        System.out.println("Admission number: "+ adno);
        System.out.println("Grade: "+ grade);
        System.out.println("Roll number: "+ rollno);
        System.out.println("Total marks: "+ total);
        System.out.println("Status: "+ a);
    }
}