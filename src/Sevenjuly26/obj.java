package Sevenjuly26;

public class obj {
  public static void  main(String[] args){
    Object[] arr = new Object[6];
    arr[0] = "java";
    arr[1] = new Student();
    arr[2]= new Student();
    arr[3] = new Employee();
    arr[4] = "python";
    arr[5] = new Student();
    int countStudent = 0;
    int countEmployee = 0;
    int countUnknown = 0;
    


    for(int i = 0 ;i < arr.length - 1 ;i++){
      Object element = arr[i];
      if(element instanceof Student){
        coutnstudent++ ;
      }else if(element instaceof Employee){
        countEmployee++
      }else if(element instanceof Integer){
        countIntegers++

      }

    }


    

  }  
  void Total(Object[] arr){
    
    

  }
  sout("stufenet objects are " + countstudent);
   sout("stufenet objects are " + countstudent);
    sout("stufenet objects are " + countstudent);

}
