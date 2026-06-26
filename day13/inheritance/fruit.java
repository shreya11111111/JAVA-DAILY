package day13.inheritance;
import java.util.Scanner;


public class fruit {


  String name;
  double price;

  public fruit(){ //for default value to the contructor . 

  }

  public fruit(String name , double price){
    this.name = name;
    this.price = price;
  }



  

  public static void main(String[] args){
    System.out.println("welcome to fruit Market");
    System.out.println("select 1 for mango");
    System.out.println("select 2 for Jamun");
    System.out.println("select 3 for apple");
    System.out.println("Select 4 for Litchi");
    Scanner sc = new Scanner(System.in);
    int input = sc.nextInt();







    
  }


  
}
