/* Q-1
we have a string  input  str -> "Hello Aniket".
 output str -> "hEllO AnIkEt"  

 design a method which takes a string argument 
 and return the output as given . 

 Q-2
 Design a method which takes Student object as Arg
 and check Student name containes how many total vowels 
 in end return total count from the method . 

 Q-3

 Create a shape class having variables : 
 ShapeID,ShapeName
 and methods with default (any temp logic) implementation
 findArea() ,displayDetails() and findPerimeter()

 In this class , initialize shapeID, ShapeName 
 by using Parameterize constructor .
 
 now create child class
 circle having 
 variable:
 radius 
 and override method findArea() and findPerimeter()
 according to circle logic.
square having 
 variable:
 side
 and override method findArea() and findPerimeter()
 according to square logic.
//note in both child class.initialize inherited variables by using super call 




*/

package day14;
public class Q1 {
  public static void str( ){
     String s = "hello Aniket";
     int i = 0;
     String v = "aeiou";
     while(i < s.length()){
      if(s.charAt(i)  == v  ){

      }
            
      if(s.charAt(0) == v){

      }

     }
  }

  
}
