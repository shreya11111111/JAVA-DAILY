package Sevenjuly26;

public class Student1 {
  public static void main(String[] args){
    String[] names = new String[6];
    names[0] = "Ram";
    names[1] = "Mohan";
    names[2] = "Seeta";
    names[3] = "Geeta";
    names[4] = "Arjun";
    names[5] = "Karan";
    Seq(names);

  }
  public static void Seq( String[] names){

    int i = 0;
    int n = names.length -1 ;
    while(i <= n ){
      System.out.println(names[i]);
      i++;

    }

   
    }

    public static void Vowel(String[] names){

      int i = 0;
      int n = names.length-1;
      while(i<=n){
        System.out.println(names[i]);
        if(names[0].charAt(0) == 'a' || names[0].charAt(0) == 'e'){

        }
          // || names[0] = 'e' || names[0] ='i' || names[0] ='o'|| names[0] ="u"){

      }
     
    }
  
}
