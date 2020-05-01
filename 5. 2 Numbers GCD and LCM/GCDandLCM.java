import java.util.Scanner;

public class GCDandLCM 
{   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1,n2;
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        gcdLcm(n1,n2);
        sc.close();
    }

    private static void gcdLcm(int n1, int n2) 
    {
        int gcd =1, lcm;
        
        for(int i = 2; i <= n1 && i <= n2; i++)
        {
            if(n1%i == 0 && n2%i == 0)
                gcd = i;
        }
        lcm = (n1 * n2)/gcd;
        
        System.out.println("LCM: " + lcm );
        System.out.println("GCD: " + gcd );        
    }
    
}
