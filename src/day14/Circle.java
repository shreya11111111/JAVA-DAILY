package day14;

 public class Circle extends Shape{
  int radius;

public Circle(int shapeId , String ShapeName , int radius ){
  super(33, "circle" );
  this.radius = radius ;
}



  public void findArea(){
    System.out.println("findArea of circle child class");
  }
  public void findPerimeter(){
    System.out.println("findperimeter  of circle child class ");
  }
  
}
