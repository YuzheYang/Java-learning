
public class LocalVar{ 
   public void pupAge(){
      int age = 0;
      age = age + 7;
      System.out.println("С����������: " + age);
   }
   
   public static void main(String[] args){
	   LocalVar test = new LocalVar();
      test.pupAge();
   }
}