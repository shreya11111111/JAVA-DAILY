package day10;

public class retyoungest {
  public static void main(String[] args){

    customer c1 = new customer();
    customer c2 = new customer();
    c1.age = 22 ;
    c1.name = "shreya";
    c2.age = 6; 
    c2.name = "shree";
    customer outputResult = youngest(c1, c2);
    System.out.println("The youngest customer is: Name = " + outputResult.name + ", Age = " + outputResult.age);

  }
  public static customer  youngest(customer c1 , customer c2){

    if(c1.age < c2.age){
      return  c1;
    }

    else{
      return c2;
      
    }

  }
  
}

  
