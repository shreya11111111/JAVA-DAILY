package day13.inheritance;
import java.util.Scanner;

public class fFruitVirtualMarket {

  public static void main(String[] args){
    System.out.println("-------welcome to qsp fruit market---------");
    System.out.println(" press 1 for Apple");
    System.out.println("press 2 for mango");
    Scanner sc = new Scanner(System.in);
    int input = sc.nextInt();
    if(input == 1){
      System.out.println("U have entered the Mango world");
      System.out.println("the price per kg of mango is " + price );
    }
    
  }
  
}
