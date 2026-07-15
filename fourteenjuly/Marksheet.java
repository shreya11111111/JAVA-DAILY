package fourteenjuly;
public class Marksheet {
  int English;
  int Hindi ; 
  int Maths;
  int Sanskrit;
  

  public Marksheet(int English,
  int Hindi ,
  int Maths ,
  int Sanskrit){
    this.English = English;
    this.Hindi = Hindi;
    this.Maths = Maths;
    this.Sanskrit = Sanskrit;

  }
  public double  getPercentage( ){
    double Add = English+ Hindi + Maths + Sanskrit ; 
    double Percentage = (Add / 400 )*100 ; 
    return Percentage ;

  }
  public String  getFinalGrade( ){
    double Percent = getPercentage();
    if(Percent >= 90  ){
        return "A+";
    }else if(Percent <= 90 && Percent >= 80){
      return  "A";
    }else if(Percent <= 80 && Percent >= 70){
      return "B";}
      else{
        return "C";
      }

  }

  
}
