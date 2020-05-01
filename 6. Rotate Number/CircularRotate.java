import java.util.Scanner;

public class CircularRotate 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int r = sc.nextInt();
        int n = sc.nextInt();
        System.out.println( rotate(n, r) );
        sc.close();
    }

    private static int rotate(int n, int r) 
    {
        int digits = getCount(n);
       
        if( r < 0)
             r = r+digits;
         r= r%digits;
        
         int pow1 =(int)Math.pow(10, digits -r);
         int pow2 = (int)Math.pow(10, r);
         int ans = 0;
         
         ans = n % pow1 * pow2;
         n = n/pow1;
         ans  = ans + n;
         
        return ans;
    }

    private static int getCount(int n) {
        
        return  (int)Math.floor( Math.log10(n) + 1 );
    }   
}
