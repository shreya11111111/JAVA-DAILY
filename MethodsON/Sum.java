package MethodsON;
import java.util.Scanner;
public class Sum {
  public static void main(String[] args){
    System.out.println(sum());

  }
  public static int sum(){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter 1 number");
    int a = sc.nextInt();
    System.out.println("enter 2 number");
    int b = sc.nextInt();
    int sum = a+ b;
    return sum;

  }
  
}
