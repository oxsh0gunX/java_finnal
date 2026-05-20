class area{
    void area(int a){
        System.out.println("The area of the square is "+ (a*a));
    }
  void  area(double a){
        System.out.println("the area of the circle is "+ (3.14 * a));
    }
   void   area(int l,int b){
        System.out.println("The area of the rectagular is "+ (l*b));
    }
}

class Main{
    public static void main(String[] args){
        area ar=new area();
        ar.area(34);
        ar.area(34*12);
        ar.area(34.2);
        
    }
}
