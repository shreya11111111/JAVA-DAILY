package day11;

public class MethodOverLoad {
  public static void main(String[] args){
    byte b = 20;//widenning . will convert to nearest datatype. 

    task(b);

  }
  public static void task(int i ){
    System.out.println("int args");
  }
  public static void task(short  i ){
    System.out.println("short args");
  }
  public static void task(float  i ){
    System.out.println("float  args");
  }
  
}
