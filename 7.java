import java.util.Scanner;
class arr{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int arr[],found=0;
        System.out.println("Enter the size of the array here: ");
        int size=sc.nextInt();
        arr=new int[size];
        System.out.println("Enter the "+size +"elements ");
        for(int i=0; i<size; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the elemnt to check : ");
        int num=sc.nextInt();
        for(int i=0;i<size;i++){
            if ( arr[i] == num){
                System.out.println("The number foudn at the "+(i+1)+"th posision");
                break;
            }            }
        }
        
    }
}
