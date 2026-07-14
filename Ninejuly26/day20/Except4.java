package day20;
public class Except4{
  //class cast exception 

  public static void main(String[] args){
    System.out.println("Start");
    Food f = new Pizza();
    
    f.Fastfood();



  }
}


class Food {
  public static void HealthyFood(){
    System.out.println("this is Healthyfood");
  }

}

class Pizza extends Food {
  public static  void Fastfood(){
    System.out.println("pizza is fast food ");
  }

}
