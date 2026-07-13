package day6;

public class methods3 {
  public static void main(String[] args){
    methods3.isLastDigit7(23456);
  }
  


  public static void isLastDigit7(int num){
    int rem = num % 10 ;
    if (rem == 7){
      System.out.println( num +  " last digit is 7 ");

    }
    else {
      System.out.println("last digit is not 7");
    }
    

  }
}
