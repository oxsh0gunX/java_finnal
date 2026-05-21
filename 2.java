import java.util.*;
class Main{
    public static void main(String []args)
    {
        System.out.println("Entert the number of the row and the column here");
        Scanner sc =new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();
        int a[][]=new int[row][col];
        int b[][]=new int[row][col];
        int sum[][]=new int[row][col];
        System.out.println("Enter the number to the 1st  matrix");
        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the number to the 2st  matrix");
        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                b[i][j]=sc.nextInt();
            }
        }
        
        System.out.println("The sum of the matrix is ");
        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                sum[i][j]=a[i][j]+b[i][j];
                
            }
        }
        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
               System.out.print(" "+sum[i][j]+"");
            }
            System.out.println(" ");
        }
        
    }
}
