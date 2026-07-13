package day9;


public class student {
  String name;
  int marks;
  
  public static void main(String[] args){
    student s1 = new student();
    student s2 = new student();
    s1.name = "mahesh";
    s1.marks = 60;
    s2.name = "shreya0";
    s2.marks = 50;

  }

  public static void task(student s1, student s2){
    if(s1.marks < s2.marks){
      System.out.println("s2 name is " + s2.name +  " and has greater marks which is " + s2.marks);
    }
    else{
      System.out.println("s1  name is " + s1.name +  " and has greater marks which is " + s1.marks);
    }
  }
  

}