import java.util.*;

public class StudentChaining {

    public static void main(String[] args) throws Exception {
        // write your code here
        int i , j , n, m, r;
         Scanner sc = new Scanner(System.in);
        
        n = sc.nextInt();
        m = sc.nextInt();
        r = sc.nextInt();

        int a[][] = new int[n][m];
        for(i = 0; i < n; i++)
            for(j = 0; j < m; j++)
                a[i][j] = sc.nextInt();
        
        twoDRotate(a, n, m, r);

    }
    
    static void twoDRotate(int a[][], int row, int col, int r)
    {
        int i;
        int totalEle = row*col, curEle = 0;
        int top = 0, bottom = row-1;
        int left = 0, right = col-1;
        
        while(curEle < totalEle)
        {
            int topCopy = top;
            int bottomCopy = bottom;
            int rightCopy = right;
            int leftCopy = left;
            
            int k = -1;
            int size = 2*(right-left+bottom-top);
            if(size == 0)
                break;
            int temp[] = new int[size];
            // System.out.println("Size : "+ size);
            
            //FIRST ITERATION
            //top from left to right
            for(i = left; i <= right && curEle < totalEle; i++)
            {
                curEle++;
                k++;
                temp[k] = a[top][i]; 
                //System.out.println(a[top][i]);
            }
            top++;
            
            //right from top to bottom
            for(i = top; i <= bottom && curEle < totalEle; i++)
            {
                curEle++;
                k++;
                temp[k] = a[i][right]; 
               // System.out.println(a[i][right]);
            }
            right--;
            
            //bottom from right to left
            for(i = right; i >= left && curEle < totalEle; i--)
            {
                curEle++;
                k++;
                temp[k] = a[bottom][i]; 
                //System.out.println(a[bottom][i]);
            }
            bottom--;
            
            //left from bottom to top
            for(i = bottom; i >= top && curEle < totalEle; i--)
            {
                curEle++;
                k++;
                temp[k] = a[i][left]; 
                //System.out.println(a[i][left]);
            }
            left++;
         rotate(temp, size, r);

      //SECOND ITERATION
         int curCopy = 0;
         k = 0;
        while(k < size)
        {
            //top from left to right
            for(i = leftCopy; i <= rightCopy && curCopy <= curEle; i++)
            {
                curCopy++;
               a[topCopy][i] = temp[k]; 
               k++;
            }
            topCopy++;
            
            //right from top to bottom
            for(i = topCopy; i <= bottomCopy && curCopy <= curEle; i++)
            {
                curCopy++;
                a[i][rightCopy] = temp[k]; 
                k++;
            }
            rightCopy--;
            
            //bottom from right to left
            for(i = rightCopy; i >= leftCopy && curCopy <= curEle; i--)
            {
                curCopy++;
                a[bottomCopy][i] = temp[k];
                k++;
            }
            bottomCopy--;
            
            //left from bottom to top
            for(i = bottomCopy; i >= topCopy && curCopy <= curEle; i--)
            {
                curCopy++;
                a[i][leftCopy] = temp[k];
                k++;
            }
            leftCopy--;

        }
            
      } //outer while ends
        display(a);
    }

    private static void rotate(int[] a,int n, int r) 
    {
        r = r%n;
        if( r <  0)
            r = r+n;
        
        reverse(a, 0, r-1);
        reverse(a, r, n-1);
        reverse(a,0, n-1);
        
    }

    private static void reverse(int[] a, int l, int h) 
    {
        int temp;
        while( l < h)
        {
            temp = a[l];
            a[l] = a[h];
            a[h] = temp;
            l++;
            h--;
        }
    }

    public static void display(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
   
}
