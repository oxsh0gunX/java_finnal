class Complex{
    int real;
    int image;
    public  Complex(int r,int i){
        real=r;
        image=i;
    } 
}

class Main{
    public static void main(String[] args ){
        Complex c1=new Complex(2,3);
        Complex c2=new Complex(2,3);
        int realsum=c1.real+c2.real;
        int imgsum=c1.image+c2.image;
        System.out.println(realsum+"+"+imgsum+"i");
    }
}
