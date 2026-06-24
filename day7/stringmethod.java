//task 1 :
//wajp to design a method which takes a string args and return first character

//task 2:
//WAJP TO DESIGN A METHOD WHICH TAKES A STRING ARGS AND RETURN LAST CHARACTER

//TASK 3:
//WAJP TO DESIGN A METHOD WHICH TAKES A STRING AND A CHARACTER AND CHECK WHEATHER FRIST CHARACTER IS EQUALS to given character or not 

//task 4:
//WAJP TO DESIGN A METHOD WHICH TAKES A String check wheather first character is upper case alpha or lowercase aplha or digit or any other character 

//task5:
//wajp to design a method which takes a string check wheather the given string length is even or odd 


package day7;

public class stringmethod {
  public static void main(String[] args){
    System.out.println(string("hreya"));
    System.out.println(stringLastchar("shorya"));
    System.out.println(stChar("shreya" , 's'));
    System.out.println(evenOdd("shorya"));
    System.out.println(SC("SHREYA"));

  }

  public static  char  string (String s){
    return s.charAt(0);

    
  }
  public static char stringLastchar(String t){
    return t.charAt(t.length()-1);
  }



  public static  String  stChar(String s , char c ){
    if(s.charAt(0) == c){
      return "same";
    }else{
      return "not same";
    }
  }


  

  public static  String  evenOdd(String s){
    int n = s.length();
    if( n % 2 == 0){
      return "even";

    }
    else{
      return "odd";
    }
  }


  public static String  SC(String S){
    char  n = S.charAt(0);
    if(n >= 'A' &&  n <= 'Z'){
      return "uppercase";

    }
    else if(n >= 'a' && n <= 'z'){
      return "lowercase";
    }
    else if(n >= 0 && n < = 9){
      return "digit";
      
    }
    else{
      return "any other ";
    }
  }

  





  
}
