//wajp to create 1 float  type of  variable and 1 double type of variable as local variables . Now perform multiplication with both variables 



package day5;

public class localvar {

  public static void main(String[] args){
    float f = 3.0f;
    double d = 1.3;
    double multidob = f * d ;//orgrinal oeperation  of multiplication will result in double value 
    float    multi = (float)(f * d );//can also convert into float
    int multiint = (int)(f*d);//can also convert into integer 
    System.out.println("multiplicaiton is : " + multi  + ", "+ multiint + "," + multidob);
  }
  
}
