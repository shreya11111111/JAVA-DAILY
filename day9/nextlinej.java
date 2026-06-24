package day9;
import java.util.Scanner;
public class nextlinej {


  
  public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
    System.out.println("enter number");

    int i = sc.nextInt();
    sc.nextLine(); //dummy statement or clear buffer  //when we have have problem execturing we will use it will take the enter value present in buffer and we arent prinitng it so next line will execute .
    System.out.println("enter string ");
    String s = sc.nextLine();//not printing 
    //in whole scanner class nextline can read enter when we click enter 
    // enter will store in buffer value and then nextline will read the \n enter 

    System.out.println("---details----");
    System.out.println("i = " + i);
    System.out.println("s = "+ s) ;   

    

  }
}
