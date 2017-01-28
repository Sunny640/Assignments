package assignments;
import java.util.*;
class BinaryLinearSearch
{
    public static int countNumberOfOccurances(int[] a, int n, int k)
    {
        int i = binarySearch(a, 0, n - 1, k);
        if (i == -1)
        {
            return 0;
        }
        else
        {
            int leftCount = 0;
            if ((i - 1) > 0)
            {
                for (int j = i - 1; j >= 0; j--)
                {
                    if (a[j] == k)
                    {
                        leftCount++;
                    }
                    else
                    {
                        break;
                    }
                }
            }
            int rightCount = 0;
            if ((i + 1) < n)
            {
                for (int j = i + 1; j <= n; j++)
                {
                    if (a[j] == k)
                    {
                        rightCount++;
                    }
                    else
                    {
                        break;
                    }
                }
            }
            return leftCount + 1 + rightCount;
        }
    }
 
    public static int binarySearch(int[] a, int low, int high, int k)
    {
        if (high >= low)
        {
            int mid = (low + high) / 2;
            if (a[mid] == k)
            {
                return mid;
            }
            else if (a[mid] < k)
            {
                return binarySearch(a, mid + 1, high, k);
            }
            else
            {
                return binarySearch(a, low, mid - 1, k);
            }
        } 
         return -1;
    } 
    public static void main(String[] args)
    {
        //  Input Array
        int[] a = { 0,0,0,1,1,1,1,1 };
        //  k - Element to be found
        int k = 1;
        //  n - Size of the array
        int n = a.length;
        System.out.println(countNumberOfOccurances(a, n, k));
    }
}