import java.util.*;
class Main{
    public static  void main(String[] args){
        System.out.println("Enter the size of the array");
        Scanner sc = new Scanner(System.in);
        int range=sc.nextInt();
        int arr[]=new int[range];
        System.out.println("Enter the elements to arrya here : ");
        for(int i=0;i<range;i++){
            arr[i]=sc.nextInt();
            
        }
        System.out.println("Enter the number to search:");
        int number =sc.nextInt();
        for(int i=0;i<range;i++){
            if(arr[i]==number){
                System.out.println("the number found at the posotion "+(i+1));
            }

        }
        
        
    }
}
