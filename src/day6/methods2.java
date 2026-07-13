package day6;

public class methods2 { 
  public static void  main(String[] args){
    methods2.isEvenNumber(20);//method call
    methods2.isEvenNumber(23);

  }
  //method declaration + body 
  public static void isEvenNumber(int num){
    int rem = num % 2 ;
    if(rem == 0){
      System.out.println("yes it is even number");;
    }

    else {
      System.out.println(num  +  " i s odd number");
    }
  }




}
