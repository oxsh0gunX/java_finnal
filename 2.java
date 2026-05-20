import java.util.*;
class matrix{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int row, col;
        // int sum[][];
        System.out.println("Enter the row and the column number here: ");
        row =sc.nextInt();
        col=sc.nextInt();
        int a[][]=new int[row][col];
        int b[][]=new int[row][col];
        int sum[][]=new int[row][col];
        System.out.println("elments for the fist matrix   : ");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                a[i][j]=sc.nextInt();
            }
        }
        
         System.out.println("elements for the second  matrix   : ");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                b[i][j]=sc.nextInt();
            }
        }
        System.out.println("The sum of the matrix ");
        
        
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                sum[i][j]=a[i][j]+b[i][j];
            }
        }
        
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(sum[i][j] +" ");
            }System.out.println();
        }
        
    }
}
