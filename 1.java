class product{
    int price;
    String name;
    public product(int p,String n){
        price=p;
        name=n;
    }
}

class Main{
    public static void Main(String[] args){
        product p1 = new product(232,"jio");
        product p2 = new product(23,"vi");
        product p3 = new product(12,"airtel");
        product temp =p1;
        if (p2.price < temp.price ){
            temp=p2;
        }
         if(p3.price < temp.price ){
            temp=p3;
        }
        System.out.println("The smallest price product is "+temp.name+" and it price is "+ temp.price);

    }
}
