package day11;
import java.util.Scanner;


public class Bank {
  String CustomerName;
  long Phoneno;
  int pin;
  Double balance;

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    Bank c1 = new Bank("shreya",123456l,234, 12000.0);
    System.out.println();


    
  }
  
  

  public Bank(String CustomerName, long Phoneno , int pin , Double balance){
    this.CustomerName = CustomerName;
    this.Phoneno = Phoneno;
    this.pin = pin ;
    this.balance = balance;
    
  }
  
  
  public static void withdraw(String CustomerName, long Phoneno , int pin , Double balance , Double amount ){






  }
   public static void deposit(Bank c1){
    System.out.println("enter the pin");
    int userEnterPin = sc.nextInt();
    if(c1.pin == userEnterPin){
      System.out.println("enter deposite amount");
      Double depositAmount = sc.nextdouble();
      c1.balance += depositAmount;

    }
    else{
      System.out.println("you entered Wrong pin");
    }


  }
   public static Double getBalance(String CustomerName, long Phoneno , int pin , Double balance){

    return 0.0; 


  }


  
}
