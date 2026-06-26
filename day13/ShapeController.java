package day13;
import java.util.Scanner;

public class ShapeController {

  public static void main(String[] args){
    System.out.println("------Welcome--------");
    System.out.println("Select any Shape");
    System.out.println("press 1 for circle");
    System.out.println("press 2 for square");
    System.out.println("press 3 for rectangle");

    Scanner sc = new Scanner(System.in);
    int input = sc.nextInt();
    if(input == 1){

      //create object of circle

      System.out.println("Select any Shape");
      int id = sc.nextInt();
      System.out.println("Enter Shape Name");
      String name = sc.next();
      System.out.println("Enter color: ");
      String color = sc.next();
      System.out.println("enter radius ");
      double radius = sc.nextDouble();
      Circle c = new Circle(id ,name , color ,radius );
      System.out.println("circle object created successfully");

      System.out.println("Press A\t : area");
      System.out.println("Press A\t :  Perimeter");

      char taskinput = sc.next().charAt(0);
      if(taskinput == 'A' || taskinput == 'a'){
        System.out.println("Area of Circle having radius" + c.radius + " is ");
        System.out.println(c.getArea());


      }else if(taskinput == 'P' || taskinput == 'p'){
        System.out.println("Area of Circle having radius" + c.radius   + " is ");

      }    }

  }
  
  
}
