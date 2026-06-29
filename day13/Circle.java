package day13;

public class Circle{
  int ShapeId;
  String shapeName;
  String color;
  double radius;
  public static void main(String[] args){
    Circle c = new Circle(2 , "circlu" , "Yellow" , 45);
    System.out.println(c.shapeName);

    System.out.println(Area(2));
    System.out.println(Peri(4));
  }
  public Circle(){

  }
  public Circle(int ShapeId , String shapeName , String color ,  double  radius){
    this.ShapeId = ShapeId;
    this.shapeName = shapeName;
    this.color = color;
    this.radius = radius;

  }
    public static double Area(double radius){
      return (Math.PI * radius * radius);

    }
    public static double  Peri(double radius){
      return (2 * Math.PI * radius);


    }



  }  

