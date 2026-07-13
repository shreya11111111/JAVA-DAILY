package day9;
import java.util.Scanner;
public class uplow {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
   
    //String s = sc.next();
    char ch = sc.next().charAt(0);
    

  }
  public static char lowUp(char ch ){
    if(ch >='a' && ch <= 'z' ){
       return (char)(ch-32);
 
    }

    return ch ; 

  

    }



  }
  
