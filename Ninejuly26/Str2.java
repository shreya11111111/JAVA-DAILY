package Ninejuly26;

public class Str2 {
  public static void main(String[] args) {
    String s = "java is pro";
    int ThreeElement = s.length()-3 ;
    int lastElement = s.length() - 1;
    //System.out.println(ThreeElement);
    //System.out.println(lastElement);

    int Start = ThreeElement;
    int end = lastElement;
    while(Start <= end){
      char s1 = s.charAt(Start);
      System.out.println(s1);
      Start++;
      

    }
    



  
  
}
}
