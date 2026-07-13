package day17;


public class Student {
  int id;
  String name;
  public Student(int id , String name){
    this.id = id;
    this.name = name;

  }
  @Override
  public String toString(){
    return"[" + name + "," + id + "]";

  }
  public static boolean CheckEqualityOfStudents(Student s , Student s2)
  { 
    /* 
    if(s.id == s2.id){
      return true ;
 
    }
    else {
      return false;
    }
      */

    return s.id == s2.id ;   //either return true or false 

  }
    public static void main(String[] args){
      Student s = new Student(1 ,"arjun");
      Student s2 = new Student(4, "rishik");
      Student s3 = new Student(5, "rishik");
      Student s4 = new Student(6, "rishik");

      System.out.println(CheckEqualityOfStudents(s , s2));


    }

  
  
}
