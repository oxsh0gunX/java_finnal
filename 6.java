import java.util.*;
class Sotring{
    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of name you want to enter : ");
        int range=sc.nextInt();
        System.out.println("Enter the name to sort: ");
        String arr[]=new  String [range];
        for(int i=0;i<range;i++){
            arr[i]=sc.next();
        }
        Arrays.sort(arr);
        System.out.println("the sorted array is : ");
        for(int i=0;i<range;i++){
            System.out.println(arr[i]);
        }
    }
}
