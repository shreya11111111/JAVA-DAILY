package day14;

public class ShapeController {
  public static void main(String[] args){
    
    Shape s1 = new Shape(2 , "circle");
    s1.findArea();
    s1.findPerimeter();
    Shape  c1 = new Circle(2 , "circle" , 5);
    c1.findArea();
    

  }
  
}
