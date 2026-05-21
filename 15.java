import java.util.*;
interface shapes{
    void area();
    void perimeter();
}
class rectagle implements shapes{
    int l;
    int b;
    
    void get_data(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the lenght and the bridth here: ");
        l= sc.nextInt();
        b=sc.nextInt();
    
    }
    public void area(){
        System.out.println("The are is "+(l*b));
    }
    public void perimeter(){
        System.out.println("the perminter is "+(2*(l*b)));
    }
    
}
class circle implements shapes {
  double r; 
  void get_data(){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the radios of the circle: ");
      r=sc.nextDouble();
  }
  public void area(){
      System.out.println("The are is "+(3.14 * r));
  }
  public void perimeter(){
      System.out.println("the perimeter is : "+ (2* 3.14*r));
  }
}



class Main{
    public static void main(String[] args){
        System.out.println("Enter the option :");
        System.out.print("1) circle 2)rectagular");
        Scanner sc = new Scanner(System.in);
        circle c = new circle();
        rectagle r = new rectagle();
        int choice =sc.nextInt();
        if (choice == 1){
            c.get_data();
            c.area();
            c.perimeter();
        }else if (choice == 2){
            r.get_data();
            r.area();
            r.perimeter();
        }
        
    }
}
