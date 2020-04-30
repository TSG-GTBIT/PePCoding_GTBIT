import java.util.Scanner;

public class Pattern16 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printPattern(n);
        sc.close();
    }

    public static void printPattern(int n) {
        int stars = 1;
        int spaces = 2*n -3;
        int count = 1;
        for(int cr = 1; cr <= n; cr++)
        {
            count = 1;
            for(int cst = 1; cst <= stars; cst++)
            {
                System.out.print(count + "\t");
                count++;
            }
            
            for(int csp = 1; csp <= spaces; csp++)
                System.out.print("\t");
            
            count--;
            if(cr == n)
            {
                stars--;
                count--;
            }
            for(int cst = 1; cst <= stars; cst++)
            {
                System.out.print(count + "\t");
                count--;
            }
            stars++;
            spaces -= 2;
            System.out.println();
        }
    }

}
