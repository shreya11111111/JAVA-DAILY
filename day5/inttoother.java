package day5;

public class inttoother {
  public static void main (String[] args){
    int i = 97;
    System.out.println(i);
    byte b = (byte) i; // narrowing conversion, explicit cast required
    System.out.println(b);
    short s = (short) i ;//  ()->typecaste operator --> narrowing - explicit 
    System.out.println(s);
    double d =  i ;
    System.out.println( "double is " +  d);
    long l = i;
    System.out.println(l);
    float f = i ;
    System.out.println(f);
    char c = (char)i;  //
    System.out.println("char is "+ c);


  }
}
