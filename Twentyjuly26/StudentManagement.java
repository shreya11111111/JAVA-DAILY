package Twentyjuly26;
import java.util.ArrayList;
public class StudentManagement {
  public static void main(String[] args) {
      
  
  ArrayList<Student> s = new ArrayList<>();
  ArrayList<Student> JavafullList = new ArrayList<>();
  s.add(new Student(1,"shreya" ,"JavaFullStack"));
  s.add(new Student(2,"mohit" ,"PythonFullStack"));
  s.add(new Student(3,"anushka" ,"JavaFullStack"));


  Integer count=0;
  for(Student element : s){
    if(element.course.equalsIgnoreCase("javafullstack")){
      JavafullList.add(element);
      count++;
    }
    
    
  }
  System.out.println(JavafullList);




  }


  
}
