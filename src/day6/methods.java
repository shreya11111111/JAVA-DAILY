// task 1 :Addition 
// 1 . take the numbers 

package day6;

public class methods {

  public static void main(String[] args){
    System.out.println("main method");
    methods.addition(80,90); // named as actual args --> args 
  }
  

 public static void addition(int a , int b){
  // a = 50 , b = 10; can also declare the values here but when we will declare it then the actual 50 and 10 will be used not the above 80 and 90 values .
    //writeen in paraentheisis is arguments  //formal arguments  --> also known as parameters
   System.out.println("addition method"); 
   int sum =  a + b ;
   System.out.println(a + " + " + b + "= " + sum);

 }

}