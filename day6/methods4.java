package day6;

public class methods4 {
  public static void main(String[] args){
    methods4.voteVerification(180);
    

  }
  public static void voteVerification(int age){
    if (age>= 18){
      System.out.println("ready for voting");
    }
    else {
      System.out.println("not ready to vote"); 
    }
  }
  
}
