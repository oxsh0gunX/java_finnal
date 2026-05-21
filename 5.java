class cpu{
    int price;
    cpu(int p){
        price=p;
    }
    void display(){
        System.out.println("the cpu price is "+price);
    }
    class core{
        int cores;
        core(int c){
            cores=c;
        }
        void display(){
            System.out.println("the cpu core  is "+cores);
        }
    }
    static class ram {
        int gb;
        ram(int g){
            gb=g;
        }
        void display(){
            System.out.println("the size of the ram is  "+gb);
        }
    }
}


class Main{
    public static void main(String[] args){
        cpu c =new cpu(3500);
        cpu.core cc = c.new core(6);
        // outerObject.new InnerClass()
       cpu.ram r = new cpu.ram(16);
    //   new OuterClass.StaticClass()
    c.display();
    cc.display();
    r.display();
    }
}
