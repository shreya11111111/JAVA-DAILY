package day13.inheritance;

public class Loops {
  public static void main(String[] args){
    Loops l = new Loops();
    //l.QUE1();
    //System.out.println("ques1 output");
    //l.QUE2();  // we can also call static method with the help of object but its not necessary we can use class name .
    //Ques3();
    //Ques4();
    //Ques5();
    //Ques6();
    Ques7();

    


    }
    
  

  //ques1
  public  void QUE1(){
    int i = 1;
    int j = 10;
    while(i<=j){
      System.out.println(i);
      i = i+1;
    } }

    //ques2 
    public static void QUE2(){
      int i = 20;
      int j = 10;
      while(i >= j){
System.out.println(i);
        i = i - 1;
        
      }
    }

    //ques3 print even no b/w 1 to 10;
    public static void Ques3(){
      int i = 1;
      int j = 10; //local variables of method , non-static
      while(i <= j ){
        
        i = i + 1;
        if(i % 2 == 0){
          System.out.println(i);
        }
        
      }}

      //ques4 
      //odd no between 1 to 10
      public static void Ques4(){
        int i = 1;
        int j = 10;
        while(i<=j){
          
          if(i % 2 != 0){
            System.out.println(i) ;  //ask why cant we use return here 
          }
          i = i+1;
        }
        
      }


      //ques5 even b/w 19 to 9 
      public static void Ques5(){
        int i = 19;
        int j = 9;
        while(i >= j){
          
          if(i % 2 == 0){
            System.out.println(i);
          }
          i = i - 1;
          
        }

      }




      //ques6 odd no btween 20 to 10
      public static void Ques6(){
        int i = 20;
        int j = 10;
        while(i >= j ){
          if(i %2 != 0 ){
            System.out.println(i);
          }
          i=i-1;
        }
      }


      // wajp sum of numbers btween 1 to 5 .

      public static void Ques7(){
        int i = 1;
        int j = 5;
        int sum = 0;
        while(i<=5){
          sum = i + sum;
          i = i +1;
          
          //System.out.println(i);
         //ask by mam 
        }

         System.out.println(sum);
      }
    }



  
  

