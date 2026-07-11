package Sevenjuly26;
public class Arrays {
  public static void main(String[] args){
    sumOfElement();
    
    


  }
  public static void sumOfElement(){
    float[] nums = new float[5];
    nums[0] = 1.0f ;
    nums[1] = 2.0f ;
    nums[2] = 3.0f ;
    nums[3] = 4.0f ;
    nums[4] = 5.0f ; 
     float sum = nums[0] + nums[nums.length - 1];
    
     if(sum %  2 == 0){
      System.out.println("the sum is even  number");
      
     }
     else{
      System.out.println("sum is odd");
      
     }

  }
}
