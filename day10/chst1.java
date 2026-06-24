package day10;

public class chst1 {
  char c = 'a';
  String s = "shreya";

  public static boolean charString(String s , char c ){
    if(s.indexOf(c) == -1){ 
      return false;

    } else {
      return true ; 
    }

  }
    public static void main(String[] args){
      chst1 c1 = new chst1();
      System.out.println(chst1.charString( c1.s ,  c1.c));
    }
    
  }
  
