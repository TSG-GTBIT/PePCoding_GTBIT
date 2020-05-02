import java.util.Scanner;

public class AddingNos 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        int num1 = sc.nextInt();
        int base1 = sc.nextInt();
        int num2 = sc.nextInt();
        int base2 = sc.nextInt();
        int desBase = sc.nextInt();
        sc.close();                 //input ends

        int ans1 = anyBaseToDecimal(num1, base1);
        int ans2 = anyBaseToDecimal(num2, base2);
        System.out.println( decimalToAnyBase(ans1+ans2, desBase) );
    }

    private static int decimalToAnyBase(int num, int base) {
        int pow = 1, rem = 0;
        while(num > 0)
        {
            rem = rem + (num % base) *pow;
            num /= base;
            pow *= 10;
        }
        return rem;
    }

    private static int anyBaseToDecimal(int num, int base) {
        int rem = 0, pow = 1;
        while(num > 0)
        {
            rem = rem + (num%10) * pow;
            num = num/10;
            pow = pow * base;
        }
        return rem;
    }
}
