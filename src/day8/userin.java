
package day8;
import java.util.Scanner;

public class userin {

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter the name : " );
    String name = sc.next();
    
    
    System.out.println("Enter the age : ");
    int age = sc.nextInt();

    userin.Name(name , age);
    System.out.println(userin.Cube(age));


  }


   //wajp to design a method which takes name and age of student and print it line by line .
//output : name : xyz
//age :12
//Here: args should be entered by user 

  public static void  Name(String name , int age){
  
    System.out.println("Name of the user:" + name);
    System.out.println("age of the user"+ age);
    
   

    //cube 
  }
  public static int Cube(int age){
    return  age * age * age;

  }
  
}






