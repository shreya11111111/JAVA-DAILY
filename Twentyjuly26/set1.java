package Twentyjuly26;
import java.util.ArrayList;
import java.util.HashSet;

public class set1 {
  public static void main(String[] args){
    ArrayList<Integer> a = new ArrayList<> ();
    a.add(10);
    a.add(3);
    a.add(3);
    a.add(4);
    a.add(5);
    a.add(10);
    a.add(3);
    a.add(5);
    a.add(5);
    a.add(7);
    a.add(9);

    System.out.println(a);
    HashSet uniqueList= new HashSet();
    HashSet<Integer> duplicateList = new HashSet<>();

   
  System.out.println(a);

    
    for(Integer element : a){
        Boolean result = uniqueList.add(a); 
        
    }
    System.out.println(uniqueList);
    }
    


  }
  
