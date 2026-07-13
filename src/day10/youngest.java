package day10;

public class youngest {
  public static void main(String[] args){

    customer c1 = new customer();
    customer c2 = new customer();
    c1.age = 22 ;
    c1.name = "shreya";
    c2.age = 67 ; 
    c2.name = "shree";
    youngest(c1 , c2);
    


  }
  public static void youngest(customer c1 , customer c2){

    if(c1.age > c2.age){
      System.out.println("age of c1 is greater" + c1.age + c1.name );
    }

    else{
      System.out.println("age of c2 is greater"  +  c2.age +   c2.name);
    }

  }
  
}
