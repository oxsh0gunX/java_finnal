import java.util.*;
interface sports{
    void Sportsmark();
        
    
}
class Student{
    int mark;
    int rollnumber;
    String name;
     Student(int m,int r,String n){
        mark=m;
        rollnumber=r;
        name=n;
    }
    void display(){
        System.out.println("The name is "+name);
        System.out.println("The roll number  is "+rollnumber);
        System.out.println("The mark is "+mark);
    }
}
class result extends Student implements sports{
    int sports_mark;
     result( int mark,int rollnumber,String name){
        super(mark,rollnumber,name);
        
    }
    public void Sportsmark(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sport makr ");
        sports_mark=sc.nextInt();
        System.out.println("The makr is in the sport is "+ sports_mark);
        
    }
}


class Main{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the makr ,rollnumber and name here: ");
        int mark =sc.nextInt();
        int rollnumber =sc.nextInt();
        String name  =sc.next();
        result r = new result(mark,rollnumber,name);
        r.display();
        r.Sportsmark();
    }
}
