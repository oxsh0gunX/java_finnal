import java.util.*;
class Emp{
    int id;
    String name;
    Emp(int i,String n){
        id=i;
        name=n;
    }
    void display(){
        System.out.println("The name of the emp is "+name);
        System.out.println("The id of the emp is "+id);
        
    }
}

class Teacher extends Emp{
    String subject;
    Teacher(String s,int id, String name){
        super(id,name);
        subject=s;
    }
    void diplay(){
        super.display();
        System.out.println("the name of the subjectr is an : "+ subject);
    }
}

class Main{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the emp");
        String name=sc.next();
        System.out.println("Enter the id of the emp");
        int id=sc.nextInt();
        System.out.println("Enter the subject name here: ");
        String subject=sc.next();
        Teacher t = new Teacher(subject,id,name);
        t.diplay();
    }
}
