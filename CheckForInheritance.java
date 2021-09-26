class Rectangle  {
    
    int length=14;
    int breadth =12; 
   
   public void area() {
       System.out.println(length*breadth);
   }
 
}
class Box  extends   Rectangle {
     int height =10;
       public void volume() {
      System.out.println(length*breadth*height);
   }
}
public class CheckForInheritance  {
   public static void main(String[] arguments) {
      Box rect = new Box();
      rect.area();
      rect.volume();
   }
}