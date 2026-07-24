package Twentyonejuly;
import java.util.ArrayList;
public class rem1 {
  public static void main(String[] args) {
      
  

  ArrayList<Integer> list3 = new ArrayList<Integer>() ;
  list3.add(22);
  list3.add(44);
  list3.add(55);
  list3.add(20);

  ArrayList<Integer> multipleList  = new ArrayList<> ();
  
  


  Integer obj = 45;
  
  int count = 0;
  for (int i = 0; i < list3.size(); i++) {
    Integer element = list3.get(i);
    if (element % 5 == 0) {
      count++;
      multipleList.add(element);
    }
  }

  //  for obj separately
  if (list3.contains(obj)) {
    System.out.println("element found");
  } else {
    System.out.println("element not found");
  }

  System.out.println(multipleList);
  System.out.println(list3);

}

}

  
   
  






   //ArrayList<Integer> list9 = new ArrayList<Integer>() ;
  //list9.add(22);
  //list9.add(44);


  

