
public class Dog{
   String breed;
   int age;
   String color;
   
   void barking(){
	   System.out.println("Dog is barking...");
   }
   
   void hungry(){
	   System.out.println("Dog is hungry...");
   }
   
   void sleeping(){
	   System.out.println("Dog is sleeping...");
   }
   
   public static void main(String []args){
	      // 下面的语句将创建一个Dog对象
	      Dog dog = new Dog();
	      dog.barking();
	      dog.age = 2;
	      System.out.println(dog.age);
	      
	   }
}

