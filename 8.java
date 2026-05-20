import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the string here: ");
        String str=sc.nextLine();
        System.out.println("The upper case of th String is "+ str.toUpperCase());
        System.out.println("The lower case of th String is "+ str.toLowerCase());
        System.out.println("The Length  of th String is "+ str.length());
        System.out.println("The concat of th String is "+ str.concat("umbikko "));
        System.out.println("The replace  of th String is "+ str.replace('a','k'));
        System.out.println("trim  of the string is  "+ str.trim());
        
    }
}
