package Ninejuly26;

public class Str1 {
  public static void main(String[] args) {
    String s = "java is pro";
    int n = s.length() - 1;
    //System.out.println(n);

    int i = n ;
    int j = 0;
    while(i>=j){
      char s1 = s.charAt(i);
      System.out.print(s1);
      i--;
    }
    
  }
}
