package day8;
import java.util.Scanner;

public class emp {

   public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("ENther the employee salary");
    int sal  = sc.nextInt();
    System.out.println("ENther the employee salary increament money");
    float  inc = sc.nextFloat();
    emp.amountSal(sal , inc);




   }
   public static void amountSal(int sal  , float  inc){
    System.out.println("the total amount is " + (sal + inc ));

   }
   

  
}
