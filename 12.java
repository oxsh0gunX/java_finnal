// person emp teacher
class person{
    int age;
    String name;
    person(int a,String n){
        age=a;
        name=n;
        }
        
}
class emp  extends person{
    String emp_name;
    int emp_id;
    emp(int age ,String name,String en,int ei){
        super(age,name);
        emp_name=en;
        emp_id=ei;
    }
}
class teacher extends emp{
    String sub;
    teacher(int age ,String name,String emp_name,int emp_id,String sb ){
    super(age,name,emp_name,emp_id);
    sub=sb;
    }
    void display(){
        System.out.println("The name of the person is "+name+ " and his age is "+age);
        System.out.println("The name of the employee is "+emp_name+" and  his emp id is "+emp_id);
        System.out.println("The name of the subject is "+ sub);
    }
}
class Main{
    public static void main(String[] args){
        teacher t[] = new teacher[2];
        t[0]= new teacher(12,"safvan","emp safvan",12,"python");
        t[0].display();
        
    }
}
